package com.jedijava.crud.dao;

import com.jedijava.base.model.BaseModel;
import org.springframework.dao.DataAccessException;

/**
 * 
 * @author liukaiyang
 * @param <M>
 */
public interface BaseDAO<M extends BaseModel> {
	
	Integer insert(BaseModel baseModel) throws DataAccessException;

	Integer deleteById(Long id) throws DataAccessException;

	Integer updateById(BaseModel baseModel) throws DataAccessException;

	M selectById(Long id) throws DataAccessException;
}
