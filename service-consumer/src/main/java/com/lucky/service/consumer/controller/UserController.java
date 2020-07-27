package com.lucky.service.consumer.controller;

import com.lucky.service.api.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Guo Huaijian
 * @Date 2020/7/27 14:13
 */
@RestController
public class UserController {

    @Reference(version = "${services.versions.v1}")
    private UserService userService;

    @GetMapping("/hi")
    public String sayHello(){
        String name = "小明";
        String hello = userService.sayHello(name);
        return hello;
    }
}
