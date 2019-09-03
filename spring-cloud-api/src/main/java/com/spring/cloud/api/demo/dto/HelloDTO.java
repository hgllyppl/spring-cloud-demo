package com.spring.cloud.api.demo.dto;

import com.alibaba.fastjson.JSON;

public class HelloDTO {

    private String name;

    public String getName() {
        return name;
    }

    public HelloDTO setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
