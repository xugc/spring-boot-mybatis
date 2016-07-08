/**
 * @Title CsrfTokenUtil.java
 * @Package com.boot.spring
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-7-8 下午1:21:00
 * @version V1.0
 */
package com.boot.spring.shrio.csrf;

import com.boot.spring.shrio.csrf.defaultcsrftoken.DefaultCsrfToken;

/**
 * @ClassName CsrfTokenUtil
 * @Description TODO
 * 
 */
public class CsrfTokenFactory {

	public static CsrfToken createCsrfToken(String type) {
		if (type.equals(CsrfTokenType.DEFAULT_TOKEN)) {
			return new DefaultCsrfToken();
		}
		return null;
	}
}
