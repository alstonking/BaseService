package com.xinnet.core.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.UUID;

import org.acegisecurity.providers.encoding.MessageDigestPasswordEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringEscapeUtils;

public class EncodeUtil {
	private static final String DEFAULT_URL_ENCODING = "UTF-8";
	private static final char[] BASE62 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

	/**
	 * Hex编码.
	 */
	public static String encodeHex(byte[] input) {
		return Hex.encodeHexString(input);
	}

	/**
	 * Hex解码.
	 */
	public static byte[] decodeHex(String input) {
		try {
			return Hex.decodeHex(input.toCharArray());
		} catch (DecoderException e) {
			return null;
		}
	}

	/**
	 * Base64编码.
	 */
	public static String encodeBase64(byte[] input) {
		return Base64.encodeBase64String(input);
	}

	/**
	 * Base64编码, URL安全(将Base64中的URL非法字符'+'和'/'转为'-'和'_', 见RFC3548).
	 */
	public static String encodeUrlSafeBase64(byte[] input) {
		return Base64.encodeBase64URLSafeString(input);
	}

	/**
	 * Base64解码.
	 */
	public static byte[] decodeBase64(String input) {
		return Base64.decodeBase64(input);
	}

	/**
	 * Base62编码。
	 */
	public static String encodeBase62(byte[] input) {
		char[] chars = new char[input.length];
		for (int i = 0; i < input.length; i++) {
			chars[i] = BASE62[((input[i] & 0xFF) % BASE62.length)];
		}
		return new String(chars);
	}

	/**
	 * Html 转码.
	 */
	public static String escapeHtml(String html) {
		return StringEscapeUtils.escapeHtml4(html);
	}

	/**
	 * Html 解码.
	 */
	public static String unescapeHtml(String htmlEscaped) {
		return StringEscapeUtils.unescapeHtml4(htmlEscaped);
	}

	/**
	 * Xml 转码.
	 */
	@SuppressWarnings("deprecation")
	public static String escapeXml(String xml) {
		return StringEscapeUtils.escapeXml(xml);
	}

	/**
	 * Xml 解码.
	 */
	public static String unescapeXml(String xmlEscaped) {
		return StringEscapeUtils.unescapeXml(xmlEscaped);
	}

	/**
	 * URL 编码, Encode默认为UTF-8. 
	 */
	public static String urlEncode(String part) {
		try {
			return URLEncoder.encode(part, DEFAULT_URL_ENCODING);
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	/**
	 * URL 解码, Encode默认为UTF-8. 
	 */
	public static String urlDecode(String part) {

		try {
			return URLDecoder.decode(part, DEFAULT_URL_ENCODING);
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
	
	/**
	 * 
	 *
	 * 功能描述：生成随机盐
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年9月4日
	 *
	 */
	public static String randomSalt(String password) {
		int size = password.length();
		int hashCode = UUID.randomUUID().hashCode();
		hashCode = hashCode >> size;
		String salt = hashCode + new Date().getTime() + "";
        return salt;
    }
	
	/**
	 * 根据密码和盐值进行加密
	 * @author zhaojian
	 * @date 2014年11月28日 下午12:53:22
	 * @param password
	 * @param salt
	 * @return
	 */
	public static String encodePassword(String password, String salt) {
		MessageDigestPasswordEncoder mdpeSha = new MessageDigestPasswordEncoder("SHA-256"); 
		mdpeSha.setEncodeHashAsBase64(false);
		return mdpeSha.encodePassword(password, salt);
	}
	
	/**
	 * 根据密码计算盐值
	 * @author zhaojian
	 * @date 2014年11月28日 下午12:53:39
	 * @param password
	 * @return
	 */
	public static String getSalt(String password) {
		return randomSalt(password);
	}
	
	/**
	 * 
	 *
	 * 功能描述：解密处理
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年9月4日
	 *
	 */
	public static String deCodePassword(String password,String salt) {
		
		MessageDigestPasswordEncoder mdpeSha = new MessageDigestPasswordEncoder("SHA-256"); 
		mdpeSha.setEncodeHashAsBase64(false);
		
		password = mdpeSha.encodePassword(password, salt);
		
		return password;
	}
	
	public static void main(String[] args) {
		MessageDigestPasswordEncoder mdpeSha = new MessageDigestPasswordEncoder("SHA-256"); 
		mdpeSha.setEncodeHashAsBase64(false);
		System.out.println(mdpeSha.encodePassword("admin", "1409842098026"));
	}
}
