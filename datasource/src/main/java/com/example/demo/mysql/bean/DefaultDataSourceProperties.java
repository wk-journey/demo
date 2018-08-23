package com.example.demo.mysql.bean;

import com.example.demo.mysql.handler.IDataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangkai on 2018/8/23.
 */
@ConfigurationProperties(prefix = "demo.data.dataSource", ignoreInvalidFields = true, exceptionIfInvalid = false)
public class DefaultDataSourceProperties implements IDataSourceProperties {
    /**
     * 默认数据源类型
     */
    private String defaultDataSourceType;

    /**
     * 默认jdbc驱动
     */
    private String defaultDriverClassName;

    /**
     * 数据配置
     */
    private List<DataSourceItem> dataSourceItems = new ArrayList<>(2);

    @Override
    public String getDefaultDataSourceType() {
        return defaultDataSourceType;
    }

    @Override
    public String getDefaultDriverClassName() {
        return defaultDriverClassName;
    }

    @Override
    public List<DataSourceItem> getDataSourceItems() {
        return dataSourceItems;
    }

    public void setDefaultDataSourceType(String defaultDataSourceType) {
        this.defaultDataSourceType = defaultDataSourceType;
    }

    public void setDefaultDriverClassName(String defaultDriverClassName) {
        this.defaultDriverClassName = defaultDriverClassName;
    }

    public void setDataSourceItems(List<DataSourceItem> dataSourceItems) {
        this.dataSourceItems = dataSourceItems;
    }
}
