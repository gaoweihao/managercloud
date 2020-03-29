package com.manager.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.manager.springcloud"})
@ComponentScan("com.manager.springcloud")
public class UserInfoConsume80_feign_App {
    public static void main(String[] args) {
        SpringApplication.run(UserInfoConsume80_feign_App.class,args);
    }
}
