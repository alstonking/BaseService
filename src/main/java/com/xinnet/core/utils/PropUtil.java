package com.xinnet.core.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class PropUtil {

	private static final String CONFIG_FILE = "classpath*:property/*.properties"; // 资源文件
	
	private static final Map<String, String> configCache  = new HashMap<String, String>(); //缓存属性文件键值对

	static {
		Resource[] resource = PropUtil.getResources(CONFIG_FILE);
		InputStream inputstream = null;
		Properties properties = new Properties();
		for (Resource res : resource) {
			try {
				inputstream = res.getInputStream();
				properties.load(inputstream);
				Enumeration<?> pros = properties.propertyNames();
				while (pros != null && pros.hasMoreElements()) {
					String name = (String) pros.nextElement();
					if (StringUtils.isNotEmpty(name)) {
						configCache.put(name, properties.getProperty(name, ""));
					}
				}
			} catch (IOException e) {
				throw new RuntimeException("解析配置文件[" + CONFIG_FILE + "]异常:", e);
			} finally {
				if(inputstream != null){
					IOUtils.closeQuietly(inputstream);
				}
				properties.clear();
			}
		}
	}

	/**
	 * 获取资源文件
	 * 
	 * @param locationPattern
	 *            资源文件表达式
	 * @return
	 */
	public static Resource[] getResources(String locationPattern) {
		PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = new Resource[0];
		try {
			resources = patternResolver.getResources(locationPattern);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return resources;
	}
	
	
	/**
	 *  根据资源文件key获取对应的值
	 * @param key
	 * @return
	 */
	public static String getMessage(String key) {
        return configCache.get(key);
    }
	
}
