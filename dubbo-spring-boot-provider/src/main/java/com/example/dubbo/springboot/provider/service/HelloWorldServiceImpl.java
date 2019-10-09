package com.example.dubbo.springboot.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import com.example.dubbo.springboot.api.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

}
