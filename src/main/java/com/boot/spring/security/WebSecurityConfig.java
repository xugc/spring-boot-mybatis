//package com.boot.spring.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter;
//
//import com.boot.spring.security.filter.ValidateCodeAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	@Bean
//	protected UserDetailsService userDetailsService() {
//		return new UserDetailServicesImpl();
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.addFilterBefore(new ValidateCodeAuthenticationFilter(), DefaultLoginPageGeneratingFilter.class);
//		http.authorizeRequests()
//				.antMatchers("/", "/home", "/error", "/imgCreator/*",
//						"/images/**/*", "/js/*", "/css/*").permitAll()
//				.anyRequest().authenticated().and().formLogin()
//				.loginPage("/admin/login").usernameParameter("userName")
//				.passwordParameter("userPwd")
//				.loginProcessingUrl("/admin/submit")
//				.defaultSuccessUrl("/admin/success").permitAll().and().logout()
//				.logoutSuccessUrl("/admin/login").permitAll();
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth)
//			throws Exception {
//		ShaPasswordEncoder pwdEncoder = new ShaPasswordEncoder(256);
//		pwdEncoder.setEncodeHashAsBase64(true);
//		auth.userDetailsService(userDetailsService()).passwordEncoder(
//				pwdEncoder);
//	}
//
//	public static void main(String[] args) {
//		ShaPasswordEncoder sha = new ShaPasswordEncoder(256);
//		sha.setEncodeHashAsBase64(true);
//		String pwd = sha.encodePassword("123", null);
//		System.out.println("哈希算法 256: " + pwd + " len=" + pwd.length());
//	}
//
//}