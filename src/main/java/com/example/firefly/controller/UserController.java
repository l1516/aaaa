package com.example.firefly.controller;

import com.example.firefly.pojo.User;
import com.example.firefly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "sys/index";
    }

    @RequestMapping("/add")
    public String save(User user) {
        userService.save(user);
        return "redirect:/list";
    }
}
