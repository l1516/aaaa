package com.example.firefly.mapper.write.mappers;

import com.example.firefly.pojo.User;
import org.apache.ibatis.annotations.Insert;

public interface WriteUserMapper {

    @Insert("INSERT INTO user(name,passWord,age) VALUES(#{name}, #{passWord}, #{age})")
    User save(User user);
}
