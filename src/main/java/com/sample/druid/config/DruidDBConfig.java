package com.sample.druid.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by daiqiang on 18-5-10.
 * alibaba-druid
 */
@Configuration
public class DruidDBConfig {
    @Bean
    @Primary
    public DataSource dataSource(
            @Value("${spring.datasource.driver-class-name}") String driverName,
            @Value("${spring.datasource.url}") String dbUrl,
            @Value("${spring.datasource.username}") String userName,
            @Value("${spring.datasource.password}") String password,
            @Value("${spring.datasource.initialSize}") int initialSize,
            @Value("${spring.datasource.minIdle}") int minIdle,
            @Value("${spring.datasource.maxActive}") int maxActive,
            @Value("${spring.datasource.maxWait}") long maxWait,
            @Value("${spring.datasource.timeBetweenEvictionRunsMills}") long timeBetweenEvictionRunsMills,
            @Value("${spring.datasource.minEvictableIdleTimeMillis}") long minEvictableIdleTimeMillis,
            @Value("${spring.datasource.validationQuery}") String validationQuery,
            @Value("${spring.datasource.testWhileIdle}") boolean testWhileIdle,
            @Value("${spring.datasource.testOnBorrow}") boolean testOnBorrow,
            @Value("${spring.datasource.testOnReturn}") boolean testOnReturn,
            @Value("${spring.datasource.poolPreparedStatements}") boolean poolPreparedStatements,
            @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}") int maxPoolPreparedStatementPerConnectionSize,
            @Value("${spring.datasource.filters}") String filters
    ) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverName);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setMaxActive(initialSize);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxActive(maxActive);
        dataSource.setMaxWait(maxWait);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMills);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setPoolPreparedStatements(poolPreparedStatements);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            dataSource.setFilters(filters);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
