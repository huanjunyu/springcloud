package com.hjy.consumer.controller;

import com.hjy.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping("Test")
    public String Test(){
        return "成功访问consumer8085";
    }

    //利用Feign访问其他服务
    @RequestMapping("Test2")
    public String Test2(){
        return consumerService.Test();
    }


}
