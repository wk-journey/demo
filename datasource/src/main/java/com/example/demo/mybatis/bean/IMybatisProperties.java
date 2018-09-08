package com.example.demo.mybatis.bean;

import org.apache.ibatis.session.ExecutorType;

/**
 * Created by wangkai on 2018/9/7.
 */
public interface IMybatisProperties {
    String getConfig();

    String getMapperLocations();

    String getTypeAliasesPackage();

    String getTypeHandlersPackage();

    boolean isCheckConfigLocation();

    boolean isNotEmpty();

    String getMappers();

    String getBasePackage();

    String getIdentity();

    ExecutorType getExecutorType();
}
