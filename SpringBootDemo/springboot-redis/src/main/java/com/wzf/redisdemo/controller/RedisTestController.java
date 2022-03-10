package com.wzf.redisdemo.controller;

import com.wzf.redisdemo.service.ServiceDemo1;
import com.wzf.redisdemo.service.ServiceDemo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wenzf
 * @Date 2022-2-10
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class RedisTestController {

    @Autowired
    ServiceDemo1 serviceDemo1;

    @Autowired
    ServiceDemo2 serviceDemo2;

    @GetMapping("/demo1")
    public String demo1() {
        serviceDemo1.hello();
        return "OK";
    }

    @GetMapping("/demo2")
    public String demo2() {
        serviceDemo2.hello();
        return "OK";
    }
}
