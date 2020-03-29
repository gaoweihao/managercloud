package com.manager.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class UserInfoProvider8001_HyStrix_App {
    public static void main(String[] args) {
        SpringApplication.run(UserInfoProvider8001_HyStrix_App.class,args);
    }
}
