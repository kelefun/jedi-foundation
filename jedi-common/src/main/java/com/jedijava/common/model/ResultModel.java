package com.jedijava.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jedijava.common.result.DefaultResultCode;
import com.jedijava.common.result.ResultCode;

import java.io.Serializable;

/**
 * @author liukaiyang
 * @date 2018/4/8 11:17
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultModel<T> implements Serializable {

    private static final long serialVersionUID = -5868923397737067940L;

    private boolean success=true;
    private T data;
    @JsonIgnore
    private ResultCode resultCode= DefaultResultCode.SUCCESS;

    public boolean isSuccess() {
        return success;
    }
    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    @JsonProperty("code")
    public int getCode(){
        return  resultCode.getCode();
    }

    @JsonProperty("msg")
    public String getMsg(){
        return resultCode.getMsg();
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
    public static <T> ResultModel<T> success(T data) {
        ResultModel<T> r = new ResultModel<T>();
        r.setData(data);
        return r;
    }
    public static ResultModel error(ResultCode resultCode) {
        ResultModel result = new ResultModel();
        result.setSuccess(false);
        result.setResultCode(resultCode);
        return result;
    }
}
