package com.spring.cloud.api.demo.dto;

import com.alibaba.fastjson.JSON;

/**
 * Created by xin on 2019/9/4.
 */
public class StudentDTO {

    private Integer id;
    private String name;
    private Integer sex;

    public Integer getSex() {
        return sex;
    }

    public StudentDTO setSex(Integer sex) {
        this.sex = sex;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public StudentDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentDTO setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
