package com.wzf.redis.web.rest;

import com.wzf.redis.entity.User;
import com.wzf.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * UserResource
 *
 */
@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<Void> saveUser(@RequestBody User user) {
        userService.save(user);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/{code}")
    public ResponseEntity<User> getUser(@PathVariable String code) {
        User user = userService.get(code);

        return ResponseEntity.ok(user);
    }

}
