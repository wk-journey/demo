package com.example.demo.mysql;

import com.example.demo.mysql.bean.DefaultDataSourceProperties;
import com.example.demo.mysql.handler.IDataSourceProperties;
import com.example.demo.mysql.helper.DynamicDataSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by wangkai on 2018/8/23.
 */
@Configuration
public class DataSourceConfig {
    @Bean
    @ConditionalOnMissingBean
    public IDataSourceProperties dataSourceProperties() {
        return new DefaultDataSourceProperties();
    }

    // 解决【there is more than one bean of 'DataSource' type】问题
    @Primary
    @Bean(name = "dataSource")
    public DataSource dataSource(IDataSourceProperties properties) throws SQLException {
        DataSource dataSource = new DynamicDataSource(properties);
        return dataSource;
    }

}
