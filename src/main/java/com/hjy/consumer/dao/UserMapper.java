package com.hjy.consumer.dao;

import com.hjy.consumer.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getAll();
}
