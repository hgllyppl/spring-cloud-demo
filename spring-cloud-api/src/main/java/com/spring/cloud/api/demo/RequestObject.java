package com.spring.cloud.api.demo;

import com.alibaba.fastjson.JSON;

public class RequestObject<T> {

    private String requestId;
    private T data;

    public String getRequestId() {
        return requestId;
    }

    public RequestObject<T> setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public T getData() {
        return data;
    }

    public RequestObject<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
