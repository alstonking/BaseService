package com.xinnet.core.utils.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * httpClient常量类，关联property/httpClient.properties配置文件
 * @author zhaojian
 * @date 2014-11-3 上午9:58:37
 */
public class HttpClientConstants {
	
	private static Logger LOG = LoggerFactory.getLogger(HttpClientConstants.class);
	
	/**
	 * HttpClient 连接池最大链接数量，如果访问量很高建议加大数值
	 */
	public static Integer MAX_CONN_TOTAL = 0;
	
	/**
	 * 每个路由最大的连接数，<br>如果针对同一台接口服务器的并发量很多，建议加大数值
	 */
	public static Integer DEFAULT_MAX_PER_ROUTE = null;
	
	/**
	 * Socket超时时间，单位：毫秒
	 */
	public static Integer SOCKET_TIMEOUT = null;
	
	static {
		// 初始化属性
		Properties pro = new Properties();
		
		// 加载文件
		InputStream httpClientStream = HttpClientConstants.class.getClassLoader().getResourceAsStream("property/httpClient.properties");
		try {
			
			pro.load(httpClientStream);
			
			Object socketTimeOut = pro.get("socketTimeOut");
			SOCKET_TIMEOUT = Integer.valueOf(socketTimeOut.toString());
			
			Object maxConnTotal = pro.get("maxConnTotal");
			MAX_CONN_TOTAL = Integer.valueOf(maxConnTotal.toString());
			
			Object defultMaxPerRoute = pro.get("defultMaxPerRoute");
			DEFAULT_MAX_PER_ROUTE = Integer.valueOf(defultMaxPerRoute.toString());
			
		} catch (IOException e) {
			LOG.error("property/httpClient.properties文件加载失败！请查看该文件是否存在", e);
		}
	}
	
}
