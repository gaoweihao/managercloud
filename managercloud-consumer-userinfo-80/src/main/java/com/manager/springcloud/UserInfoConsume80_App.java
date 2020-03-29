package com.manager.springcloud;

import com.manager.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//@RibbonClient(name="MANAGERCLOUD-USERINFO",configuration=MySelfRule.class)
@RibbonClient(name = "MANAGERCLOUD-USERINFO", configuration = MyselfRule.class)
public class UserInfoConsume80_App {
    public static void main(String[] args) {
        SpringApplication.run(UserInfoConsume80_App.class, args);
    }
}
