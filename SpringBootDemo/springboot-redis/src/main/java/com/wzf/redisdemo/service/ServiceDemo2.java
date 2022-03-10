package com.wzf.redisdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * @Author: wenzf
 * @Date 2022-2-10
 * @Description:
 */
@Service
public class ServiceDemo2 {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public void hello() {
        ValueOperations ops = stringRedisTemplate.opsForValue();
        ops.set("service2", "serviceDemo2");
        Object k1 = ops.get("service2");
        System.out.println(k1);
    }

}
