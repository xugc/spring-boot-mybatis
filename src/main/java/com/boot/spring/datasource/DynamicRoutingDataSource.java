/**
 * @Title DynamicRoutingDataSource.java
 * @Package com.boot.spring.datasource
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-8-18 下午5:18:46
 * @version V1.0
 */
package com.boot.spring.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.boot.spring.thread.security.DataSourceHolder;

/**  
 * @ClassName DynamicRoutingDataSource  
 * @Description TODO  
 *    
 */
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceHolder.getUsingDB();
	}

}
