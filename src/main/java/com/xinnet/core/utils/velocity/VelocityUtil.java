package com.xinnet.core.utils.velocity;

import java.util.List;

/**
 * Velocity标签工具类
 * @author zhaojian
 * @date 2014年12月4日 下午1:36:13
 */

public class VelocityUtil {
	
	/**
	 * 返回list是否包含obj
	 * @author zhaojian
	 * @date 2014年12月4日 下午1:37:22
	 * @param list	集合
	 * @param obj	对象
	 * @return
	 */
	public static boolean contains(List<Object> list, Object obj) {
		if (null == list || list.isEmpty() || null == obj) {
			return false;
		}
		return list.contains(obj);
	}
}
