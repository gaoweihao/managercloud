package com.manager.springcloud.dao;

import com.manager.springcloud.entities.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoDao {

    UserInfoEntity findById(Long id);
}
