package com.example.share2.user.controller;

import com.example.share2.user.entity.User;
import com.example.share2.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * TODO
 *
 * @author by yangJ
 * @Date 2021/4/14 20:31
 */

@RestController
@AllArgsConstructor
public class TestController {

    private UserService userService;

    @GetMapping("/index")
    public String index(String test){
        System.out.println(test);
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setUserAcct("yang01");
        user.setUserName("yang01");
        userService.save(user);
        return "test";
    }
}
