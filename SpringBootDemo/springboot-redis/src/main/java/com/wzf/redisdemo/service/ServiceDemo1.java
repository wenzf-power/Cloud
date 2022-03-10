package com.wzf.redisdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

/**
 * @Author: wenzf
 * @Date 2022-2-10
 * @Description:
 */
@Service
public class ServiceDemo1 {
    @Autowired
    RedisTemplate redisTemplate;

    public void hello() {
        //redisTemplate.setKeySerializer(new StringRedisSerializer());
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("service1", "serviceDemo1");
        Object k1 = ops.get("service1");
        System.out.println(k1);
    }
}
/**
 * 补充:RedisTemplate 中，key 默认的序列化方案是 JdkSerializationRedisSerializer
 * 在 StringRedisTemplate 中，key 默认的序列化方案是 StringRedisSerializer ，因此，如果使用 StringRedisTemplate ，默认情况下 key 前面不会有前缀
 */

