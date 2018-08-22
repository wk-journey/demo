package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangkai
 * @date 2018-08-16 20:17
 * @desc com.example.demo
 */
//@EnableDiscoveryClient
//@ComponentScan(value= {"com.example.demo"})
@SpringBootApplication
public class DemoApplicationRunner {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationRunner.class, args);
	}
}
