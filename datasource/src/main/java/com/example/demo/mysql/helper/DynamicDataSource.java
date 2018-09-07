package com.example.demo.mysql.helper;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.demo.mysql.bean.DataSourceItem;
import com.example.demo.mysql.bean.DataSourceWrapper;
import com.example.demo.mysql.handler.IDataSourceProperties;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.util.CollectionUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by wangkai on 2018/9/6.
 * 动态数据源：根据绑定在线程中的数据源名称切换数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    public static final Logger logger = LoggerFactory.getLogger(DynamicDataSource.class);

    public DynamicDataSource(IDataSourceProperties properties) throws SQLException {
        if (StringUtils.isBlank(properties.getDefaultDataSourceType())) {
            throw new IllegalArgumentException("defaultDataSourceType must configure!");
        }
        if (StringUtils.isBlank(properties.getDefaultDriverClassName())) {
            throw new IllegalArgumentException("defaultDriverClassName must configure!");
        }
        if (CollectionUtils.isEmpty(properties.getDataSourceItems())) {
            throw new IllegalArgumentException("one datasource must configure at least!");
        }
        // 初始化
        this.initDataSource(properties);
    }

    private void initDataSource(IDataSourceProperties dataSourceProperties) {
        List<DataSourceWrapper> dataSourceWrappers = Lists.newArrayList();
        List<DataSourceItem> dataSourceItems = dataSourceProperties.getDataSourceItems();
        Iterator<DataSourceItem> iterator = dataSourceItems.iterator();
        while (iterator.hasNext()) {
            DataSourceItem dataSourceItem = iterator.next();
            DataSourceWrapper dataSourceWrapper = this.buildDataSource(dataSourceItem,
                    dataSourceProperties.getDefaultDataSourceType(), dataSourceProperties.getDefaultDriverClassName());
            dataSourceWrappers.add(dataSourceWrapper);
        }
        // 设置默认数据源
        DataSourceWrapper defaultDataSourceWrapper = this.selectDefaultDataSourceWrapper(dataSourceWrappers);
        super.setDefaultTargetDataSource(defaultDataSourceWrapper.getDataSource());
        DynamicContextHolder.setDefaultDataSource(defaultDataSourceWrapper);

        // 获取全部数据源
        Map<Object, Object> dataSourceMap = Maps.newHashMap();
        for (DataSourceWrapper dataSourceWrapper : dataSourceWrappers) {
            dataSourceMap.put(dataSourceWrapper.getName(), dataSourceWrapper.getDataSource());
            DynamicContextHolder.addDataSource(dataSourceWrapper.getName(), dataSourceWrapper);
        }
        // 设置全部数据源
        super.setTargetDataSources(dataSourceMap);
    }

    private DataSourceWrapper selectDefaultDataSourceWrapper(List<DataSourceWrapper> dataSourceWrappers) {
        DataSourceWrapper defaultDataSourceWrapper = null;
        for (DataSourceWrapper dataSourceWrapper : dataSourceWrappers) {
            if (dataSourceWrapper.isMaster()) {
                defaultDataSourceWrapper = dataSourceWrapper;
            }
        }
        if (defaultDataSourceWrapper == null) {
            defaultDataSourceWrapper = dataSourceWrappers.get(0);
        }
        return defaultDataSourceWrapper;
    }

    private DataSourceWrapper buildDataSource(DataSourceItem conf, String type, String driverClassName) {
        DataSourceWrapper wrapper = null;
        try {
            Class<? extends DataSource> dataSourceType =
                    (Class<? extends DataSource>) Class.forName(type);
            DataSourceBuilder builder = DataSourceBuilder.create()
                    .driverClassName(driverClassName)
                    .type(dataSourceType)
                    .url(conf.getUrl())
                    .username(conf.getUsername())
                    .password(conf.getPassword());
            DataSource ds = builder.build();
            if (type.equals("com.alibaba.druid.pool.DruidDataSource")) {
                ((DruidDataSource) ds).setMaxActive(conf.getMaxActive());
            }
            wrapper = new DataSourceWrapper();
            wrapper.setName(conf.getName());
            wrapper.setMaster(conf.isMaster());
            wrapper.setDataSource(ds);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return wrapper;
    }

    @Override
    protected Object determineCurrentLookupKey() {
        logger.info("==================================determineCurrentLookupKey=====================================");
        String currentDataSourceName = DynamicContextHolder.getCurrentDataSource();
        DataSourceWrapper ds = DynamicContextHolder.getDataSource(currentDataSourceName);
        if (ds != null) {
            logger.info("当前数据源信息:[名称={},isMaster={}]", ds.getName(), ds.isMaster());
        }
        return currentDataSourceName;
    }
}
