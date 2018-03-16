package com.ldx_first.demo_first.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class SessionFactoryConfiguration {
    @Value("${mybatis_config_file}")
    private String mbatisConfigFilePath;
    @Value("${mapper_path}")
    private String mapperPath;
    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;
    @Value("${entity_package}")
    private String entityPackage;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactorybean = new SqlSessionFactoryBean();
        sqlSessionFactorybean.setConfigLocation(new ClassPathResource(mbatisConfigFilePath));
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
        sqlSessionFactorybean.setMapperLocations(resolver.getResources(packageSearchPath));
        sqlSessionFactorybean.setDataSource(dataSource);
        sqlSessionFactorybean.setTypeAliasesPackage(entityPackage);
        return sqlSessionFactorybean;


    }
}
