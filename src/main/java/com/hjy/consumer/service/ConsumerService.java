package com.hjy.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVICE-CONSUMER")
public interface ConsumerService {
    @RequestMapping("Test")
    String Test();
}
