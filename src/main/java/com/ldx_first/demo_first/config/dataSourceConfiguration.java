package com.ldx_first.demo_first.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
//配置mybatis mapper的扫描路径
//这个是数据库的配置文件
@MapperScan("com.demo_first.config.dao")
public class dataSourceConfiguration  {
    @Value("${spring.datasource.driver-class-name}")
    private String jdbcDriver;
    @Value("${spring.datasource.url}")
    private String jdbcUrl;
    @Value("${spring.datasource.password}")
    private String jdbcPassword;
    @Value("${spring.datasource.username}")
    private String jdbcUsername;

    @Bean(name = "dataSource")
    public DruidDataSource createDataSouce() throws PropertyVetoException{
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcDriver);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(jdbcUsername);
        dataSource.setPassword(jdbcPassword);
        //关闭连接后不自动commit
        return dataSource;
    }

}
