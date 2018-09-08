package com.example.demo.service.impl;

import com.example.demo.persist.entity.user.UserEntity;
import com.example.demo.persist.mapper.user.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * Created by wangkai on 2018/9/8.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity getUserInfoById(Integer userId) {
        Assert.notNull(userId, "Required param is null!");
        return userMapper.selectByPrimaryKey(userId);
    }
}
