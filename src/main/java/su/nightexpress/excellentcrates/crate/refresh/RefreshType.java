package su.nightexpress.excellentcrates.crate.refresh;

import org.jetbrains.annotations.NotNull;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public enum RefreshType {

    DAILY("daily") {
        @Override
        public LocalDateTime nextRefresh(@NotNull LocalDateTime now, @NotNull String day, @NotNull LocalTime time) {
            LocalDateTime refresh = now.toLocalDate().atTime(time);
            return now.isBefore(refresh) ? refresh : refresh.plusDays(1);
        }
    },
    WEEKLY("weekly") {
        @Override
        public LocalDateTime nextRefresh(@NotNull LocalDateTime now, @NotNull String day, @NotNull LocalTime time) {
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
            LocalDateTime refresh = now.with(TemporalAdjusters.nextOrSame(dayOfWeek)).toLocalDate().atTime(time);
            return now.isBefore(refresh) ? refresh : refresh.plusWeeks(1);
        }
    },
    MONTHLY("monthly") {
        @Override
        public LocalDateTime nextRefresh(@NotNull LocalDateTime now, @NotNull String day, @NotNull LocalTime time) {
            int target = Integer.parseInt(day.trim());
            LocalDateTime refresh = atDayOfMonth(now.toLocalDate(), target).atTime(time);
            // If the moment already passed this month, roll over to the next month and re-clamp the day.
            return now.isBefore(refresh) ? refresh : atDayOfMonth(refresh.toLocalDate().plusMonths(1), target).atTime(time);
        }

        @NotNull
        private LocalDate atDayOfMonth(@NotNull LocalDate reference, int day) {
            return reference.withDayOfMonth(Math.min(day, reference.lengthOfMonth()));
        }
    },
    YEARLY("yearly") {
        @Override
        public LocalDateTime nextRefresh(@NotNull LocalDateTime now, @NotNull String day, @NotNull LocalTime time) {
            String[] split = day.split("-");
            int month = Integer.parseInt(split[0].trim());
            int dayOfMonth = Integer.parseInt(split[1].trim());
            LocalDateTime refresh = now.withMonth(month).withDayOfMonth(dayOfMonth).toLocalDate().atTime(time);
            return now.isBefore(refresh) ? refresh : refresh.plusYears(1);
        }
    };

    private final String id;

    RefreshType(@NotNull String id) {
        this.id = id;
    }

    @NotNull
    public String id() {
        return this.id;
    }

    /**
     * Computes the next date-time this crate should refresh at, based on the current moment.
     *
     * @param now  the current local date-time.
     * @param day  the configured refresh day (unused for {@link #DAILY}).
     * @param time the configured refresh time of day.
     * @return the next refresh moment, always strictly after {@code now}.
     */
    @NotNull
    public abstract LocalDateTime nextRefresh(@NotNull LocalDateTime now, @NotNull String day, @NotNull LocalTime time);
}
