package com.manager.springcloud.controllser;

import com.manager.springcloud.entities.UserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserInfoController_Consumer {

    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX="Http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MANAGERCOULD-USERINFO";

    @RequestMapping(value = "/consumer/userInfo/findById/{id}")
    public UserInfoEntity findById(@PathVariable long id){
        System.out.println(11);
        return restTemplate.getForObject(REST_URL_PREFIX+"/userInfo/findById/"+id,UserInfoEntity.class);
    }

}
