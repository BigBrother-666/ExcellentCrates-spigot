package su.nightexpress.excellentcrates.crate.refresh;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.nightexpress.nightcore.config.FileConfig;
import su.nightexpress.nightcore.config.Writeable;
import su.nightexpress.nightcore.util.TimeUtil;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class RefreshSettings implements Writeable {

    private boolean     enabled;
    private RefreshType type;
    private String      day;
    private LocalTime   time;

    public RefreshSettings(boolean enabled, @NotNull RefreshType type, @NotNull String day, @NotNull LocalTime time) {
        this.enabled = enabled;
        this.type = type;
        this.day = day;
        this.time = time;
    }

    @NotNull
    public static RefreshSettings disabled() {
        return new RefreshSettings(false, RefreshType.DAILY, "", LocalTime.MIDNIGHT);
    }

    @NotNull
    public static RefreshSettings read(@NotNull FileConfig config, @NotNull String path) {
        boolean enabled = config.getBoolean(path + ".Enabled");

        RefreshType type = RefreshType.DAILY;
        String rawType = config.getString(path + ".Type");
        if (rawType != null) {
            try {
                type = RefreshType.valueOf(rawType.trim().toUpperCase());
            }
            catch (IllegalArgumentException exception) {
                enabled = false;
            }
        }

        String day = config.getString(path + ".Day", "").trim();

        LocalTime time = LocalTime.MIDNIGHT;
        String rawTime = config.getString(path + ".Time", "00:00");
        if (rawTime != null) {
            try {
                time = LocalTime.parse(rawTime.trim());
            }
            catch (Exception exception) {
                enabled = false;
            }
        }

        return new RefreshSettings(enabled, type, day, time);
    }

    @Override
    public void write(@NotNull FileConfig config, @NotNull String path) {
        config.set(path + ".Enabled", this.enabled);
        config.set(path + ".Type", this.type.name());
        config.set(path + ".Day", this.day);
        config.set(path + ".Time", this.time.toString());
    }

    /**
     * @return the epoch-millis timestamp of the next refresh, or {@code 0L} if refresh is disabled or misconfigured.
     */
    public long generateCooldownTimestamp() {
        if (!this.enabled) return 0L;

        try {
            LocalDateTime next = this.type.nextRefresh(LocalDateTime.now(), this.day, this.time);
            return TimeUtil.toEpochMillis(next);
        }
        catch (Exception exception) {
            return 0L;
        }
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @NotNull
    public RefreshType getType() {
        return this.type;
    }

    public void setType(@NotNull RefreshType type) {
        this.type = type;
    }

    @NotNull
    public String getDay() {
        return this.day;
    }

    public void setDay(@Nullable String day) {
        this.day = day == null ? "" : day;
    }

    @NotNull
    public LocalTime getTime() {
        return this.time;
    }

    public void setTime(@NotNull LocalTime time) {
        this.time = time;
    }
}
