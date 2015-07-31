package com.xinnet.core.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpClientUtil {
	private static Logger log = LoggerFactory.getLogger(HttpClientUtil.class);

	public static String post(String url, Map<String, String> params,
			String encoding) throws Exception {

		HttpPost post = new HttpPost(url);
		String result = "";
        
		try {
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			for (Entry<String, String> entry : params.entrySet()) {
				nvps.add(new BasicNameValuePair(entry.getKey(), entry
						.getValue()));
			}
			UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(nvps);
			if (StringUtils.isNotEmpty(encoding)) {
				formEntity.setContentEncoding(encoding);
			}

			post.setEntity(formEntity);
			HttpClient client = HttpClients.createDefault();
			HttpResponse response = client.execute(post);
			result = getHttpResult(response, encoding);

		} catch (Exception e) {

			// 保证出现异常的情况下，链接能正常释放
			if (post != null && !post.isAborted())
				post.abort();

			throw new Exception(e.getMessage(), e);
		}
		return result;
	}
	
	public static String post(String url, Map<String, String> params,
			 Header header) throws Exception {

		HttpPost post = new HttpPost(url);
		String result = "";
        
		try {
			post.addHeader(header);
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			for (Entry<String, String> entry : params.entrySet()) {
				nvps.add(new BasicNameValuePair(entry.getKey(), entry
						.getValue()));
			}
			UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(nvps,"utf-8");
			 

			post.setEntity(formEntity);
			HttpClient client = HttpClients.createDefault();
			HttpResponse response = client.execute(post);
			result = getHttpResult(response, "utf-8");

		} catch (Exception e) {

			// 保证出现异常的情况下，链接能正常释放
			if (post != null && !post.isAborted())
				post.abort();

			throw new Exception(e.getMessage(), e);
		}
		return result;
	}


	public static String get(String url, String encoding) throws Exception {
		HttpGet get = new HttpGet(url);
		String result = "";
		try {
			HttpClient client = HttpClients.createDefault();
			HttpResponse response = client.execute(get);
			result = getHttpResult(response, encoding);
		} catch (Exception e) {
			if (get != null && !get.isAborted())
				get.abort();
			throw new Exception(e.getClass().getName() + ":" + e.getMessage(),
					e);
		}
		return result;
	}

	private static String getHttpResult(HttpResponse response, String encoding)
			throws Exception {
		HttpEntity entity = response.getEntity();
		// 判断返回的状态是不是200
		int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode == 200) {
			if (entity != null) {
				BufferedReader br = null;
				try {
					InputStreamReader streamReader = StringUtils
							.isEmpty(encoding) ? new InputStreamReader(
							entity.getContent()) : new InputStreamReader(
							entity.getContent(), encoding);
					br = new BufferedReader(streamReader);

					String tempbf;
					StringBuilder html = new StringBuilder();
					while ((tempbf = br.readLine()) != null) {
						html.append(tempbf + "\r\n");
					}

					String result = html.toString();

					log.debug(result);

					return result;

				} finally {
					if (br != null)
						br.close();
				}
			}
		} else {
			throw new Exception("error: httpResponse status " + statusCode
					+ "!!!");
		}
		return "";
	}
	
	/**
	 * 
	 *
	 * 功能描述:map参数的get请求
	 *
	 * @author 湛智
	 * 
	 * @time 2014年12月3日
	 *
	 */
	public static String get(String url, Map<String,Object> param,String encoding) throws Exception {
		
		url += mapToHttpParamString(param);
		
		HttpGet get = new HttpGet(url);
		String result = "";
		try {
			HttpClient client = HttpClients.createDefault();
			HttpResponse response = client.execute(get);
			result = getHttpResult(response, encoding);
		} catch (Exception e) {
			if (get != null && !get.isAborted())
				get.abort();
			throw new Exception(e.getClass().getName() + ":" + e.getMessage(),
					e);
		}
		return result;
	}
	
	/**
	 * 
	 *
	 * 功能描述：Map转换http get请求参数格式字符串
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年8月5日
	 *
	 */
	public static String mapToHttpParamString(Map<String,Object> param) {
		Iterator<Map.Entry<String, Object>> iterator = param.entrySet().iterator();
		StringBuffer resultBuffer = new StringBuffer("?");
		while(iterator.hasNext()) {
			Map.Entry<String, Object> entry=iterator.next();
			resultBuffer.append(entry.getKey() + "=" + entry.getValue()).append("&");
		}
		String result=resultBuffer.toString();
		if(result != null && !result.equals("")) {
			result = result.substring(0, result.length()-1);
		}
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		
		Map<String,String> params = new HashMap<String,String>();
		
			/**
			 * 开通虚机
			 */
			
			/**
			 * 开通数据库
			 */
			String serviceCode = GenerateCodeUtil.getOrdersCode();
			params.put("endTime", "1");//2017-02-06 12:00:00
			params.put("openTime", DateUtil.utilDateToString(new Date()));
			params.put("serviceCode", serviceCode);
			params.put("productCode", "AG0000000000000004");
			params.put("mainDomain", GenerateCodeUtil.getOrdersCode());
			params.put("roomDictKey", "BJGH");
			System.out.println(serviceCode);
			/**
			 * 解绑主域名
			 */
//			params.put("serviceCode", "V40866805947206");
//			params.put("mainDomain", "test.com");
			
			/**
			 * 重新打开虚机
			 */
//			params.put("userName", "host9095199");
//			params.put("endTime", "2016-12-28 16:18:07");
			
			/**
			 * 主域名变更
			 */ 
//			params.put("serviceCode", "V62821509693895");
//			params.put("mainDomain",	 "bywangshuai2.com");
			
//			for(int i=0;i<30;i++) {
//				Thread thread = new Thread(new Runnable() {
//					String mainDomain = GenerateCodeUtil.getOrdersCode();
//					String serviceCode = GenerateCodeUtil.getOrdersCode();
//
//					@Override
//					public void run() {
//						// TODO Auto-generated method stub
//						String result;
//						try {
//							final Map<String,String> params = new HashMap<String,String>();
//							params.put("endTime", "2017-02-06 12:00:00.0");
//							params.put("openTime", DateUtil.utilDateToString(new Date()));
//							params.put("productCode", "AG0000000000000004");
//							params.put("roomDictKey", "BJGH");
//							params.put("mainDomain", mainDomain);
//							params.put("serviceCode", serviceCode);
//							log.info("--------------mainDomain:" + mainDomain);
//							result = HttpClientUtil.post("http://172.23.176.38:8080/resourceManagement/provider/open", params, "UTF-8");
//							System.out.println(result);
//						} catch (Exception e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						
//					}
//					
//				});
//				thread.start();
//			}
//		String ipBasedURL = PropUtil.getMessage("apiAddress") + PropUtil.getMessage("ipBasedURL");
//		Map<String,String> param = new HashMap<String,String>();
//		param.put("ipBased", "true");
//		param.put("ipAddr", "192.168.1.1");
//		param.put("userName", "host123456");
//		String result = HttpClientUtil.post(ipBasedURL + UUID.randomUUID().toString(), param, "UTF-8");
//		System.out.println(result);
			
			String result = HttpClientUtil.post("http://172.23.176.38:8080/resourceManagement/provider/open", params, "UTF-8");
			System.out.println(result);
			
	}
}
