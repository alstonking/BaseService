package com.xinnet.test.vhost;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author zhaojian
 * @date 2015年1月28日 下午5:02:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestVhost {

	
	@Test
	@Rollback(false)
	public void testUpdateThrow() {
		assertEquals(true, true);
	}
}
