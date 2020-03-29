package com.manager.srpingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class UserInfoConsumer_dashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(UserInfoConsumer_dashboard_App.class,args);
    }
}
