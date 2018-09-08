package com.example.demo.mybatis.config;

import com.example.demo.mybatis.bean.IMapper;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * Created by wangkai on 2018/9/8.
 */
@Configuration
public class MyBatisMapperConfiguration implements EnvironmentAware {

    private String basePackage;
    private String identity;

    @Override
    public void setEnvironment(Environment environment) {
        basePackage = environment.getProperty("demo.data.mybatis.base-package");
        identity = environment.getProperty("demo.data.mybatis.identity");
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage(basePackage);
        Properties conf = new Properties();
        conf.setProperty("mappers", IMapper.class.getName());
        conf.setProperty("notEmpty", "false");
        conf.setProperty("identity", identity);
        mapperScannerConfigurer.setProperties(conf);
        return mapperScannerConfigurer;
    }
}
