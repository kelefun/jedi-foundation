package com.jedijava.crud.page;


import com.jedijava.common.exception.WebException;
import com.jedijava.base.model.PageModel;
import com.jedijava.base.model.PageResult;
import com.jedijava.common.result.DefaultResultCode;

import java.util.List;

public class PageHelper {

	public static PageResult fetchPage(Integer count, PageModel query, List<?> list) {
		// 计算总页数
		int totalPage = count / query.getPageSize();
		if ((count == 0) || ((count % query.getPageSize()) != 0)) {
			totalPage++;
		}
		if (query.getPageIndex() > totalPage) {
			throw new WebException(DefaultResultCode.ILLEGAL_ARGUMENT,
					"输入的页码[" + query.getPageIndex() + "]不能大于总页数[" + totalPage + "]");
		}
		PageResult result = new PageResult();
		result.setPageIndex(query.getPageIndex());
		result.setPageSize(query.getPageSize());
		result.setStartRow(query.getStartRow());
		result.setTotalItem(count);
		result.setTotalPage(totalPage);
		result.setModule(list);
		return result;
	}
}