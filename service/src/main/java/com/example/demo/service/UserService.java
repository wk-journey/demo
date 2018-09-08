package com.example.demo.service;

import com.example.demo.persist.entity.user.UserEntity;

/**
 * Created by wangkai on 2018/9/8.
 */
public interface UserService {

    /**
     * 根据Id获取用户信息
     * @param userId
     * @return UserEntity
     */
    UserEntity getUserInfoById(Integer userId);

}
