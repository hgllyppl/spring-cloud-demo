package com.spring.cloud.api.demo.dto;

import com.alibaba.fastjson.JSON;

/**
 * Created by xin on 2019/9/4.
 */
public class ClassDTO {

    private Integer id;
    private String name;
    private Integer level;

    public Integer getId() {
        return id;
    }

    public ClassDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public ClassDTO setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public ClassDTO setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
