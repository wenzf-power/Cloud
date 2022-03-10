springboot 操作redis的三种方案
方案一：Spring Data Redis

    提供了两个 Bean ，RedisTemplate 和 StringRedisTemplate ，其中 StringRedisTemplate 是 RedisTemplate 的子类，
    两个的方法基本一致，不同之处主要体现在操作的数据类型不同，RedisTemplate 中的两个泛型都是 Object ，
    意味者存储的 key 和 value 都可以是一个对象，而 StringRedisTemplate 的 两个泛型都是 String ，意味者 StringRedisTemplate 的 key 和 value 都只能是字符串。

    Redis 中的数据操作，大体上来说，可以分为两种：  
     针对 key 的操作，相关的方法就在 RedisTemplate 中 
     针对具体数据类型的操作，相关的方法需要首先获取对应的数据类型，获取相应数据类型的操作方法是 opsForXXX

    RedisTemplate 中，key 默认的序列化方案是 JdkSerializationRedisSerializer 。
    而在 StringRedisTemplate 中，key 默认的序列化方案是 StringRedisSerializer ，
    因此，如果使用 StringRedisTemplate ，默认情况下 key 前面不会有前缀。

方案二：Spring Cache
        
方案三：回归原始时代：直接使用 Jedis 或者 其他的客户端工具来操作 Redis