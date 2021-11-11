package com.wzf.cloud.controller;

import com.wzf.cloud.api.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public CommonResult hello() {
        return CommonResult.success("Hello World.");
    }

}
