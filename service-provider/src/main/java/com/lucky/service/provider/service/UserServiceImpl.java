package com.lucky.service.provider.service;

import com.lucky.service.api.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author Guo Huaijian
 * @Date 2020/7/27 13:42
 */
@DubboService(version = "${services.versions.v1}")
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {
        return "hello dubbo"+name;
    }
}
