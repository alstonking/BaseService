package com.xinnet.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyUtil {

	/**
	 * 验证非零的正整数
	 * 
	 * @param str	待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean IsIntNumber(String str) {
		String regex = "^\\+?[1-9][0-9]*$";
		return match(regex, str);
	}

	/**
	 * 验证非零的正整数包括零
	 * 
	 * @param str 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean IsIntNumberAndIncludingZero(String str) {
		String regex = "^\\+?[0-9][0-9]*$";
		return match(regex, str);
	}
	
	/**
	 * 验证邮箱
	 * 
	 * @param str 待验证的字符串
	 * @return 如果是符合的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isEmail(String str) {
		String regex = "^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		return match(regex, str);
	}

	/**
	 * 验证验证输入汉字
	 * 
	 * @param str 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean IsChinese(String str) {
		String regex = "^[\u4e00-\u9fa5],{0,}$";
		return match(regex, str);
	}

	/**
	 * @param regex
	 *            正则表达式字符串
	 * @param str
	 *            要匹配的字符串
	 * @return 如果str 符合 regex的正则表达式格式,返回true, 否则返回 false;
	 */
	private static boolean match(String regex, String str) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	/**
	 * 要匹配的字符串
	 * @param password   要匹配的字符串
	 * @return
	 */
	public static boolean isAlphanumericAnd8To20Bit(String password) {
		Pattern pattern = Pattern.compile("^[0-9a-zA-Z]{8,20}$");
		return pattern.matcher(password).matches();
	}

	public static void main(String[] args) {
		System.err.println(isAlphanumericAnd8To20Bit("0123456789012345678901"));
	}
}
