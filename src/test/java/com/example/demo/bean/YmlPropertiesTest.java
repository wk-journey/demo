//package com.example.demo.bean;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//
///**
// * @author wangkai
// * @date 2018-05-17 10:28
// * @desc com.example.demo.bean
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//public class YmlPropertiesTest {
//
//	@Resource
//	private YmlProperties ymlProperties;
//
//
//	@Test
//	public void testOne() throws JsonProcessingException {
//		ObjectMapper objectMapper = new ObjectMapper();
//		System.out.println("simpleProp: " + ymlProperties.getSimpleProp());
//		System.out.println("arrayProps: " + objectMapper.writeValueAsString(ymlProperties.getArrayProps()));
//		System.out.println("listProp1: " + objectMapper.writeValueAsString(ymlProperties.getListProp1()));
//		System.out.println("listProp2: " + objectMapper.writeValueAsString(ymlProperties.getListProp2()));
//		System.out.println("mapProps: " + objectMapper.writeValueAsString(ymlProperties.getMapProps()));
//	}
//}