package com.hjy.consumer.controller;

import com.hjy.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getAllUser")
    public List getAllUser(){
        return userService.getAllUser();
    }
}
