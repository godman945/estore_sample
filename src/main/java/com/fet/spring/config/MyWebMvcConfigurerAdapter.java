package com.fet.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fet.estore.api.exception.ErrorPageInterceptor;

@Configuration
//@EnableWebMvc // 这个注解使得默认配置失效
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
	private ApplicationContext applicationContext;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// addPathPatterns 用于添加拦截规则
		// excludePathPatterns 用户排除拦截
		registry.addInterceptor(new ErrorPageInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}

}
