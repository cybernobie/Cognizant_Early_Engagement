package com.cts;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.cts")
public class AppConfiguration {
	@Bean
	public DataSource mysqlDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream("connection.properties");
		Properties properties = new Properties();
		try {
			properties.load(input);
			dataSource.setDriverClassName(properties.getProperty("driver"));
			dataSource.setUrl(properties.getProperty("url"));
			dataSource.setUsername(properties.getProperty("username"));
			dataSource.setPassword(properties.getProperty("password"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate(mysqlDataSource());
		return template;
	}

	@Bean
	public PlatformTransactionManager txManager() {
		return new DataSourceTransactionManager(mysqlDataSource());
	}

}
