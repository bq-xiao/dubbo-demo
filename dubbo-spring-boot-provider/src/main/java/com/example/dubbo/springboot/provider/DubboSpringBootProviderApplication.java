package com.example.dubbo.springboot.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDubboConfig
public class DubboSpringBootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootProviderApplication.class, args);
    }

}
