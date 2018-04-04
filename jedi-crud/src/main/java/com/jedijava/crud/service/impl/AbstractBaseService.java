package com.jedijava.crud.service.impl;

import com.jedijava.base.model.BaseModel;
import com.jedijava.base.service.BaseService;
import com.jedijava.common.exception.WebException;
import com.jedijava.common.result.DefaultResultCode;
import com.jedijava.crud.dao.BaseDAO;

public abstract class AbstractBaseService<T extends BaseModel> implements BaseService<T> {

    private static final long serialVersionUID = 2037061608852521674L;

    @Override
    public Integer deleteById(Long id) {
        checkId(id);
        return getDAO().deleteById(id);
    }

    @Override
    public T insert(T baseModel) {
        if (getDAO().insert(baseModel) > 0) {
            return baseModel;
        } else {
            return null;
        }
    }

    @Override
    public Integer updateById(T baseDTO) {
        checkId(baseDTO.getId());
        return getDAO().updateById(baseDTO);
    }

    @Override
    public T selectById(Long id) {
        checkId(id);
        return getDAO().selectById(id);
    }

    private void checkId(Long id) {
        if (id == null || id.equals(0L)) {
            throw new WebException(DefaultResultCode.ILLEGAL_ARGUMENT);
        }
    }
    public abstract BaseDAO<T> getDAO();
}
