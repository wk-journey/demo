//package com.example.demo.bean;
//
//import com.example.demo.properties.IRedisProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author wangkai
// * @date 2018-05-18 09:51
// * @desc com.example.demo.bean
// */
//@Component
//@ConfigurationProperties("test.data")
//public class BbcProperties {
//	private String error;
//	private List<BbcProperties.DefaultRedisProperties> redis = new ArrayList<>();
//	private BbcProperties.Compiler compiler = new BbcProperties.Compiler();
//
//	public static class DefaultRedisProperties implements IRedisProperties {
//		private int database = 0;
//		private int timeout = 500;
//		private int expireSeconds;
//
//		private String name;
//		private String path;
//		private String title;
//
//		@Override public int getDatabase() {
//			return database;
//		}
//
//		public void setDatabase(int database) {
//			this.database = database;
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
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public String getPath() {
//			return path;
//		}
//
//		public void setPath(String path) {
//			this.path = path;
//		}
//
//		public String getTitle() {
//			return title;
//		}
//
//		public void setTitle(String title) {
//			this.title = title;
//		}
//
//		@Override public String getPassword() {
//			return null;
//		}
//
//		@Override public int getPoolMaxTotal() {
//			return 0;
//		}
//
//		@Override public int getPoolMaxIdle() {
//			return 0;
//		}
//
//		@Override public int getPoolMaxWaitMillis() {
//			return 0;
//		}
//
//		@Override public int getPoolMinIdle() {
//			return 0;
//		}
//
//		@Override public String getHost() {
//			return null;
//		}
//
//		@Override public String getPort() {
//			return null;
//		}
//
//		@Override public String getSentinelMaster() {
//			return null;
//		}
//
//		@Override public String getSentinelNodes() {
//			return null;
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
//		@Override
//		public String toString() {
//			return "Menu{" +
//					"database='" + database + '\'' +
//					"timeout='" + timeout + '\'' +
//					"expireSeconds='" + expireSeconds + '\'' +
//					"name='" + name + '\'' +
//					", path='" + path + '\'' +
//					", title='" + title + '\'' +
//					'}';
//		}
//	}
//
//	public static class Compiler {
//		private String timeout;
//		private String outputFolder;
//
//		public String getTimeout() {
//			return timeout;
//		}
//
//		public void setTimeout(String timeout) {
//			this.timeout = timeout;
//		}
//
//		public String getOutputFolder() {
//			return outputFolder;
//		}
//
//		public void setOutputFolder(String outputFolder) {
//			this.outputFolder = outputFolder;
//		}
//
//		@Override
//		public String toString() {
//			return "Compiler{" +
//					"timeout='" + timeout + '\'' +
//					", outputFolder='" + outputFolder + '\'' +
//					'}';
//		}
//
//	}
//
//	public String getError() {
//		return error;
//	}
//
//	public void setError(String error) {
//		this.error = error;
//	}
//
//	public List<BbcProperties.DefaultRedisProperties> getRedis() {
//		return redis;
//	}
//
//	public void setRedis(List<BbcProperties.DefaultRedisProperties> redis) {
//		this.redis = redis;
//	}
//
//	public BbcProperties.Compiler getCompiler() {
//		return compiler;
//	}
//
//	public void setCompiler(BbcProperties.Compiler compiler) {
//		this.compiler = compiler;
//	}
//}
