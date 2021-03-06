package com.boot.spring.datasource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
//@MapperScan(basePackages = SlaverDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "slaver1SqlSessionFactory")
public class SlaverDataSourceConfig {
//	static final String PACKAGE = "com.boot.spring.dao";

	@Bean(name = "slaver1Properties")
	public SlaverProperties slaver1Properties() {
		return new Slaver1Properties();
	}

	@Bean(name = "slaver1DataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.slaver1.hikari")
	public HikariDataSource slaverDataSource(
			@Qualifier("slaver1Properties") SlaverProperties slaverProperties) {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setUsername(slaverProperties.getUsername());
		dataSource.setJdbcUrl(slaverProperties.getUrl());
		dataSource.setPassword(slaverProperties.getPassword());
		dataSource.setDriverClassName(slaverProperties.getDriverClassName());
		return dataSource;
	}
//
//	@Bean(name = "slaver1TransactionManager")
//	@Primary
//	public DataSourceTransactionManager slaverTransactionManager(
//			@Qualifier("slaver1DataSource") DataSource slaverDataSource) {
//		return new DataSourceTransactionManager(slaverDataSource);
//	}
//
//	@Bean(name = "slaver1SqlSessionFactory")
//	@Primary
//	public SqlSessionFactory slaverSqlSessionFactory(
//			@Qualifier("slaver1DataSource") DataSource slaverDataSource)
//			throws Exception {
//		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//		sessionFactory.setDataSource(slaverDataSource);
//		return sessionFactory.getObject();
//	}
//
//	@Bean(name = "slaver1SqlSessionTemplate")
//	@Primary
//	public SqlSessionTemplate slaverSqlSessionTemplate(
//			@Qualifier("slaver1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
//		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(
//				sqlSessionFactory);
//		return sqlSessionTemplate;
//	}
}