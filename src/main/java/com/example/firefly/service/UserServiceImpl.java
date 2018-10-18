package com.example.firefly.service;

import com.example.firefly.mapper.read.mappers.ReadUserMapper;
import com.example.firefly.mapper.write.mappers.WriteUserMapper;
import com.example.firefly.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ReadUserMapper readUserMapper;
    @Autowired
    private WriteUserMapper writeUserMapper;

    @Override
    public List<User> findAll() {
        return readUserMapper.findAll();
    }

    @Override
    public User save(User user) {
        Integer id = writeUserMapper.save(user);
        user.setId(id);
        return user;
    }
}
