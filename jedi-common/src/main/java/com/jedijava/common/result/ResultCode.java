package com.jedijava.common.result;

import java.io.Serializable;

public interface ResultCode extends Serializable {

    public int getCode();

    public String getMsg();
    
    public void setMsg(String msg);
}
