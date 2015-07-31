package com.xinnet.core.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtil {
	
	private static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static Logger log = LoggerFactory.getLogger(DateUtil.class);
	/**
	 * 
	 *
	 * 功能描述:String类型转换UtilDate
	 *
	 * @author 湛智
	 * 
	 * @time 2014年10月28日
	 *
	 */
	public synchronized static Date stringToUtilDate(String date) {
		
		try {
			return sf.parse(date);
			
		} catch (ParseException e) {
			
			log.error("<String转换Date失败："+date+" >");
			return null;
		}
	}
	
	/**
	 * 
	 *
	 * 功能描述:UtilDate类型转换String
	 *
	 * @author 湛智
	 * 
	 * @time 2014年10月28日
	 *
	 */
	public synchronized static String utilDateToString(Date date) {
		
		try {
			
			return sf.format(date);
			
		} catch (Exception e) {
			
			log.error("<String转换Date失败："+date+" >");
			return "";
		}
	}
	
	/**
	 * 根据指定格式把Date转换成字符串
	 * @author zhaojian
	 * @date 2014年12月29日 下午1:14:11
	 * @param date
	 * @param format
	 * @return
	 */
	public synchronized static String dataToString (Date date , String format) {
		SimpleDateFormat sf = new SimpleDateFormat(format);
		return sf.format(date);
	}
	
	/**
	 * 
	 *
	 * 功能描述:与当前日期比较 参数日期比当前日期大或相等返回true 否则false(String)
	 *
	 * @author 湛智
	 * 
	 * @time 2015年1月19日
	 *
	 */
	public static boolean compareWithNowDate(String dateStr) {
		Date date = DateUtil.stringToUtilDate(dateStr);
		Date nowDate = new Date();
		if(date.after(nowDate) || date.equals(nowDate)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 *
	 * 功能描述:与当前日期比较 参数日期比当前日期大或相等返回true 否则false(Date)
	 *
	 * @author 湛智
	 * 
	 * @time 2015年1月19日
	 *
	 */
	public static boolean compareWithNowDate(Date date) {
		Date nowDate = new Date();
		if(date.after(nowDate) || date.equals(nowDate)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 *
	 * 功能描述:与自定义当前日期比较(自定义参数为 + - 数  代表加减当前日期天数)
	 * 
	 * 参数日期比当前日期大或相等返回true 否则false(String)
	 *
	 * @author 湛智
	 * 
	 * @time 2015年1月19日
	 *
	 */
	public static boolean compareWithCustomNowDate(String dateStr, Integer day) {
		Date date = DateUtil.stringToUtilDate(dateStr);
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, day);
		Date nowDate = calendar.getTime();
		
		if(date.after(nowDate) || date.equals(nowDate)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 *
	 * 功能描述:与自定义当前日期比较(自定义参数为 + - 数  代表加减当前日期天数)
	 * 
	 * 参数日期比当前日期大或相等返回true 否则false(Date)
	 *
	 * @author 湛智
	 * 
	 * @time 2015年1月19日
	 *
	 */
	public static boolean compareWithCustomNowDate(Date date, Integer day) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, day);
		Date nowDate = calendar.getTime();
		
		if(date.after(nowDate) || date.equals(nowDate)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * 功能描述:返回时间戳
	 * @author 湛智
	 * @time 2015年2月11日
	 */
	public static Long getTimestamp() {
		return new Date().getTime();
	}
}
