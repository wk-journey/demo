//package com.example.demo.bean;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author wangkai
// * @date 2018-05-17 10:27
// * @desc com.example.demo.bean
// */
//@Component
//@PropertySource("classpath:/application.yml")
//@ConfigurationProperties(prefix="my-props")
//public class YmlProperties {
//	private String simpleProp;
//	private String[] arrayProps;
//	private List<Map<String, String>> listProp1 = new ArrayList<>();
//	private List<String> listProp2 = new ArrayList<>();
//	private Map<String, String> mapProps = new HashMap<>();
//
//	public String getSimpleProp() {
//		return simpleProp;
//	}
//
//	/**
//	 * String类型的一定需要setter来接收属性值；maps, collections, 和 arrays 不需要
//	 * @param simpleProp
//	 */
//	public void setSimpleProp(String simpleProp) {
//		this.simpleProp = simpleProp;
//	}
//
//	public List<Map<String, String>> getListProp1() {
//		return listProp1;
//	}
//	public List<String> getListProp2() {
//		return listProp2;
//	}
//
//	public String[] getArrayProps() {
//		return arrayProps;
//	}
//
//	public void setArrayProps(String[] arrayProps) {
//		this.arrayProps = arrayProps;
//	}
//
//	public Map<String, String> getMapProps() {
//		return mapProps;
//	}
//
//	public void setMapProps(Map<String, String> mapProps) {
//		this.mapProps = mapProps;
//	}
//}
