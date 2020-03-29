package com.manager.springcloud.entities;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
public class UserInfoEntity implements Serializable {

    private long id;

    private String userName;

}
