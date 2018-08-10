# SpringCloudDemo


虽然项目里有用到SpringCloud但是一直没有系统的去整理学习过，最近在系统的走遍各种知识同时会写点Demo

### 简介

在微服务架构中，需要几个基础的服务治理组件，包括**服务注册与发现、服务消费、负载均衡、断路器、智能路由、配置管理**等，由这几个基础组件相互协作，共同组建了一个简单的微服务系统。一个简答的微服务系统如下图：

### Spring Cloud的核心特性： 

- 分布式/版本化配置
- 服务注册和发现
- 路由
- 服务和服务之间的调用
- 负载均衡
- 断路器
- 分布式消息传递

### 整体来看组件

![微服务](https://github.com/shanyao19940801/SpringCloudDemo/blob/master/image/cloud02.png)

从上图可以看出Spring Cloud各个组件相互配合，合作支持了一套完整的微服务架构。 

- 其中Eureka负责服务的注册与发现，很好将各服务连接起来
- Hystrix 负责监控服务之间的调用情况，连续多次失败进行熔断保护。
- Hystrix dashboard,Turbine 负责监控 Hystrix的熔断情况，并给予图形化的展示
- Spring Cloud Config 提供了统一的配置中心服务
- 当配置文件发生变化的时候，Spring Cloud Bus 负责通知各服务去获取最新的配置信息
- 所有对外的请求和服务，我们都通过Zuul来进行转发，起到API网关的作用
- 监控我们使用Sleuth+Zipkin+springAdmin将所有的请求数据记录下来，方便我们进行后续分析

![tu1](https://github.com/shanyao19940801/SpringCloudDemo/blob/master/image/cloud01.png)

### 各个组件
[断路器](https://github.com/shanyao19940801/SpringCloudDemo/blob/master/files/%E6%96%AD%E8%B7%AF%E5%99%A8.md)

[路由网关](https://github.com/shanyao19940801/SpringCloudDemo/blob/master/files/%E7%BD%91%E5%85%B3.md)
 
[分布式配置中心](https://github.com/shanyao19940801/SpringCloudDemo/blob/master/files/%E5%88%86%E5%B8%83%E5%BC%8F%E9%85%8D%E7%BD%AE%E4%B8%AD%E5%BF%83.md)
 
[消息总线](https://github.com/shanyao19940801/SpringCloudDemo/blob/master/files/%E6%B6%88%E6%81%AF%E6%80%BB%E7%BA%BF.md)


* 网页参考：

	[参考](https://blog.csdn.net/forezp/article/details/70148833/)
