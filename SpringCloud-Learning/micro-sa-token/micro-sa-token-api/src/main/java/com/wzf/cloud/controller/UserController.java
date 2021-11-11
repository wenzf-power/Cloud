package com.wzf.cloud.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.wzf.cloud.api.CommonResult;
import com.wzf.cloud.domain.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取登录用户信息接口
 */
@RestController
@RequestMapping("/user")
public class UserController{

    @GetMapping("/info")
    public CommonResult<UserDTO> userInfo() {
        UserDTO userDTO = (UserDTO) StpUtil.getSession().get("userInfo");
        return CommonResult.success(userDTO);
    }

}
