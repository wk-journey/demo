package com.example.demo.mybatis.config;

import com.example.demo.mybatis.bean.DefaultMybatisProperties;
import com.example.demo.mybatis.bean.DefaultPageHelperProperties;
import com.example.demo.mybatis.bean.IMybatisProperties;
import com.example.demo.mybatis.bean.IPageHelperProperties;
import com.github.pagehelper.PageInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Map;
import java.util.Properties;

/**
 * Created by wangkai on 2018/9/8.
 */
@Configuration
//@EnableAutoConfiguration
public class MybatisConfiguration implements EnvironmentAware {

    @Autowired(required = false)
    private Interceptor[] interceptors;

    private ResourceLoader resourceLoader = new DefaultResourceLoader();

    private RelaxedPropertyResolver pageHelperPropertiesResolver;

    @Override
    public void setEnvironment(Environment environment) {
        pageHelperPropertiesResolver = new RelaxedPropertyResolver(environment, "demo.data.mybatis.pagehelper.");
    }

    @Bean
    @ConditionalOnMissingBean
    public IMybatisProperties mybatisProperties() {
        return new DefaultMybatisProperties();
    }

    @Bean
    @ConditionalOnMissingBean
    public IPageHelperProperties pageHelperProperties() {
        return new DefaultPageHelperProperties();
    }

    @Bean
    @Primary
    @Autowired
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    @ConditionalOnMissingBean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory, IMybatisProperties mybatisProperties) {
        return new SqlSessionTemplate(sqlSessionFactory, mybatisProperties.getExecutorType());
    }

    @Bean(name = "sqlSessionFactory")
    @ConditionalOnMissingBean
    @Autowired
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource, IMybatisProperties mybatisProperties,
                                               IPageHelperProperties pageHelperProperties) throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setVfs(SpringBootVFS.class);

        if (this.interceptors != null && this.interceptors.length > 0) {
            factory.setPlugins(this.interceptors);
        }
        factory.setTypeAliasesPackage(mybatisProperties.getTypeAliasesPackage());
        factory.setTypeHandlersPackage(mybatisProperties.getTypeHandlersPackage());

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources(mybatisProperties.getMapperLocations());
        factory.setMapperLocations(resources);

        if (StringUtils.isNotBlank(mybatisProperties.getConfig())) {
            Resource resource = new ClassPathResource(mybatisProperties.getConfig());
            if (!resource.exists()) {
                resource = this.resourceLoader.getResource(mybatisProperties.getConfig());
            }
            if (resource.exists()) {
                factory.setConfigLocation(resource);
            }
        }

        // 分页拦截器
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = pageHelperProperties.getProperties();
        Map<String, Object> subProperties = pageHelperPropertiesResolver.getSubProperties("");
        for (String key : subProperties.keySet()) {
            if (!properties.containsKey(key)) {
                properties.setProperty(key, pageHelperPropertiesResolver.getProperty(key));
            }
        }
        pageInterceptor.setProperties(properties);

        SqlSessionFactory sessionFactory = factory.getObject();
        sessionFactory.getConfiguration().addInterceptor(pageInterceptor);
        return sessionFactory;
    }
}
