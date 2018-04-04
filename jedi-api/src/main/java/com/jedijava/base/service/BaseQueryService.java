package com.jedijava.base.service;

import com.jedijava.base.model.BaseModel;
import com.jedijava.base.model.PageModel;

import java.util.List;

public interface BaseQueryService<Q extends PageModel, T extends BaseModel> extends BaseService<T> {

	Integer selectCountList(Q query);

	List<T> selectList(Q query);

}
