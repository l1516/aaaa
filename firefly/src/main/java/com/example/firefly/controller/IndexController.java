package com.example.firefly.controller;

import com.example.firefly.pojo.User;
import com.example.firefly.service.UserService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("sys/index")
    public String hello(Model model) {
        List<User> user = userService.findAll();
        model.addAttribute("users", user);
        model.addAttribute("test", "aaaa");
        return "sys/index";
    }

    @RequestMapping("/left")
    public String left() {
        return "left";
    }

}
