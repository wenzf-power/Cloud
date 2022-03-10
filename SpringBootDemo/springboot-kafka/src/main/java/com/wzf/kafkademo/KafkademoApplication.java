package com.wzf.kafkademo;

import com.wzf.kafkademo.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class KafkademoApplication {
    @Autowired
    private Product product;

    @PostConstruct
    public void init() {
        for (int i = 0; i < 10; i++) {
            product.send("abc" + i);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkademoApplication.class, args);
    }

}
