package com.boot.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		return new UserDetailServicesImpl();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/", "/home", "/error", "/imgCreator/*",
						"/images/**/*", "/js/*", "/css/*").permitAll()
				.anyRequest().authenticated().and().formLogin()
				.loginPage("/admin/login").loginProcessingUrl("/admin/submit")
				.usernameParameter("userName").passwordParameter("userPwd")
				.defaultSuccessUrl("/admin/success").permitAll().and().logout()
				.logoutSuccessUrl("/admin/login").permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.userDetailsService(userDetailsService());
	}

}