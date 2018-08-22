//package com.example.demo.factory;
//
//import com.example.demo.bean.test.ActRedisProperties;
//import com.example.demo.bean.test.DefaultRedisProperties;
//import com.example.demo.factory.template.RedisTemplate;
//import com.example.demo.properties.IRedisProperties;
//import com.example.demo.service.RedisActService;
//import com.example.demo.service.RedisService;
//import com.example.demo.service.impl.RedisServiceImpl;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * @author wangkai
// * @date 2018-05-21 10:45
// * @desc com.example.demo.factory
// */
//@Component("redisFactory")
//public class RedisFactory implements RedisTemplate {
//	@Bean
//	@ConditionalOnMissingBean
//	public IRedisProperties redisProperties(){
//		return new DefaultRedisProperties();
//	}
//
//	@Bean(name = "redisService")
//	@Primary
//	@ConditionalOnMissingBean(name = {"redisService"})
//	public String redisService(DefaultRedisProperties defaultRedisProperties){
//		RedisService redisService = new RedisServiceImpl(this.getRedisTemplate(defaultRedisProperties));
//		redisService.getMaster();
//		redisService.expire("1", 1, TimeUnit.SECONDS);
//		return "redisService";
//	}
//
//	@Bean(name = "redisActService")
//	@ConditionalOnMissingBean(name = {"redisActService"})
//	public String redisActService(ActRedisProperties actRedisProperties){
//		RedisActService redisActService = new RedisServiceImpl(this.getRedisTemplate(actRedisProperties));
//		redisActService.getMaster();
//		redisActService.expire("2", 2, TimeUnit.SECONDS);
//		return "redisActService";
//	}
//
//	@Override
//	public IRedisProperties getRedisTemplate(IRedisProperties iRedisProperties) {
//		if (iRedisProperties != null) {
//			System.out.println(iRedisProperties.getSentinelMaster());
//		}
//		return iRedisProperties;
//	}
//}
