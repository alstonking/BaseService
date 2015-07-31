package com.xinnet.core.utils.http;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;


/**
 * Http请求测试类
 * @author zhaojian
 * @date 2014-11-3 上午10:17:33
 */
public class HttpClientTest {
	
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		tt.start();
		TestThread tt1 = new TestThread();
		tt1.start();
		TestThread tt2 = new TestThread();
		tt2.start();
	}
	
	static class TestThread extends Thread{
		
		@Override
		public void run() {
			long currentTimeMillis = System.currentTimeMillis();
			for(int i=0;i<10000;i++) {
				try {
					HttpClient.post("http://localhost:8081/autoLogin/abcd", null, null);
				} catch (ClientProtocolException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println(System.currentTimeMillis() - currentTimeMillis);
		}
	}
}
