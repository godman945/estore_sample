package com.fet.spring.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import oracle.jdbc.pool.OracleDataSource;

@Order(Ordered.HIGHEST_PRECEDENCE)
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = "com.fet")
@EntityScan(basePackages = "com.fet")
public class JpaConfig {

	
	@Value("${spring.datasource.driver}")
	private String driver;

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;
	
	
	@Bean
	public DataSource dataSource() throws Exception {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setUser(username);
		dataSource.setPassword(password);
		dataSource.setURL(url);
		dataSource.setImplicitCachingEnabled(true);
		dataSource.setFastConnectionFailoverEnabled(true);
		return dataSource;
	}
	
	@Bean
    public LocalContainerEntityManagerFactoryBean entityManageFactory(EntityManagerFactoryBuilder builder) throws Exception{
        LocalContainerEntityManagerFactoryBean entityManagerFactory =  builder.dataSource(dataSource()).packages("com.fet.pojo").build();
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        jpaProperties.put("hibernate.physical_naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
        jpaProperties.put("hibernate.connection.charSet", "utf-8");
        jpaProperties.put("hibernate.show_sql", "false");
        entityManagerFactory.setJpaProperties(jpaProperties);
        return entityManagerFactory;
    }
	
	
	
	
	
	
	
//	@Bean
//	PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
//		return new PersistenceExceptionTranslationPostProcessor();
//	}
//	
//	@Bean
//	PlatformTransactionManager createTxManager(@Autowired EntityManagerFactory entityManagerFactory) {
//	    return new JpaTransactionManager(entityManagerFactory);
//	}
	
//	@Bean
//	LocalContainerEntityManagerFactoryBean createEntityManagerFactory(@Autowired DataSource dataSource) {
//		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//	    // 设置DataSource:
//	    entityManagerFactoryBean.setDataSource(dataSource);
//	    // 扫描指定的package获取所有entity class:
//	    entityManagerFactoryBean.setPackagesToScan("com.itranswarp.learnjava.entity");
//	    // 指定JPA的提供商是Hibernate:
//	    JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//	    entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
//	    // 设定特定提供商自己的配置:
//	    var props = new Properties();
//	    props.setProperty("hibernate.hbm2ddl.auto", "update");
//	    props.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
//	    props.setProperty("hibernate.show_sql", "true");
//	    entityManagerFactoryBean.setJpaProperties(props);
//	    return entityManagerFactoryBean;
//	}
	
	
}
