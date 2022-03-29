package com.wzf.cache.web.controller;

import com.wzf.cache.dto.UserDto;
import com.wzf.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CacheResource
 *
 **/
@RestController
@RequestMapping("/api")
public class CacheResource {

    @Autowired
    private UserService userService;

    @Autowired
    private CacheManager cacheManager;

    @GetMapping("/users/{username}")
    public ResponseEntity<UserDto> getUser(@PathVariable String username) {
        // 获取数据
        System.out.println(cacheManager.toString());
        UserDto user = userService.getUser(username);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/users/{username}")
    public ResponseEntity<List<UserDto>> save(@PathVariable String username) {
        List<UserDto> userDtoList = userService.save(username);

        return ResponseEntity.ok(userDtoList);
    }

    @DeleteMapping("/users/{username}")
    public ResponseEntity<List<UserDto>> delete(@PathVariable String username) {
        List<UserDto> userDtoList = userService.deleteUser(username);

        return ResponseEntity.ok(userDtoList);
    }
}
