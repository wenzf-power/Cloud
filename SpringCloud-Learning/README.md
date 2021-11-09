# springcloud-learning
## 简介
使用Spring Cloud大部分核心组件搭建的 32个Demo Application应用场景训练学习

## 项目结构

``` lua
springcloud-learning
├── eureka-server -- eureka注册中心
├── eureka-security-server -- 带登录认证的eureka注册中心
├── eureka-client -- eureka客户端
├── user-service -- 提供User对象CRUD接口的服务
├── ribbon-service -- ribbon服务调用测试服务
├── hystrix-service -- hystrix服务调用测试服务
├── turbine-service -- 聚合收集hystrix实例监控信息的服务
├── hystrix-dashboard -- 展示hystrix实例监控信息的仪表盘
├── feign-service -- feign服务调用测试服务
├── zuul-proxy -- zuul作为网关的测试服务
├── config-server -- 配置中心服务
├── config-security-server -- 带安全认证的配置中心服务
├── config-client -- 获取配置的客户端服务
├── consul-config-client -- 用于演示consul作为配置中心的consul客户端
├── consul-user-service -- 注册到consul的提供User对象CRUD接口的服务
├── consul-service -- 注册到consul的ribbon服务调用测试服务
├── api-gateway -- gateway作为网关的测试服务
├── admin-server -- admin监控中心服务
├── admin-client -- admin监控中心监控的应用服务
├── admin-security-server -- 带登录认证的admin监控中心服务
├── oauth2-server -- oauth2认证测试服务
├── oauth2-jwt-server -- 使用jwt的oauth2认证测试服务
├── oauth2-client -- 单点登录的oauth2客户端服务
├── nacos-config-client -- 用于演示nacos作为配置中心的nacos客户端
├── nacos-user-service -- 注册到nacos的提供User对象CRUD接口的服务
├── nacos-ribbon-service -- 注册到nacos的ribbon服务调用测试服务
├── sentinel-service -- sentinel功能测试服务
├── seata-order-service -- 整合了seata的订单服务
├── seata-storage-service -- 整合了seata的库存服务
├── seata-account-service -- 整合了seata的账户服务
├── micro-oauth2 -- Gateway + Oauth2 实现统一认证和鉴权
└── micro-knife4j -- Gateway + Knife4j聚合API文档
```
