package com.example.demo.factory.template;

import com.example.demo.properties.IRedisProperties;

/**
 * @author wangkai
 * @date 2018-05-21 10:53
 * @desc com.example.demo.factory.template
 */
public interface RedisTemplate {
	/**
	 * redis模板
	 * @Author wangkai
	 * @Datetime 2018/5/21 0021 10:54
	 * @param iRedisProperties
	 * @return
	 */
	IRedisProperties getRedisTemplate(IRedisProperties iRedisProperties);
}
