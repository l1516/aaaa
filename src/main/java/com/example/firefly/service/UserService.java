package com.example.firefly.service;

import com.example.firefly.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserService extends JpaRepository<User, Long> {

    List<User> findAll();

}
