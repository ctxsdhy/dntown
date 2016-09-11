package org.xs.dntown.wx.common.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.xs.dntown.wx.common.config.Global;

/**
 * 分页类
 * @param <T>
 */
public class Page<T> {

	/**
	 * 当前页码
	 */
	private int pageNo = 1;
	
	/**
	 * 每页数量
	 */
	private int pageSize = Integer.valueOf(Global.getConfig("page.pageSize"));
	
	/**
	 * 总记录数
	 */
	private long count;
	
	/**
	 * 数据集合
	 */
	private List<T> list = new ArrayList<T>();

	public Page(HttpServletRequest request) {
		
		if(!StringUtils.isEmpty(request.getParameter("pageNo"))) {
			setPageNo(Integer.parseInt(request.getParameter("pageNo")));
		}
		if(!StringUtils.isEmpty(request.getParameter("pageSize"))) {
			setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		}
	}
	
	public Page(int pageNo) {
		setPageNo(pageNo);
	}
	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		if(pageNo <= 0) {
			pageNo = 1;
		}
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if(pageSize > 0) {
			this.pageSize = pageSize;
		}
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
		if (pageSize >= count){
			pageNo = 1;
		}
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
