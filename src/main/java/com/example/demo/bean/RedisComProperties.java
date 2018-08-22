//package com.example.demo.bean;
//
//import com.example.demo.properties.IRedisProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author wangkai
// * @date 2018-05-18 11:24
// * @desc com.example.demo.bean
// */
//@Component
//@ConfigurationProperties("mamahao.data")
//@PropertySource({"classpath:application.yml", "classpath:datasource.yml"})
//public class RedisComProperties {
//	private List<RedisComProperties.DefaultRedisProperties> redis = new ArrayList<>();
//
//	public static class DefaultRedisProperties implements IRedisProperties {
//		private int database = 0;
//		private String host;
//		private String port;
//		private String password;
//		private int timeout = 500;
//		private int expireSeconds;
//
//		private int poolMaxTotal = 1;
//		private int poolMaxIdle = 1;
//		private int poolMaxWaitMillis = 1;
//		private int poolMinIdle = 0;
//
//		private String sentinelMaster;
//		private String sentinelNodes;
//
//		@Override public int getDatabase() {
//			return database;
//		}
//
//		public void setDatabase(int database) {
//			this.database = database;
//		}
//
//		@Override public String getHost() {
//			return host;
//		}
//
//		public void setHost(String host) {
//			this.host = host;
//		}
//
//		@Override public String getPort() {
//			return port;
//		}
//
//		public void setPort(String port) {
//			this.port = port;
//		}
//
//		@Override public String getPassword() {
//			return password;
//		}
//
//		public void setPassword(String password) {
//			this.password = password;
//		}
//
//		@Override public int getTimeout() {
//			return timeout;
//		}
//
//		public void setTimeout(int timeout) {
//			this.timeout = timeout;
//		}
//
//		@Override public int getExpireSeconds() {
//			return expireSeconds;
//		}
//
//		public void setExpireSeconds(int expireSeconds) {
//			this.expireSeconds = expireSeconds;
//		}
//
//		@Override public int getPoolMaxTotal() {
//			return poolMaxTotal;
//		}
//
//		public void setPoolMaxTotal(int poolMaxTotal) {
//			this.poolMaxTotal = poolMaxTotal;
//		}
//
//		@Override public int getPoolMaxIdle() {
//			return poolMaxIdle;
//		}
//
//		public void setPoolMaxIdle(int poolMaxIdle) {
//			this.poolMaxIdle = poolMaxIdle;
//		}
//
//		@Override public int getPoolMaxWaitMillis() {
//			return poolMaxWaitMillis;
//		}
//
//		public void setPoolMaxWaitMillis(int poolMaxWaitMillis) {
//			this.poolMaxWaitMillis = poolMaxWaitMillis;
//		}
//
//		@Override public int getPoolMinIdle() {
//			return poolMinIdle;
//		}
//
//		public void setPoolMinIdle(int poolMinIdle) {
//			this.poolMinIdle = poolMinIdle;
//		}
//
//		@Override public String getSentinelMaster() {
//			return sentinelMaster;
//		}
//
//		public void setSentinelMaster(String sentinelMaster) {
//			this.sentinelMaster = sentinelMaster;
//		}
//
//		@Override public String getSentinelNodes() {
//			return sentinelNodes;
//		}
//
//		public void setSentinelNodes(String sentinelNodes) {
//			this.sentinelNodes = sentinelNodes;
//		}
//
//		@Override public String getClusterNodes() {
//			return null;
//		}
//
//		@Override public int getClusterScanInterval() {
//			return 0;
//		}
//
//		@Override public String toString() {
//			final StringBuffer sb = new StringBuffer("DefaultRedisProperties{");
//			sb.append("database=").append(database);
//			sb.append(", host='").append(host).append('\'');
//			sb.append(", port='").append(port).append('\'');
//			sb.append(", password='").append(password).append('\'');
//			sb.append(", timeout=").append(timeout);
//			sb.append(", expireSeconds=").append(expireSeconds);
//			sb.append(", poolMaxTotal=").append(poolMaxTotal);
//			sb.append(", poolMaxIdle=").append(poolMaxIdle);
//			sb.append(", poolMaxWaitMillis=").append(poolMaxWaitMillis);
//			sb.append(", poolMinIdle=").append(poolMinIdle);
//			sb.append(", sentinelMaster='").append(sentinelMaster).append('\'');
//			sb.append(", sentinelNodes='").append(sentinelNodes).append('\'');
//			sb.append('}');
//			return sb.toString();
//		}
//	}
//
//	public List<RedisComProperties.DefaultRedisProperties> getRedis() {
//		return redis;
//	}
//
//	public void setRedis(List<RedisComProperties.DefaultRedisProperties> redis) {
//		this.redis = redis;
//	}
//}
