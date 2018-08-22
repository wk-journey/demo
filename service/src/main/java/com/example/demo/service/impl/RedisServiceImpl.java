package com.example.demo.service.impl;

import com.example.demo.properties.IRedisProperties;

/**
 * @author wangkai
 * @date 2018-05-24 11:17
 * @desc com.example.demo.service.impl
 */
public class RedisServiceImpl extends AbstractRedisService {
	private IRedisProperties iRedisProperties;

	public RedisServiceImpl(IRedisProperties iRedisProperties) {
		this.iRedisProperties = iRedisProperties;
	}

	protected IRedisProperties getIRedisProperties() {
		return iRedisProperties;
	}

	@Override public String getMaster() {
		return iRedisProperties.getSentinelMaster();
	}
}
