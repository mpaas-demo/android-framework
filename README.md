# android-framework
## 介绍
本 demo 用于演示框架能用组件的使用方式，包括 Application，Service，BroadcastReceiver, Pipeline 文档链接：本demo 为热修复的单组件demo，clone 后直接运行工程即可。

## 支持基线与接入方式
本 demo 是基于68基线的

+ hotpatch_aar 目录下是aar 接入方式的 demo
+ hotpatch_inside 目录下是 inside 接入方式的 demo

### 切换基线
demo采用的是2020.04.02为止的最新的基线版本68，可以通过插件的方式进行基线的升级切换到您需要的基线，但是无法通过插件直接操作降级，降级需要删除mpaas_packages.json文件，然后再通过插件升级到指定的基线，注意在删除mpaas_packages.json文件之前需要通过组件管理查看一下 demo 中依赖的组件信息，升级后需要手动安装这些组件 demo 才能运行正常。

基线的升级操作可以参见文档 https://help.aliyun.com/document_detail/106337.html?spm=a2c4g.11186623.6.559.11775093IhVL1x
