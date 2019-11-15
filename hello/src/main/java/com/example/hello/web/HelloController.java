package com.example.hello.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${userId:100}")
    private int userId;
    
    @RequestMapping("/hello")
    public String index() {
        System.out.println(userId);
        return "hello1111";
    }
}
