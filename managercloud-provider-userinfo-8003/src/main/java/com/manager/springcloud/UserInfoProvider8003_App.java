package com.manager.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserInfoProvider8003_App {
    public static void main(String[] args) {
        SpringApplication.run(UserInfoProvider8003_App.class,args);
    }
}
