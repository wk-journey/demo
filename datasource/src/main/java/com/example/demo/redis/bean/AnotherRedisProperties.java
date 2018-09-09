package com.example.demo.redis.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by wangkai on 2018/9/9.
 */
@Component("anotherRedisProperties")
@ConfigurationProperties("demo.data.redis.another")
public class AnotherRedisProperties extends DefaultRedisProperties {

}
