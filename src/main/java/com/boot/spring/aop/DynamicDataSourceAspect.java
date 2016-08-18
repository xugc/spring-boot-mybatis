/**
 * @Title DynamicDataSourceAspect.java
 * @Package com.boot.spring.aop
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-8-18 下午5:30:08
 * @version V1.0
 */
package com.boot.spring.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import com.boot.spring.thread.security.DataSourceHolder;

/**
 * @ClassName DynamicDataSourceAspect
 * @Description TODO
 * 
 */
@Aspect
public class DynamicDataSourceAspect {
	@Pointcut("execution (public com.boot.spring.service.impl..*.*(..))")
	public void serviceExecution() {
	}

	@Before("serviceExecution()")
	public void setDynamicDataSource(JoinPoint joinpoint) {
		MethodSignature methodSignature = (MethodSignature) joinpoint
				.getSignature();
		Method method = methodSignature.getMethod();
		String methodName = method.getName();

		boolean isReadOnly = false;
		if (methodName.startsWith("get") || methodName.startsWith("find")
				|| methodName.startsWith("count")
				|| methodName.startsWith("select")
				|| methodName.startsWith("list")
				|| methodName.startsWith("query")
				|| methodName.startsWith("export")) {
			isReadOnly = true;
		}
		String dbHolder = isReadOnly ? DataSourceHolder.SLAVER1_DB
				: DataSourceHolder.MASTER_DB;

		DataSourceHolder.setUsingDB(dbHolder);
	}
}
