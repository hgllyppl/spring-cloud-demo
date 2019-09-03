package com.spring.cloud.api.demo;

import com.alibaba.fastjson.JSON;

public class ResultObject<T> {

    public static final String SUCCESS_CODE = "0";
    public static final String SUCCESS_MSG = "success";
    public static final String ERROR_CODE = "1";
    public static final String ERROR_MSG = "error";

    private String requestId;
    private String code;
    private String msg;
    private T data;

    public String getRequestId() {
        return requestId;
    }

    public ResultObject<T> setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ResultObject<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultObject<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResultObject<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }
}
