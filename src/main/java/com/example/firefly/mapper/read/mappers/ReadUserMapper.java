package com.example.firefly.mapper.read.mappers;

import com.example.firefly.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReadUserMapper {

    @Select("SELECT * FROM user")
    List<User> findAll();
}
