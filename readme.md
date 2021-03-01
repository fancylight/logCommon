# 概述
本模块定义了关于日志的一些使用场景接口,以及定义了ws接口用于向前台发送日志以及系统监听信息,
参考了[Base Admin](https://github.com/huanzi-qch/base-admin)
## 使用说明
### 通用工具类使用
场景说明:
- 系统初始化:使用info输出
- 异常:使用error|warn输出
- 大量业务以及触及数据库处理:关键点使用info,大量重复操作使用debug
----
实现说明:
1. 使用aop拦截service,用于输出耗时
2. aop匹配形参包含了httpContext,用于输入访问ip等信息
3. 实现通用类处理提供上述场景接口
### 访问路径
`/mvc/view/logging`:实时日志,`mvc/view/monitor`:实时监控