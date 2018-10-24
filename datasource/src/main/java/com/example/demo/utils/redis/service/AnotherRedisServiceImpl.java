package com.example.demo.utils.redis.service;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by wangkai on 2018/9/9.
 */
public class AnotherRedisServiceImpl extends AbstractRedisService {
    private RedisTemplate redisTemplate;

    public AnotherRedisServiceImpl(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    protected RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }
}
