# About
<div align="center">
  <img src="https://nightexpressdev.com/excellentcrates/header.png">

<a href="https://discord.gg/EwNFGsnGaW"><img src="https://img.shields.io/discord/903053383475277844?style=for-the-badge&label=Discord&color=%2333a8ff"></a>
<a href="https://ko-fi.com/nightexpress"><img src="https://img.shields.io/badge/donate-%E2%9D%A4%EF%B8%8F_to_support-dff33?style=for-the-badge"></a>
<a href="https://nightexpressdev.com/excellentcrates/"><img src="https://img.shields.io/badge/wiki-documentation-ff9c33?style=for-the-badge"></a>

  ![](https://repo.nightexpressdev.com/api/badge/latest/releases/su/nightexpress/excellentcrates/ExcellentCrates?color=40c14a&name=ExcellentCrates&prefix=v)

**ExcellentCrates** is a lightweight, feature rich and highly customizable crates plugin.

<img src="https://nightexpressdev.com/img/excellentcrates/crate_editor.gif"><img src="https://nightexpressdev.com/img/excellentcrates/gui_opening.gif">
<img src="https://nightexpressdev.com/img/excellentcrates/block_opening.gif"><img src="https://nightexpressdev.com/img/excellentcrates/promo_crate_preview.gif">
<img src="https://nightexpressdev.com/img/excellentcrates/selective_opening.gif">
</div>

## Features
- [**GUI Editor**](https://nightexpressdev.com/excellentcrates/editor-gui/). Manage your crates, rewards and keys right in game!
- [**Custom Item Support**](https://nightexpressdev.com/excellentcrates/hooks/custom-items/). Supports custom item plugins, such as Nexo, ItemsAdder, Oraxen, ExecutableItems, MMOItems, etc.
- [**Built-in Holograms**](https://nightexpressdev.com/excellentcrates/hooks/holograms/). Display custom holograms above crate blocks!
- [**Particle Effects**](https://nightexpressdev.com/excellentcrates/crates/placement#particle-effects). Display amazing particles around crate blocks!
- [**Crate Items**](https://nightexpressdev.com/excellentcrates/crates/appearance/). Give crates directly to player's inventories!
- [**Crate Blocks**](https://nightexpressdev.com/excellentcrates/crates/placement). Create crate zones by linking crates with any blocks!
- [**Physical Keys**](https://nightexpressdev.com/excellentcrates/keys/setup/). Give crate keys directly to player's inventories!
- [**Virtual Keys**](https://nightexpressdev.com/excellentcrates/keys/virtual-keys/). Keep crate keys as virtual to prevent sharing, trading or selling them!
- [**Custom Previews**](https://nightexpressdev.com/excellentcrates/crates/previews/). Create custom and unique preview GUI for every crate!
- [**Custom Openings**](https://nightexpressdev.com/excellentcrates/crates/openings/). Crate custom and unique opening GUI for every crate!
- [**Milestones**](https://nightexpressdev.com/excellentcrates/crates/milestones/). Reward players for opening certain amount of a crate in a row!
- Mass Open. Open all your crate keys in a single click!
- [**Open Cooldown**](https://nightexpressdev.com/excellentcrates/crates/open-cooldown/). Set per player open cooldown for a crate!
- [**Open Cost**](https://nightexpressdev.com/excellentcrates/crates/open-cost/). Set per player currency cost to open a crate!
- [**Permission Requirements**](https://nightexpressdev.com/excellentcrates/crates/open-permission/). Assign permission requirement to a crate!
- [**Key Requirements**](https://nightexpressdev.com/excellentcrates/crates/key-requirements/). Assign multiple key requirements to the same crate!
- Pushback. Push players away from a crate block if they don't met the requirements!
- [**Rarities**](https://nightexpressdev.com/excellentcrates/rewards/rarity-weights/). Split your rewards by rarity affecting their roll chance!
- [**Weights**](https://nightexpressdev.com/excellentcrates/rewards/rarity-weights/). Balance your reward's and rarity's chances with auto-scalable weight system!
- Selectable Rewards. Select rewards from a crate with no gambling!
- [**Reward Types**](https://nightexpressdev.com/excellentcrates/rewards/setup/). Create Item or Command rewards!
- [**Reward Items**](https://nightexpressdev.com/excellentcrates/rewards/setup#setup-item-reward). Bundle up to 27 custom items per Item Reward!
- [**Reward Commands**](https://nightexpressdev.com/excellentcrates/rewards/setup#setup-command-reward). Bundle unlimited amount of commands per Command Reward!
- [**Reward Permissions**](https://nightexpressdev.com/excellentcrates/rewards/permissions/). Prevent players from receiving a reward if they do/don't have certain permissions!
- Reward Broadcast. Broadcast a custom message when player received certain reward(s)!
- [**Reward Limits**](https://nightexpressdev.com/excellentcrates/rewards/roll-limits/). Limit how many times a reward can be rolled out on global and/or per-player basis!
- Reward Logs. Log all reward rolls in a dedicated log file!
- [**PlaceholderAPI**](https://nightexpressdev.com/excellentcrates/hooks/placeholder_api/) Support!

## System Requirements
- Server Software: [**Spigot**](https://www.spigotmc.org/link-forums/88/) or [**Paper**](https://papermc.io/downloads/paper)
- Server Version: <span style="color:red">**1.21.8**</span> or above
- Java Version: [**21**](https://adoptium.net/temurin/releases) or above
- Dependencies:
    - [**nightcore**](https://nightexpressdev.com/nightcore/) - Plugin engine.
- Optional Plugins:
    - [**PacketEvents**](https://spigotmc.org/resources/80279/) or [**ProtocolLib**](https://ci.dmulloy2.net/job/ProtocolLib/) - Crate holograms.
- Folia Supported: <span style="color:red">**No**</span>
- Forge Supported: <span style="color:red">**No**</span>

## Links
- [SpigotMC](https://spigotmc.org/resources/48732/)
- [Hangar](https://hangar.papermc.io/NightExpress/ExcellentCrates)
- [Modrinth](https://modrinth.com/plugin/excellentcrates)
- [Documentation](https://nightexpressdev.com/excellentcrates/)
- [Developer API](https://nightexpressdev.com/excellentcrates/developer-api/)

## Donate
If you like my work or enjoy using my plugins, feel free to [Buy me a coffee](https://ko-fi.com/nightexpress) :) Thank you! 🧡

# 新增功能

## 固定时间刷新（Fixed-Time Refresh）

在原版“开箱冷却（OpeningCooldown）”的基础上，新增按固定时间点刷新的冷却模式。启用后，开箱冷却不再是固定冷却 N 秒，而是持续到下一个指定的刷新时间点。

在 crate 配置文件（位于 `plugins/ExcellentCrates/crates/` 目录下）中新增 `RefreshCooldown` 配置节：

```yaml
# 必须先启用原版开箱冷却，固定时间刷新才会生效
OpeningCooldown:
  Enabled: true
  Value: 86400   # 作为兜底值：当 RefreshCooldown 未启用或配置有误时，回退到该秒数冷却

# 以下为新增配置
RefreshCooldown:
  # 是否启用固定时间刷新。为 true 时覆盖上面的 Value，改为按固定时间点刷新
  Enabled: true
  # 刷新类型，支持：DAILY / WEEKLY / MONTHLY / YEARLY（不区分大小写）
  Type: 'YEARLY'
  # 刷新日，含义随 Type 变化：
  #   DAILY   —— 不需要填写，留空即可
  #   WEEKLY  —— 星期几：MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY（不区分大小写）
  #   MONTHLY —— 每月的第几天（1-31）。若当月天数不足，则取当月最后一天
  #   YEARLY  —— 每年的日期，格式：月-日（例如 11-16）
  Day: '11-16'
  # 刷新时间，格式 时:分 或 时:分:秒，范围 00:00:00 ~ 23:59:59
  Time: '12:00'
```

以下均为有效配置：

```yaml
RefreshCooldown:
  # 每天 00:00 刷新
  Enabled: true
  Type: 'DAILY'
  Time: '00:00'
```

```yaml
RefreshCooldown:
  # 每周六 01:00 刷新
  Enabled: true
  Type: 'WEEKLY'
  Day: 'SATURDAY'
  Time: '01:00'
```

```yaml
RefreshCooldown:
  # 每月 31 号 12:00 刷新；若当月最大天数 < 31，则取当月最后一天
  Enabled: true
  Type: 'MONTHLY'
  Day: '31'
  Time: '12:00'
```

```yaml
RefreshCooldown:
  # 每年 11 月 16 日 20:00 刷新
  Enabled: true
  Type: 'YEARLY'
  Day: '11-16'
  Time: '20:00'
```

说明：
- 固定时间刷新依赖原版的 `OpeningCooldown`，请确保 `OpeningCooldown.Enabled: true`。
- 拥有开箱冷却豁免权限（`excellentcrates.bypass.crate.opencooldown`）的玩家不受冷却限制。
- 刷新时间基于服务器所在时区计算。
- 每次新增或修改配置后，需执行 `/crate reload` 重载。