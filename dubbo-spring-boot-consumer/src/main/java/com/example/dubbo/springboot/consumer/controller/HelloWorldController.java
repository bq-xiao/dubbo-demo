package com.example.dubbo.springboot.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dubbo.springboot.api.service.HelloWorldService;

@RestController
@RequestMapping("/sample")
public class HelloWorldController {
    @Reference(url = "dubbo://127.0.0.1:12345")
    private HelloWorldService helloWorldService;

    @GetMapping(value = "/hello/{name}")
    @ResponseBody
    public String say(@PathVariable("name") String name) {
        return helloWorldService.sayHello(name);
    }
}
