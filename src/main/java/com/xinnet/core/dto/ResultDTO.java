package com.xinnet.core.dto;

import java.io.Serializable;

import com.xinnet.core.utils.PropUtil;
/**
 * <h1>ResultDTO 说明：</h1>
 * 
 * <li><code>state：</code>状态 true/false 表示返回值是否为空 或是否正确 </li>
 * <li><code>stateCode：</code>返回提示消息的code 对应messageResource配置文件中的Key</li>
 * <li><code>msg：</code>调用ResultDTO的getXXX方法传入stateCode，msg自动设置为stateCode对应的值</li>
 * <li><code>object：</code>存储需要返回的对象</li>
 * 
 * @author 湛智
 *
 * @param <T>
 */
public class ResultDTO<T> implements Serializable {

	/**
	 *
	 * 功能描述：返回信息实体
	 * 
	 * @author 王湛智
	 *
	 * @date 2014年11月18日
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean state;
	private String stateCode;
	private String msg;
	private T object;
	
	public ResultDTO() {
		this.stateCode = "default.success";
		this.state = true;
		this.msg = PropUtil.getMessage(stateCode);
	}
	
	public ResultDTO(T str) {
		this.stateCode = "default.success";
		this.state = true;
		this.msg = PropUtil.getMessage(stateCode);
		this.object = str;
	}
	
	public ResultDTO(boolean state) {
		this.state = state;
	}
	
	public ResultDTO(String stateCode,boolean state) {
		this.stateCode = stateCode;
		this.state = state;
		this.msg = PropUtil.getMessage(stateCode);
	}
	
	public ResultDTO(T object,boolean state) {
		this.state = state;
		this.object = object;
	}
	
	public ResultDTO(String stateCode,T object,boolean state) {
		this.stateCode = stateCode;
		this.state = state;
		this.object = object;
		this.msg = PropUtil.getMessage(stateCode);
	}
	
	/**
	 * 
	 *
	 * 功能描述：设置成功返回值
	 * 
	 * @author 王湛智
	 *
	 * @date 2014年11月19日
	 *
	 */
	public static <T> ResultDTO<T> getSuccess(String stateCode,T object) {
		ResultDTO<T> result = new ResultDTO<T>(stateCode,object,true);
		return result;
	}
	
	public static <T> ResultDTO<T> getSuccess(String stateCode) {
		ResultDTO<T> result = new ResultDTO<T>(stateCode,true);
		return result;
	}
	
	public static <T> ResultDTO<T> getSuccess(T object) {
		ResultDTO<T> result = new ResultDTO<T>(object,true);
		return result;
	}
	
	public static <T> ResultDTO<T> getSuccess() {
		ResultDTO<T> result = new ResultDTO<T>();
		return result;
	}
	
	/**
	 * 
	 *
	 * 功能描述:设置错误信息 用于动态错误显示 无法使用配置文件获取错误信息的情况
	 *
	 * @author 湛智
	 * 
	 * @time 2014年12月10日
	 *
	 */
	public static <T> ResultDTO<T> getFailureMessage(String msg) {
		ResultDTO<T> result = new ResultDTO<T>(false);
		result.msg = msg;
		return result;
	}
	
	/**
	 * 
	 *
	 * 功能描述:设置成功信息 用于动态成功显示 无法使用配置文件获取成功信息的情况
	 *
	 * @author 湛智
	 * 
	 * @time 2014年12月10日
	 *
	 */
	public static <T> ResultDTO<T> getSuccessMessage(String msg) {
		ResultDTO<T> result = new ResultDTO<T>(true);
		result.msg = msg;
		return result;
	}
	
	/**
	 * 
	 *
	 * 功能描述：设置失败返回值
	 * 
	 * @author 王湛智
	 *
	 * @date 2014年11月19日
	 *
	 */
	public static <T> ResultDTO<T> getFailureResult(String stateCode,T object) {
		ResultDTO<T> result = new ResultDTO<T>(stateCode,object,false);
		return result;
	}
	
	public static <T> ResultDTO<T> getFailureResult(String stateCode) {
		ResultDTO<T> result = new ResultDTO<T>(stateCode,false);
		return result;
	}
	
	public static <T> ResultDTO<T> getFailureResult() {
		ResultDTO<T> result = new ResultDTO<T>(false);
		return result;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
}
