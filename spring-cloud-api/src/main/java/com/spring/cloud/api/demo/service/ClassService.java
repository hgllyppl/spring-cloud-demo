package com.spring.cloud.api.demo.service;

import com.spring.cloud.api.demo.ResultObject;
import com.spring.cloud.api.demo.dto.ClassDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xin on 2019/9/4.
 */
@FeignClient(value = "api.springcloud.com", contextId = "ClassService")
@RequestMapping("ClassService")
public interface ClassService {

    @RequestMapping(value = "queryClass", method = RequestMethod.POST)
    ResultObject<ClassDTO> queryClass(@RequestParam("id") Integer id, @RequestParam String name);
}
