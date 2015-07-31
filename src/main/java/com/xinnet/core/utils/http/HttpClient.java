package com.xinnet.core.utils.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

/**
 * 封装的Http请求类
 * @author zhaojian
 * @date 2014-11-3 上午10:17:33
 */
public class HttpClient {
	
	private static Logger LOG = Logger.getLogger(HttpClient.class);
    
	/**
	 * post请求标记
	 */
	public static String METHOD_POST = "post";
	
	/**
	 * get请求标记
	 */
	public static String METHOD_GET = "get";
	
	/**
	 * UTF-8字符集
	 */
	private static final String CHARSET_UTF8 = "UTF-8";
	
	private static CloseableHttpClient httpclient = null;
	
	// 初始化连接池与HTTP客户端等对象
	static {
		
		// 创建连接配置
		ConnectionConfig connConfig = ConnectionConfig.custom().setCharset(Consts.UTF_8).build();
		
		// 创建Socket配置对象
		SocketConfig socketConfig = SocketConfig.custom().setSoTimeout(HttpClientConstants.SOCKET_TIMEOUT).build();
		
		// 创建客户端连接管理器
		PoolingHttpClientConnectionManager	connManager = new PoolingHttpClientConnectionManager();
		connManager.setMaxTotal(HttpClientConstants.MAX_CONN_TOTAL);
		connManager.setDefaultMaxPerRoute(HttpClientConstants.DEFAULT_MAX_PER_ROUTE);
		
		// 设置默认配置对象
		connManager.setDefaultConnectionConfig(connConfig);
		connManager.setDefaultSocketConfig(socketConfig);
		
		// 初始化请求客户端对象
		httpclient = HttpClientBuilder.create().setConnectionManager(connManager).build();
	}
	
	/**
	 * 发送POST请求，返回值为请求的响应结果字符串
	 * @author zhaojian
	 * @date 2014-11-3 上午10:21:01
	 * @param url	要请求地址，如果为空可能会抛异常
	 * @param param	表单参数，KEY为表单项name名，VALUE为表单项的值，可以为空
	 * @param headerParam	Http请求头信息，可以为空
	 * @return	响应的结果
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public static String post(String url,Map<String,Object> param,Map<String,Object> headerParam) throws ClientProtocolException, IOException {

		if (null == url || url.isEmpty()) {
			throw new IllegalArgumentException("请求地址URL不能为空！");
		}
		
		HttpPost httppost = new HttpPost(url);  						// 生成请求
    	
        if(param != null && !param.isEmpty()) {	// 迭代参数map
            httppost.setEntity(new UrlEncodedFormEntity(getParamEntity(param), CHARSET_UTF8)); // 设置参数给Post
        }
        
        // 添加请求头信息
        if(headerParam != null && !headerParam.isEmpty()) {
        	for (String headerKey : headerParam.keySet()) {
        		httppost.addHeader(headerKey, headerParam.get(headerKey).toString());
			}
        }
        
        HttpResponse response = httpclient.execute(httppost);  			// 发出请求
        
        LOG.info("请求地址 :  [ " + url + " ]    StatusCode：[ " + response.getStatusLine().getStatusCode() + " ]    Method ：  [ " + METHOD_POST + " ]");
        
        int statusCode = response.getStatusLine().getStatusCode();
        
        if (200 != statusCode) {
        	return "{\"statusCode\":\"" + statusCode + "\"}";
        }
        
        if (null != param && !param.isEmpty()) {
        	LOG.info("请求参数 : " + param.toString());
        }
        
        if (null != headerParam && !headerParam.isEmpty()) {
	        LOG.info("请求头参数 : " + headerParam.toString());
        }
        
        String string = EntityUtils.toString(response.getEntity());
        
        // 因为域名查询解析接口返回结果字符串超级超级超级长   所以这里屏蔽
        if (url.contains("mydns/mydnsop/mydns_query")) {
        	return string;
        }
        if (null != string && !string.isEmpty()) {
	        LOG.info("响应结果 :  [ " + string + " ]");
        }
		return string;
	}
	
	/**
	 * 发送POST请求，返回值为请求的响应结果字符串
	 * @author zhaojian
	 * @date 2014-11-3 上午10:21:01
	 * @param url	要请求地址，如果为空可能会抛异常
	 * @param param	表单参数，KEY为表单项name名，VALUE为表单项的值，可以为空
	 * @return	响应的结果
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public static String post(String url,Map<String,Object> param) throws ClientProtocolException, IOException {
		return post(url, param, null);
	}
	
	public static String get(String url,Map<String,Object> param,Map<String,Object> headerParam) throws ClientProtocolException, IOException {
		
		if (null == url || url.isEmpty()) {
			throw new IllegalArgumentException("请求地址URL不能为空！");
		}
		
		if(param != null && !param.isEmpty()) {
    		// 将参数拼接到url地址后
    		url += "?" + EntityUtils.toString(new UrlEncodedFormEntity(getParamEntity(param), CHARSET_UTF8));
    	}
    	
    	// 生成请求
    	HttpGet httpGet = new HttpGet(url);
    	
        // 添加请求头信息
        if(headerParam != null && !headerParam.isEmpty()) {
        	for (String headerKey : headerParam.keySet()) {
        		httpGet.addHeader(headerKey, headerParam.get(headerKey).toString());
			}
        }
        
    	// 发出请求 
    	HttpResponse response = httpclient.execute(httpGet);
    	
    	LOG.info("请求地址 :  [ " + url + " ]    StatusCode：[ " + response.getStatusLine().getStatusCode() + " ]    Method ：  [ " + METHOD_POST + " ]");
    	
    	 if (null != param && !param.isEmpty()) {
         	LOG.info("请求参数 : " + param.toString());
         }
         
         if (null != headerParam && !headerParam.isEmpty()) {
 	        LOG.info("请求头参数 : " + headerParam.toString());
         }
         
         String string = EntityUtils.toString(response.getEntity());
         
         // 因为域名查询解析接口返回结果字符串超级超级超级长   所以这里屏蔽
         if (url.contains("mydns/mydnsop/mydns_query")) {
         	return string;
         }
         if (null != string && !string.isEmpty()) {
 	        LOG.info("响应结果 :  [ " + string + " ]");
         }		
         return string;
	}

	/**
	 * 根据Map生成Http请求的请求参数对象集合
	 * @author zhaojian
	 * @date 2014-11-3 上午11:04:36
	 * @param param	
	 * @return	返回值用于请求参数提交
	 */
	private static List<BasicNameValuePair> getParamEntity(Map<String, Object> param) {
		List<BasicNameValuePair> paramList = new ArrayList<BasicNameValuePair>();
		Set<String> keySet = param.keySet();
		Object key = null;
		Object value = null;
		
		for (Iterator<String> it = keySet.iterator(); it.hasNext();) {
			key = it.next();
			value = param.get(key);
			if (null == key || null == value) {
				continue;
			}
			
			paramList.add(new BasicNameValuePair(key.toString(), value.toString())); // 参数 
		}
		return paramList;
	}
	
}
