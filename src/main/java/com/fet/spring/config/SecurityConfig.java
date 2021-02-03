package com.fet.spring.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.fet.db.oracle.service.coMaster.IAdmRoleService;

@EnableGlobalMethodSecurity(securedEnabled = true) // 啟用Method Security ＠Security
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


	@Autowired
	private IAdmRoleService admRoleService;

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
			http
				.authorizeRequests().antMatchers("/alex2").hasAnyRole("ADMIN")
				.and().authorizeRequests().antMatchers("/login_page","/err","/err404").permitAll().anyRequest().authenticated()
				.and().formLogin().loginPage("/login_page").loginProcessingUrl("/perform_login").failureUrl("/login_page")
				.and().logout().logoutUrl("/perform_logout").logoutSuccessUrl("/login_page?logout")
				.and().exceptionHandling().accessDeniedPage("/err")
//				.and().csrf().disable()
				;
	}
	
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		//web.ignoring().antMatchers("/static/js/**", "/static/css/**", "/static/images/**");
//		web.ignoring().antMatchers("/js/***", "/css/***","/images/**");
//	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();// 密码不加密
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) 	  throws Exception {
		auth.inMemoryAuthentication().withUser("alex").password(passwordEncoder().encode("123")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("nico").password(passwordEncoder().encode("123")).roles("USER");
	    auth.inMemoryAuthentication().withUser("user").password(passwordEncoder().encode("password")).roles("USER");
	    auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("password")).roles("USER", "ADMIN");
	}

}
