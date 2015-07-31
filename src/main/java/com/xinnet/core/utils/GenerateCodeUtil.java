package com.xinnet.core.utils;

import java.util.Date;

/**
 * 
 *
 * 功能描述：生成Code工具类
 * 
 * @author 湛智
 *
 * 时间：2014年9月22日
 *
 */
public class GenerateCodeUtil {
	
	private static String timeStamp = new Date().getTime() + "";//
	private static String tempUserLabel = ConstantSet.TEMPUSERLABEL;//临时用户编号前缀
	private static String userLabel = ConstantSet.USERLABEL;//真实用户编号前缀
	private static String cartLabel = ConstantSet.CARTLABEL;//购物车编号前缀
	private static String ordersLabel = ConstantSet.ORDERSLABEL;//订单编号前缀
	private static String ordersInfoLabel = ConstantSet.ORDERSLABEL;//订单编号前缀
	private static String goodsLabel = ConstantSet.GOODSLABEL;//商品编号前缀
	
    private static String serverLabel = ConstantSet.SERVERLABEL;//服务器编码前缀
    private static String serverIpLabel = ConstantSet.SERVERIPLABEL;//服务器编码前缀
    
	/**
	 * 
	 *
	 * 功能描述：生成一个服务器编码Code
	 * 
	 * @author libingfeng
	 *
	 * @throws 2014年11月26日
	 *
	 */
	public synchronized static String getServerCode() {
		return serverLabel + timeStamp + (int)(Math.random() * 999999999);
	}
	
	/**
	 * 
	 *
	 * 功能描述：生成一个服务器编码Code
	 * 
	 * @author libingfeng
	 *
	 * @throws 2014年11月26日
	 *
	 */
	public synchronized static String getServerIpCode() {
		return serverIpLabel + timeStamp + (int)(Math.random() * 999999999);
	}
	
	
	/**
	 * 
	 *
	 * 功能描述：生成一个用户Code
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年9月22日
	 *
	 */
	public static String getUserCode(int maxUserId) {
		
		String userCode = userLabel + "000000000";
		
		String maxId = (maxUserId + 1) + "";
		
		userCode = userCode.substring(0, userCode.length() - maxId.length()) + maxId;
		
		return userCode;
	}
	
	/**
	 * 
	 *
	 * 功能描述：生成一个临时用户Code
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年9月22日
	 *
	 */
	public synchronized static String getTempUserCode() {
		return tempUserLabel + timeStamp + (int)(Math.random() * 999999999);
	}
	
	/**
	 * 
	 *
	 * 功能描述：生成一个购物车Code
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年9月22日
	 *
	 */
	public synchronized static String getShopCartCode() {
		return cartLabel + timeStamp + (int)(Math.random() * 999999999);
	}
	
	/**
	 * 
	 *
	 * 功能描述：生成一个商品Code
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年9月22日
	 *
	 */
	public synchronized static String getGoodsCode() {
		return goodsLabel + timeStamp + (int)(Math.random() * 999999999);
	}
	
	/**
	 * 
	 *
	 * 功能描述：生成一个订单Code
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年9月22日
	 *
	 */
	public synchronized static String getOrdersCode() {
		return ordersLabel + timeStamp + (int)(Math.random() * 999999999);
	}
	
	/**
	 * 
	 *
	 * 功能描述：生成一个订单详情Code
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年9月22日
	 *
	 */
	public synchronized static String getOrdersInfoCode() {
		return ordersInfoLabel + timeStamp + (int)(Math.random() * 999999999);
	}
	
	/**
	 * 
	 *
	 * 功能描述：生成一个注册邮箱验证Code
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年10月31日
	 *
	 */
	public synchronized static String getRegistEmailCheckCode() {
		return timeStamp + (int)(Math.random() * 999999999);
	}
	
	/**
	 * 生成TaskCode
	 * @return
	 */
	public synchronized static String getTaskCode() {
		return timeStamp + (int)(Math.random() * 999999999);
	}
	
	/**
	 * 生成JobCode
	 * @return
	 */
	public synchronized static String getJobCode() {
		return timeStamp + (int)(Math.random() * 999999999);
	}
}
