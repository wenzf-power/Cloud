package com.wzf.kafkademo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Author: wenzf
 * @Date 2021-8-9
 * @Description:
 */
@Component
public class Consumer {
    @KafkaListener(topics = "user")
    public void consumer(ConsumerRecord consumerRecord) {
        Optional<Object> kafkaMassage = Optional.ofNullable(consumerRecord.value());
        if (kafkaMassage.isPresent()) {
            Object o = kafkaMassage.get();
            System.out.println(o + "ssssss");
        }
    }
}
