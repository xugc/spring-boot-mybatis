/**
 * @Title KcaptchaProperty.java
 * @Package com.boot.spring.config
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-6-20 下午3:01:04
 * @version V1.0
 */
package com.boot.spring.kcaptcha;

import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName KcaptchaProperty
 * @Description TODO
 * 
 */
@ConfigurationProperties(prefix = KcaptchaProperties.KCAPTCHA_PREFIX)
public class KcaptchaProperties {
	public static final String KCAPTCHA_PREFIX = "spring.kaptcha";
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
