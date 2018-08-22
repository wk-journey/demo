package com.example.demo.properties;

/**
 * @author wangkai
 * @date 2018-05-17 20:15
 * @desc com.example.demo.properties
 */
public interface IRedisProperties {
	int getDatabase();

	String getPassword();

	int getTimeout();

	int getExpireSeconds();

	int getPoolMaxTotal();

	int getPoolMaxIdle();

	int getPoolMaxWaitMillis();

	int getPoolMinIdle();

	String getHost();//单机模式

	String getPort();//单机模式

	String getSentinelMaster();//哨兵模式

	String getSentinelNodes();//哨兵模式，多个使用逗号分隔

//	String getMasterNode();//主从模式
//
//	String getSlaveNodes();//主从模式，多个使用逗号分隔

	String getClusterNodes();//集群模式，多个使用逗号分隔

	int getClusterScanInterval();//每隔多少毫秒扫描集群状态
}
