/**
 * @Title CsrfToken.java
 * @Package com.boot.spring.shrio.csrf
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-7-8 下午1:44:27
 * @version V1.0
 */
package com.boot.spring.shrio.csrf;

/**
 * @ClassName CsrfToken
 * @Description TODO
 * 
 */
public interface CsrfToken {
	public String getCsrfTokenParamName();

	public String getCsrfTokenValue();
}
