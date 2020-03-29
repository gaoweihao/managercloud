package com.manager.springcloud.controller;

import com.manager.springcloud.entities.UserInfoEntity;
import com.manager.springcloud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/userInfo/findById/{id}",method= RequestMethod.GET)
    public UserInfoEntity findById(@PathVariable(value ="id") long id){
        System.out.println(8002);
        return userInfoService.findById(id);
    }

}
