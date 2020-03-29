package com.manager.springcloud.controller;

import com.manager.springcloud.entities.UserInfoEntity;
import com.manager.springcloud.service.UserInfoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/userInfo/findById/{id}", method = RequestMethod.GET)
    //@HystrixCommand(fallbackMethod = "processHystrix_Get")
    public UserInfoEntity findById(@PathVariable(value = "id") long id) {
        System.out.println(8001);
       return userInfoService.findById(id);
    }

    public UserInfoEntity processHystrix_Get(@PathVariable("id") Long id) {
        return new UserInfoEntity().setId(id).setUserName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
    }

}
