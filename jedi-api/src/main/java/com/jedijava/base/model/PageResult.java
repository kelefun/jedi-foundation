package com.jedijava.base.model;

import java.util.List;

public class PageResult {

	/** 总记录数 */
	private int totalItem = 200;

	/** 当前页码 */
	private int pageIndex = 1;

	/** 每页的记录数 */
	private int pageSize = 20;
	
	/**
	 * 总页数
	 */
	private int totalPage;

	/** 开始行 */
	private int startRow;
	

	/**
	 * 某一页的记录
	 */
	private List<?> module;

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public List<?> getModule() {
		return module;
	}

	public void setModule(List<?> module) {
		this.module = module;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

}
