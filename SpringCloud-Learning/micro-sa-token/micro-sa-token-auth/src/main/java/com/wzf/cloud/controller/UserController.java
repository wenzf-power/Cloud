package com.wzf.cloud.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import com.wzf.cloud.api.CommonResult;
import com.wzf.cloud.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义Oauth2获取令牌接口
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestParam String username, @RequestParam String password) {
        SaTokenInfo saTokenInfo = userService.login(username, password);
        if (saTokenInfo == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", saTokenInfo.getTokenValue());
        tokenMap.put("tokenHead", saTokenInfo.getTokenName());
        return CommonResult.success(tokenMap);
    }
}
