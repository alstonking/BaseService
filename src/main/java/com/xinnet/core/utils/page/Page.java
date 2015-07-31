package com.xinnet.core.utils.page;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 *
 * 功能描述：分页工具类
 * 
 * @author 湛智
 *
 * 时间：2014年9月16日
 * @param <T>
 *
 */
public class Page<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer pageSize = 10;//一页显示多少条
	
	private Integer nowPage = 1;//第几页  初始为1
	
	private Integer pageCount;//需要分页的总记录数
	
	private Integer maxPage;//最大页数
	
	private Integer pageNum;//从第几条开始查询分页
	
	private List<T> objects;//分页返回的对象
	
	public Page() {
		
	}
	/**
	 * 计算分页逻辑(默认一页显示条数)
	 * @param pageCount
	 * @param nowPage
	 */
	public Page(Integer pageCount,Integer nowPage) {
		this.pageCount = pageCount;
		
		//计算最大页
		this.maxPage = pageCount % this.pageSize == 0 ? pageCount / this.pageSize : pageCount / pageSize + 1;
		
		//计算当前需要从第几条开始分页
		this.nowPage = nowPage < 1 ? this.nowPage = 1 : nowPage > this.maxPage ? this.maxPage : nowPage;
		
		//得到分页开始的记录数
		this.pageNum = (this.nowPage - 1) * pageSize;
		
		//开始的记录数为负数则设为0
		this.pageNum = this.pageNum >= 0 ? this.pageNum : 0;
		
	}
	
	/**
	 * 计算分页逻辑(自定义一页显示条数)
	 * @param pageCount
	 * @param nowPage
	 */
	public Page(Integer pageCount,Integer nowPage,Integer pageSize) {
		this.pageSize = pageSize;
		this.pageCount = pageCount;
		
		//计算最大页
		this.maxPage = pageCount % this.pageSize == 0 ? pageCount / this.pageSize : pageCount / pageSize + 1;
		
		//计算当前需要从第几条开始分页
		this.nowPage = nowPage < 1 ? this.nowPage = 1 : nowPage > this.maxPage ? this.maxPage : nowPage;
		
		//得到分页开始的记录数
		this.pageNum = (this.nowPage - 1) * pageSize;
		
		//开始的记录数为负数则设为0
		this.pageNum = this.pageNum >= 0 ? this.pageNum : 0;
		
	}
	
	/**
	 * 
	 *
	 * 功能描述：封装返回mybatis RowBounds分页
	 * 
	 * @author 湛智
	 *
	 * @throws 2014年9月23日
	 *
	 */
	public Map<String,Object> rowBounds(Object object) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("t", object);
		map.put("s", this.getPageNum());
		map.put("e", this.getPageSize());
		return map;
	}
	
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getNowPage() {
		return nowPage;
	}
	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(Integer maxPage) {
		this.maxPage = maxPage;
	}
	public List<T> getObjects() {
		return objects;
	}
	public void setObjects(List<T> objects) {
		this.objects = objects;
	}
	
}
