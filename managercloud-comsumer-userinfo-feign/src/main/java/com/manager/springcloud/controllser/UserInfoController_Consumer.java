package com.manager.springcloud.controllser;

import com.manager.springcloud.entities.UserInfoEntity;
import com.manager.springcloud.service.UserInfoClentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController_Consumer {

    @Autowired
    private UserInfoClentService userInfoCleanService;

    @RequestMapping(value = "/consumer/userInfo/findById/{id}")
    public UserInfoEntity findById(@PathVariable("id") Long id){
        return  userInfoCleanService.findById(id);
    }

}
