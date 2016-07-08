/**
 * @Title DefaultCsrfToken.java
 * @Package com.boot.spring.shrio.csrf.defaultcsrftoken
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-7-8 下午1:45:52
 * @version V1.0
 */
package com.boot.spring.shrio.csrf.defaultcsrftoken;

import java.util.concurrent.atomic.AtomicLong;

import com.boot.spring.shrio.csrf.CsrfToken;

/**
 * @ClassName DefaultCsrfToken
 * @Description TODO
 * 
 */
public class DefaultCsrfToken implements CsrfToken {
	private static final AtomicLong CSRF_INDEX = new AtomicLong();
	private static final String DEFAULT_CSRF_PARAM_PREFIX = "_csrf_";
	private String csrfParamPrefix = DEFAULT_CSRF_PARAM_PREFIX;
	private String csrfTokenParamName;
	private String csrfTokenValue;

	public DefaultCsrfToken() {
		init();
	}

	public DefaultCsrfToken(String csrfParamPrefix) {
		this.csrfParamPrefix = csrfParamPrefix;
		init();
	}

	private void init() {
		long index = CSRF_INDEX.getAndIncrement();
		StringBuffer sb = new StringBuffer();
		sb.append(csrfParamPrefix);
		sb.append(index);
		csrfTokenParamName = sb.toString();
		sb.delete(0, sb.length() - 1);
		long currentSec = System.currentTimeMillis();
		sb.append(currentSec);
		csrfTokenValue = sb.toString();
	}

	@Override
	public String getCsrfTokenParamName() {
		return csrfTokenParamName;
	}

	@Override
	public String getCsrfTokenValue() {
		return csrfTokenValue;
	}

}
