package com.fet.spring.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@SpringBootApplication(exclude =ErrorMvcAutoConfiguration.class)
@ComponentScan(basePackages = { "com.fet" })
public class SpringbootWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
		return springApplicationBuilder.sources(SpringbootWebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}


}