package com.manager.springcloud.service.impl;

import com.manager.springcloud.entities.UserInfoEntity;
import com.manager.springcloud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.manager.springcloud.dao.UserInfoDao;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfoEntity findById(long id) {
        return userInfoDao.findById(id);
    }
}
