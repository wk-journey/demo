package com.example.demo.mysql.helper;

import com.example.demo.mysql.bean.DataSourceWrapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by wangkai on 2018/9/6.
 * 使用ThreadLocal绑定当前数据源
 */
public class DynamicContextHolder {
    public static final ThreadLocal<String> holder = new ThreadLocal<>();
    public static List<String> dataSourceNames = Lists.newArrayList();
    public static Map<String, DataSourceWrapper> dataSources = Maps.newConcurrentMap();
    public static DataSourceWrapper defaultDataSource;

    public static void setDefaultDataSource() {
        if (defaultDataSource != null) {
            holder.set(defaultDataSource.getName());
        }
    }

    public static void setDefaultDataSource(DataSourceWrapper dataSourceWrapper) {
        defaultDataSource = dataSourceWrapper;
    }

    public static String getCurrentDataSource() {
        return holder.get();
    }

    public static void clearCurrentDataSource() {
        holder.remove();
    }

    public static boolean containsDataSource(String dataSourceName) {
        return dataSourceNames.contains(dataSourceName);
    }

    public static void addDataSource(String dataSourceName, DataSourceWrapper dataSourceWrapper) {
        dataSourceNames.add(dataSourceName);
        dataSources.put(dataSourceName, dataSourceWrapper);
    }

    public static DataSourceWrapper getDataSource(String dataSourceName) {
        if (StringUtils.isBlank(dataSourceName)) {
            return null;
        }
        return dataSources.get(dataSourceName);
    }
}
