//package com.example.demo.bean;
//
//import com.example.demo.properties.IRedisProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author wangkai
// * @date 2018-05-17 20:10
// * @desc com.example.demo.bean
// */
//@Component("redisProperties")
//@PropertySource("classpath:/application.yml")
//@ConfigurationProperties(prefix="mamahao.data")
//public class RedisProperties {
//	private List<RedisProperties.DefaultRedisProperties> redis = new ArrayList<>();
//
////	public RedisProperties() {
////		DefaultRedisProperties defaultRedisProperties = new DefaultRedisProperties();
////		redis.add(defaultRedisProperties);
////	}
//
//	public static class DefaultRedisProperties {
////		implements IRedisProperties {
////		private int             database = 0;
////		private String          host;
////		private String          port;
////		private String          password;
//
//		private int             timeout = 1000;
//		private int             expire;
//
//		private int             total;
//		private int             max;
//		private int             wait;
//		private int             min;
//
//		private String          master;
//		private String          nodes;
//
//		//		@Override
////		public int getDatabase() {
////			return database;
////		}
////
////		public void setDatabase(int database) {
////			this.database = database;
////		}
//
////		@Override
////		public String getHost() {
////			return host;
////		}
////
////		public void setHost(String host) {
////			this.host = host;
////		}
////
////		@Override
////		public String getPort() {
////			return port;
////		}
////
////		public void setPort(String port) {
////			this.port = port;
////		}
////
////		@Override
////		public String getPassword() {
////			return password;
////		}
////
////		public void setPassword(String password) {
////			this.password = password;
////		}
//
//		public int getTimeout() {
//			return timeout;
//		}
//
//		public void setTimeout(int timeout) {
//			this.timeout = timeout;
//		}
//
//		public int getExpire() {
//			return expire;
//		}
//
//		public void setExpire(int expire) {
//			this.expire = expire;
//		}
//
//		public int getTotal() {
//			return total;
//		}
//
//		public void setTotal(int total) {
//			this.total = total;
//		}
//
//		public int getMax() {
//			return max;
//		}
//
//		public void setMax(int max) {
//			this.max = max;
//		}
//
//		public int getWait() {
//			return wait;
//		}
//
//		public void setWait(int wait) {
//			this.wait = wait;
//		}
//
//		public int getMin() {
//			return min;
//		}
//
//		public void setMin(int min) {
//			this.min = min;
//		}
//
//		public String getMaster() {
//			return master;
//		}
//
//		public void setMaster(String master) {
//			this.master = master;
//		}
//
//		public String getNodes() {
//			return nodes;
//		}
//
//		public void setNodes(String nodes) {
//			this.nodes = nodes;
//		}
//
//		@Override public String toString() {
//			final StringBuffer sb = new StringBuffer("DefaultRedisProperties{");
//			sb.append("timeout=").append(timeout);
//			sb.append(", expire=").append(expire);
//			sb.append(", total=").append(total);
//			sb.append(", max=").append(max);
//			sb.append(", wait=").append(wait);
//			sb.append(", min=").append(min);
//			sb.append(", master='").append(master).append('\'');
//			sb.append(", nodes='").append(nodes).append('\'');
//			sb.append('}');
//			return sb.toString();
//		}
//	}
//
//	public List<RedisProperties.DefaultRedisProperties> getRedisPropertiesList() {
//		return redis;
//	}
//
//	public void setRedisPropertiesList(List<RedisProperties.DefaultRedisProperties> redisPropertiesList) {
//		this.redis = redisPropertiesList;
//	}
//}
