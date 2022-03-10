方案一：Spring Data Redis
引入了 Spring Data Redis ，并且配置了Redis 的基本信息
Spring Data Redis + 连接池（commos-pool2）

方案二：Spring Cache
通过 Spring Cache 的缓存形式来操作 Redis

方案三：回归原始时代
直接使用 Jedis 或者 其他的客户端工具来操作 Redis