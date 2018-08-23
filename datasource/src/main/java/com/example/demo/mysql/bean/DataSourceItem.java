package com.example.demo.mysql.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by wangkai on 2018/8/23.
 */
public class DataSourceItem {
    /**
     * 连接地址
     */
    private String url;
    /**
     * 主/从数据库（默认主库）
     */
    private boolean master = true;
    /**
     * 数据库名称
     */
    private String name;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 最大连接数
     */
    private int maxActive = 8;

    public DataSourceItem() {
    }

    public DataSourceItem(String url, boolean master, String name, String username, String password, int maxActive) {
        this.url = url;
        this.master = master;
        this.name = name;
        this.username = username;
        this.password = password;
        this.maxActive = maxActive;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isMaster() {
        return master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(17, 37, this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
