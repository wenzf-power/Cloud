package com.wzf.kafkademo.product;


import com.alibaba.fastjson.JSON;
import com.wzf.kafkademo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @Author: wenzf
 * @Date 2021-8-9
 * @Description:
 */
@Component
public class Product {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String name) {
        User u = new User();
        u.setName(name);
        u.setAge(12);
        kafkaTemplate.send("user", JSON.toJSONString(u));
    }
}
