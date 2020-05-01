package com.hjy.consumer.service;

import com.hjy.consumer.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> getAllUser();
}
