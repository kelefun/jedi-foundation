package com.jedijava.crud.service.impl;

import com.jedijava.base.model.BaseModel;
import com.jedijava.base.model.PageModel;
import com.jedijava.base.service.BaseQueryService;
import com.jedijava.common.exception.WebException;
import com.jedijava.common.result.DefaultResultCode;
import com.jedijava.crud.dao.BaseDAO;
import com.jedijava.crud.dao.BaseQueryDAO;

import java.util.List;

public abstract class AbstractBaseQueryService<Q extends PageModel,T extends BaseModel>
        extends AbstractBaseService<T> implements BaseQueryService<Q,T> {
	
	private static final long serialVersionUID = 6666564267689890689L;

	@Override
    public Integer selectCountList(Q query){
        return getQueryDAO().selectCountList(query);
    }

    @Override
    public List<T> selectList(Q query) {
        return getQueryDAO().selectList(query);
    }

	private BaseQueryDAO<Q,T> getQueryDAO() {
        BaseDAO<T> dao = getDAO();
        if (!(dao instanceof BaseQueryDAO)) {
            throw new WebException(DefaultResultCode.SYSTEM_ERROR_DAO,"DAO没有继承baseDAO");
        }
        return (BaseQueryDAO<Q,T>) getDAO();
    }

}
