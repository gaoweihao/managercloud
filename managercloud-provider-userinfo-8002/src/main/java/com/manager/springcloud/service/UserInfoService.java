package com.manager.springcloud.service;

import com.manager.springcloud.entities.UserInfoEntity;

public interface UserInfoService {
    UserInfoEntity findById(long id);
}
