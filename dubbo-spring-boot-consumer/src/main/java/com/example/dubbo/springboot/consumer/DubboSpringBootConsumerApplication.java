package com.example.dubbo.springboot.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class DubboSpringBootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootConsumerApplication.class, args);
    }

}
