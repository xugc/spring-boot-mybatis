package com.boot.spring.shrio;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName KcaptchaProperty
 * @Description TODO
 * 
 */
@ConfigurationProperties(prefix = ShrioProperties.SHRIO_PREFIX)
public class ShrioProperties {
	public static final String SHRIO_PREFIX = "shrio";
	public static final String SHRIO_USERNAME_PARAM = "userName";
	public static final String SHRIO_PASSWORD_PARAM = "userPwd";
	public static final String SHRIO_VALIDATE_CODE_PARAM = "validateNumber";
	public static final String SHRIO_VALIDATE_CODE_ID_PARAM = "pageId";

}
