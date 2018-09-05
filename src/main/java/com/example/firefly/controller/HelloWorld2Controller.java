package com.example.firefly.controller;

import com.example.firefly.pojo.User;
import com.example.firefly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld2Controller {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello2")
    public List<User> index() {
        return userService.findAll();
    }

    @RequestMapping("/index4")
    public String index4() {
        return "hello index4";
    }

}
