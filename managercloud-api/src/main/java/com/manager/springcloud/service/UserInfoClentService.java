package com.manager.springcloud.service;

import com.manager.springcloud.entities.UserInfoEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(value ="MANAGERCOULD-USERINFO")
@FeignClient(value = "MANAGERCOULD-USERINFO",fallbackFactory=UserInfoClientServiceFallbackFactory.class)
public interface UserInfoClentService {

    @RequestMapping(value = "/userInfo/findById/{id}")
    UserInfoEntity findById(@PathVariable(value ="id") Long id);
}
