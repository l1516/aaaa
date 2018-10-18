package com.example.firefly.mapper.write.mappers;

import com.example.firefly.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface WriteUserMapper {

    @Insert("INSERT INTO user(name,password,age) VALUES(#{name}, #{password}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer save(User user);
}
