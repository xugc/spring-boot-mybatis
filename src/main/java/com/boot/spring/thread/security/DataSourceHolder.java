/**
 * @Title DataSourceHolder.java
 * @Package com.boot.spring.thread.security
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-8-18 下午5:23:00
 * @version V1.0
 */
package com.boot.spring.thread.security;

/**
 * @ClassName DataSourceHolder
 * @Description TODO
 * 
 */
public class DataSourceHolder {
	public static final String MASTER_DB = "dataSource";
	public static final String SLAVER1_DB = "slaver1DataSource";
	private static final ThreadLocal<String> onUsingDB = new ThreadLocal<String>();

	public static void setUsingDB(String dbName) {
		onUsingDB.set(dbName);
	}

	public static String getUsingDB() {
		return onUsingDB.get();
	}

	public static void clearUsingDB() {
		onUsingDB.remove();
	}
}
