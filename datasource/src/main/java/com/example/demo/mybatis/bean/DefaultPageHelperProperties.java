package com.example.demo.mybatis.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Properties;

/**
 * Created by wangkai on 2018/9/8.
 */
@ConfigurationProperties("demo.data.mybatis.pagehelper")
public class DefaultPageHelperProperties implements IPageHelperProperties {
    private Properties properties = new Properties();

    @Override
    public Properties getProperties() {
        return properties;
    }

    @Override
    public String getOffSetAsPageNum() {
        return properties.getProperty("offSetAsPageNum");
    }

    public void setOffSetAsPageNum(String offSetAsPageNum) {
        properties.setProperty("offSetAsPageNum", offSetAsPageNum);
    }

    @Override
    public String getRowBoundsWithCount() {
        return properties.getProperty("owBoundsWithCount");
    }

    public void getRowBoundsWithCount(String rowBoundsWithCount) {
        properties.setProperty("rowBoundsWithCount", rowBoundsWithCount);
    }

    @Override
    public String getPageSizeZero() {
        return properties.getProperty("PageSizeZero");
    }

    public void setPageSizeZero(String pageSizeZero) {
        properties.setProperty("pageSizeZero", pageSizeZero);
    }

    @Override
    public String getReasonable() {
        return properties.getProperty("reasonable");
    }

    public void setReasonable(String reasonable) {
        properties.setProperty("reasonable", reasonable);
    }

    @Override
    public String getSupportMethodsArguments() {
        return properties.getProperty("supportMethodsArguments");
    }

    public void setSupportMethodsArguments(String supportMethodsArguments) {
        properties.setProperty("supportMethodsArguments", supportMethodsArguments);
    }

    @Override
    public String getDialect() {
        return properties.getProperty("dialect");
    }

    public void setDialect(String dialect) {
        properties.setProperty("dialect", dialect);
    }

    @Override
    public String getHelperDialect() {
        return properties.getProperty("helperDialect");
    }

    public void setHelperDialect(String helperDialect) {
        properties.setProperty("helperDialect", helperDialect);
    }

    @Override
    public String getAutoRuntimeDialect() {
        return properties.getProperty("autoRuntimeDialect");
    }

    public void setAutoRuntimeDialect(String autoRuntimeDialect) {
        properties.setProperty("autoRuntimeDialect", autoRuntimeDialect);
    }

    @Override
    public String getAutoDialect() {
        return properties.getProperty("autoDialect");
    }

    public void setAutoDialect(String autoDialect) {
        properties.setProperty("autoDialect", autoDialect);
    }

    @Override
    public String getCloseConn() {
        return properties.getProperty("closeConn");
    }

    public void setCloseConn(String closeConn) {
        properties.setProperty("closeConn", closeConn);
    }

    @Override
    public String getParams() {
        return properties.getProperty("params");
    }

    public void setParams(String params) {
        properties.setProperty("params", params);
    }
}
