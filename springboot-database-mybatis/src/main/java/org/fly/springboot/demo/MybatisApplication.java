package org.fly.springboot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by overfly on 2017/11/1.
 */
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
//@MapperScan("org.fly.springboot.demo.mapper")
public class MybatisApplication {

    private final static Logger logger = LoggerFactory.getLogger(MybatisApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class,args);
    }

    /*@Bean(name="primaryJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate(
            @Qualifier("primaryDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "secondaryJdbcTemplate")
    public JdbcTemplate secondaryJdbcTemplate(
            @Qualifier("secondaryDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }*/

}
