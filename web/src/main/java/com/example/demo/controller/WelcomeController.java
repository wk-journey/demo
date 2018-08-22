//package com.example.demo.controller;
//
//import com.example.demo.bean.*;
//import com.example.demo.bean.test.ActRedisProperties;
//import com.example.demo.bean.test.DefaultRedisProperties;
//import com.example.demo.factory.RedisFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.Map;
//
//@Controller
//public class WelcomeController {
//
//	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
//
//	private AppProperties app;
//	private GlobalProperties global;
//	private RedisProperties redis;
//	private BbcProperties bbc;
//	private RedisComProperties redisCom;
//
//	@Autowired
//	private RedisFactory redisFactory;
//
//	@Autowired
//	public void setApp(AppProperties app) {
//		this.app = app;
//	}
//
//	@Autowired
//	public void setGlobal(GlobalProperties global) {
//		this.global = global;
//	}
//
//	@Autowired
//	public void setRedis(RedisProperties redis) {
//		this.redis = redis;
//	}
//
//	@Autowired
//	public void setBbc(BbcProperties bbc) {
//		this.bbc = bbc;
//	}
//
//	@Autowired
//	public void setRedisComProperties(RedisComProperties redisComProperties) {
//		this.redisCom = redisComProperties;
//	}
//
//	@RequestMapping("/welcome")
//	public String welcome(Map<String, Object> model) {
//
//		String appProperties = app.toString();
//		String globalProperties = global.toString();
//		String redisProperties = redis.toString();
//		String bbcProperties = bbc.toString();
//		String redisComProperties = redisCom.toString();
//
//
//		logger.debug("Welcome {}, {}", app, global);
//
//		model.put("message", appProperties + globalProperties);
//		System.out.println(app.getMenus().size());
//		System.out.println(redis.getRedisPropertiesList().size());
//		System.out.println(bbc.getRedis().size());
//		System.out.println(redisCom.getRedis().size());
//
//		return "welcome";
//	}
//}
