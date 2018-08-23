package com.example.demo.mysql.handler;

import com.example.demo.mysql.bean.DataSourceItem;

import java.util.List;

/**
 * Created by wangkai on 2018/8/23.
 */
public interface IDataSourceProperties {
    /**
     * 获取数据源类型
     * @return
     */
    String getDefaultDataSourceType();

    /**
     * 获取驱动类型
     * @return
     */
    String getDefaultDriverClassName();

    /**
     * 获取数据源配置
     * @return
     */
    List<DataSourceItem> getDataSourceItems();
}
