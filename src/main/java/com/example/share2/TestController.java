package com.example.share2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author by yangJ
 * @Date 2021/4/14 20:31
 */

@RestController
public class TestController {

    @GetMapping("/index")
    public String index(){
        System.out.println("haha");
        return "haha";
    }
}
