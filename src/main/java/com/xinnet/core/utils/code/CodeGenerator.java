package com.xinnet.core.utils.code;

import java.util.UUID;

/**
 * 编码生成工具
 * @author zhaojian
 * @date 2014年11月27日 下午6:27:57
 */
public class CodeGenerator {
	private CodeGenerator(){}
	
	/**
	 * 返回32UUID
	 * @author zhaojian
	 * @date 2014年11月27日 下午6:31:50
	 * @return
	 */
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-","");
	}
}
