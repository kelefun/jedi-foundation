package com.jedijava.base.service;


import com.jedijava.base.model.BaseModel;

import java.io.Serializable;

public interface BaseService<T extends BaseModel> extends Serializable {

	/**
	 * 添加成功后可获取id (keyProperty="id")
	 * @author liukaiyang 2016年12月19日
	 * @param record
	 * @return 添加成功则返回添加的对象,添加失败返回null
	 */
	T insert(T record);

	Integer deleteById(Long id);

	Integer updateById(T record);

	T selectById(Long id);

}
