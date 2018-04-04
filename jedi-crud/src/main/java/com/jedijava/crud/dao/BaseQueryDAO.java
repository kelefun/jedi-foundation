package com.jedijava.crud.dao;

import com.jedijava.base.model.BaseModel;
import com.jedijava.base.model.PageModel;
import org.springframework.dao.DataAccessException;

import java.util.List;


public interface BaseQueryDAO<Q extends PageModel,M extends BaseModel> extends BaseDAO<M> {
	
	Integer selectCountList(Q query) throws DataAccessException;
	
	List<M> selectList(Q query) throws DataAccessException;
}
