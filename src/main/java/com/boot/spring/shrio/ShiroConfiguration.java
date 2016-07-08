package com.boot.spring.shrio;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import com.boot.spring.shrio.filter.CaptchaFormAuthenticationFilter;

/**
 * @ClassName ShiroConfiguration
 * @Description TODO
 * 
 */
@Configuration
@EnableConfigurationProperties(ShrioProperties.class)
public class ShiroConfiguration {
	private static final Logger logger = LoggerFactory
			.getLogger(ShiroConfiguration.class);

	public EhCacheManager getEhCacheManager() {
		EhCacheManager em = new EhCacheManager();
		em.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
		return em;
	}

	/**
	 * 注册DelegatingFilterProxy（Shiro）
	 * 
	 * @param dispatcherServlet
	 * @return * @author SHANHY
	 * @create 2016年1月13日
	 */
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
		filterRegistration.setFilter(new DelegatingFilterProxy("shiroFilter"));
		// 该值缺省为false,表示生命周期由SpringApplicationContext管理,设置为true则表示由ServletContainer管理
		filterRegistration.addInitParameter("targetFilterLifecycle", "true");
		filterRegistration.setEnabled(true);
		filterRegistration.addUrlPatterns("/*");
		return filterRegistration;
	}

	@Bean(name = "lifecycleBeanPostProcessor")
	public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	@Bean
	public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
		daap.setProxyTargetClass(true);
		return daap;
	}

	@Bean(name = "securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(
			LoginAuthorizingRealm loginAuthorizingRealm) {
		logger.info("------------加载web环境shiro管理器--------------");
		DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
		dwsm.setRealm(loginAuthorizingRealm); // <!-- 用户授权/认证信息Cache, 采用EhCache 缓存 -->
		dwsm.setCacheManager(getEhCacheManager());
		return dwsm;
	}

	@Bean
	public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(
			LoginAuthorizingRealm loginAuthorizingRealm) {
		AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
		aasa.setSecurityManager(getDefaultWebSecurityManager(loginAuthorizingRealm));
		return new AuthorizationAttributeSourceAdvisor();
	}

	/**
	 * 加载shiroFilter权限控制规则（从数据库读取然后配置）
	 * 
	 * @author SHANHY
	 * @create 2016年1月14日
	 */
	private void loadShiroFilterChain(
			ShiroFilterFactoryBean shiroFilterFactoryBean) {
		logger.info("------------配置访问路径权限--------------");
		// /////////////////////
		// 下面这些规则配置最好配置到配置文件中
		// ///////////////////////
		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
		//
		// authc：该过滤器下的页面必须验证后才能访问，它是Shiro内置的一个拦截器org.apache.shiro.web.filter.authc.FormAuthenticationFilter
//		filterChainDefinitionMap.put("/admin/main", "authc,perms[admin:manange]");//有顺序的同一个请求按照第一个来
		filterChainDefinitionMap.put("/admin/**", "authc");
		filterChainDefinitionMap.put("/homePage/**", "authc");
		filterChainDefinitionMap.put("/statistics/**", "authc");
		//
		// 这里为了测试，只限制/user，实际开发中请修改为具体拦截的请求规则
		// //
		// anon：它对应的过滤器里面是空的,什么都没做
		// logger.info("##################从数据库读取权限规则，加载到shiroFilter中##################");
		// filterChainDefinitionMap.put("/user/edit/**", "au,perms[user:edit]");
		// 这里为了测试，固定写死的值，也可以从数据库或其他配置中读取
		filterChainDefinitionMap.put("/js/**", "anon");
		filterChainDefinitionMap.put("/css/**", "anon");
		filterChainDefinitionMap.put("/images/**/**", "anon");
		filterChainDefinitionMap.put("/imgCreator/*", "anon");
		filterChainDefinitionMap.put("/index.*", "anon");
		// anon 可以理解为不拦截
		shiroFilterFactoryBean
				.setFilterChainDefinitionMap(filterChainDefinitionMap);
	}

	@Bean
	public CaptchaFormAuthenticationFilter getCaptchaFormAuthenticationFilter() {
		logger.info("------------加载自定义权限过滤器--------------");
		CaptchaFormAuthenticationFilter cfaFilter = new CaptchaFormAuthenticationFilter();
		cfaFilter.setUsernameParam(ShrioProperties.SHRIO_USERNAME_PARAM);
		cfaFilter.setPasswordParam(ShrioProperties.SHRIO_PASSWORD_PARAM);
		cfaFilter.setCaptchaParam(ShrioProperties.SHRIO_VALIDATE_CODE_PARAM);
		cfaFilter
				.setCaptchaIdParam(ShrioProperties.SHRIO_VALIDATE_CODE_ID_PARAM);
		cfaFilter.setLoginProcessUrl(ShrioProperties.LOGIN_PROCESS_URL);
		return cfaFilter;
	}

	/**
	 * ShiroFilter<br/>
	 * 
	 * @param loginAuthorizingRealm
	 * @return * @author SHANHY
	 * @create 2016年1月14日
	 */
	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(
			LoginAuthorizingRealm loginAuthorizingRealm) {

		logger.info("------------加载shiro过滤器工厂--------------");
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean(); // 必须设置
		shiroFilterFactoryBean
				.setSecurityManager(getDefaultWebSecurityManager(loginAuthorizingRealm));
		Map<String, Filter> filters = new HashMap<String, Filter>();
		filters.put("authc", getCaptchaFormAuthenticationFilter());
		shiroFilterFactoryBean.setFilters(filters);

		// //
		// 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
		shiroFilterFactoryBean.setLoginUrl("/admin/login");
		// //
		// 登录成功后要跳转的连接
		shiroFilterFactoryBean.setSuccessUrl("/admin/success");
		shiroFilterFactoryBean.setUnauthorizedUrl("/403");

		loadShiroFilterChain(shiroFilterFactoryBean);
		return shiroFilterFactoryBean;
	}
}