package com.example.firefly.service;

import com.example.firefly.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);

}
