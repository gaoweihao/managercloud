package com.manager.springcloud.service;

import com.manager.springcloud.entities.UserInfoEntity;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserInfoClientServiceFallbackFactory implements FallbackFactory<UserInfoClentService> {

    @Override
    public UserInfoClentService create(Throwable throwable) {
		return new UserInfoClentService() {
            @Override
            public UserInfoEntity findById(Long id) {
                return new UserInfoEntity().setId(id).setUserName("该ID：comsumer进行了降级处理，此服务已经关闭--@HystrixCommand");
            }
        };
    }
}
