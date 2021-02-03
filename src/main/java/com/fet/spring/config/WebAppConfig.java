//package com.fet.spring.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//@Configuration
//public class WebAppConfig extends WebMvcConfigurationSupport {
//   
//	 private static final List<String> EXCLUDE_PATH= Arrays.asList("/","/css/**","/js/**","/img/**","/media/**","/vendors/**");
//	    @Autowired
//	    SessionInterceptor sessionInterceptor;
//	    @Override
//	    public void addInterceptors(InterceptorRegistry registry) {
//	        /*
//	         *  对根目录和静态文件不需要进行拦截，如果对根目录（即登录页面）进行拦截，将会导致循环重定向
//	         */
//	        registry.addInterceptor(sessionInterceptor)
//	                .addPathPatterns("/**")
//	                .excludePathPatterns(EXCLUDE_PATH);
//	    }
//
//}