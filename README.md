<b>ExcellentCrates</b> is simple yet advanced Spigot crates plugin with a lot of unique and useful features with in-game
editor.


## 新增功能
### 设置crate固定刷新时间
通过新增crate配置文件（位于plugins\ExcellentCrates\crates）的属性来设置固定刷新时间，格式如下：
```yaml
Opening:
  # 插件自带的配置，不需要删除或修改
  Cooldown: 86400
  
  # 以下是新增的配置
  Refresh:
    # 必填，支持的RefreshType: daily,weekly,monthly,yearly （不区分大小写）
    RefreshType: 'yearly'
    # 当RefreshTypewei是daily时，不用填写RefreshDay
    # 当RefreshTypewei是weekly时，RefreshDay支持的参数：MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY （不区分大小写）
    # 当RefreshTypewei是monthly时，RefreshDay填写一个数字，代表每月的刷新日
    # 当RefreshTypewei是yearly时，RefreshDay填写一个日期，代表每年的刷新日，格式：月份-日期
    RefreshDay: '11-16'
    # 必填，刷新时间，格式：时:分:秒，秒不是必填项，范围 00:00:00——23:59:59
    RefreshTime: '12:00'
```
以下均为有效的配置
```yaml
Opening:
  # 每天00:00刷新
  Refresh:
    RefreshType: 'daily'
    RefreshTime: '00:00'
```
```yaml
Opening:
  # 每周六1点刷新
  Refresh:
    RefreshType: 'weekly'
    RefreshDay: 'SATURDAY'
    RefreshTime: '01:00'
```
```yaml
Opening:
  # 每月31日12点刷新，若当前月份最大日期<31，则最后一天刷新
  Refresh:
    RefreshType: 'monthly'
    RefreshDay: '31'
    RefreshTime: '12:00'
```
```yaml
Opening:
  # 每年11月16日20点刷新
  Refresh:
    RefreshType: 'yearly'
    RefreshDay: '11-16'
    RefreshTime: '20:00'
```
每次添加/修改配置后需要输入`/crate reload`重载。