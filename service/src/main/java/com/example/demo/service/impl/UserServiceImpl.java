package com.example.demo.service.impl;

import com.example.demo.persist.entity.user.UserEntity;
import com.example.demo.persist.mapper.user.UserMapper;
import com.example.demo.redis.service.RedisService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;


/**
 * Created by wangkai on 2018/9/8.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Resource
    @Qualifier(value = "redisService")
    private RedisService redisService;

    @Override
    public UserEntity getUserInfoById(Integer userId) {
        Assert.notNull(userId, "Required param is null!");
//        redisService.set("aaa", "ml");
        String aaa = redisService.get("aaa");
        System.out.println(aaa);
        return userMapper.selectByPrimaryKey(userId);
    }
}
