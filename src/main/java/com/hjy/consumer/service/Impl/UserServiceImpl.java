package com.hjy.consumer.service.Impl;

import com.hjy.consumer.dao.UserMapper;
import com.hjy.consumer.model.User;
import com.hjy.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAll();
    }
}
