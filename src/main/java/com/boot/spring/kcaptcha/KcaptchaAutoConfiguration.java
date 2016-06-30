/**
 * @Title KcaptchaAutoConfiguration.java
 * @Package com.boot.spring.config
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-6-20 下午3:11:49
 * @version V1.0
 */
package com.boot.spring.kcaptcha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;

/**
 * @ClassName KcaptchaAutoConfiguration
 * @Description TODO
 * 
 */
@Configuration
@EnableConfigurationProperties(KcaptchaProperties.class)
public class KcaptchaAutoConfiguration {
	private static final Logger logger = LoggerFactory
			.getLogger(KcaptchaAutoConfiguration.class);
	@Autowired
	private KcaptchaProperties properties;

	@Bean(name = "captchaProducer")
	@ConditionalOnMissingBean
	public DefaultKaptcha kaptchaProducer() {
		DefaultKaptcha kaptcha = new DefaultKaptcha();
		Config config = new Config(properties.getProperties());
		kaptcha.setConfig(config);
		return kaptcha;
	}
}
