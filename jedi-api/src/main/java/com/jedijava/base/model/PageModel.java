package com.jedijava.base.model;

import java.io.Serializable;

public class PageModel implements Serializable {

	private static final long serialVersionUID = 5613841312631430556L;

	/** 当前页码 */
	private int pageIndex = 1;

	/** 每页容量 */
	private int pageSize = 20;

	/** 是否分页 */
	private Boolean isPage = true;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 设置当前页
	 */
	public void setPageIndex(int pageIndex) {
		if (pageIndex <= 0) {
			pageIndex=1;
		}
		this.pageIndex = pageIndex;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * mysql startRow begin 0!
	 */
	public int getStartRow() {
		return pageSize * (pageIndex - 1);
	}

	public Boolean getIsPage() {
		return isPage;
	}

	public void setIsPage(Boolean isPage) {
		this.isPage = isPage;
	}

}
