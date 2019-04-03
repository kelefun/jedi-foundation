package com.jedijava.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jedijava.common.result.DefaultResultCode;
import com.jedijava.common.result.ResultCode;

import java.io.Serializable;

/**
 * @author liukaiyang
 * @date 2018/4/10 11:17
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultModel<T> implements Serializable {

    private static final long serialVersionUID = -5868923397737067940L;

    /**
     * 请求结果是否成功
     */
    private Boolean success=true;
    /**
     * 请求结果信息说明
     */
    private String message="成功";
    /**
     * code:响应码
     */
    private String code="200";
    /**
     * 请求结果数据对象
     */
    private T data;

    @JsonIgnore
    private ResultCode resultCode= DefaultResultCode.SUCCESS;

    @JsonProperty("s")
    public Boolean getSuccess(){
        return success;
    }
    @JsonProperty("m")
    public String getMessage(){
        return resultCode.getMsg();
    }
    @JsonProperty("d")
    public T getData() {
        return data;
    }
    @JsonProperty("c")
    public int getCode(){
        return  resultCode.getCode();
    }
    public void setSuccess(Boolean success){
        this.success=success;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public void setData(T data) {
        this.data = data;
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
        result.setSuccess(Boolean.FALSE);
        result.setResultCode(resultCode);
        return result;
    }
}
