package com.spring.cloud.api.demo.service;

import com.spring.cloud.api.demo.RequestObject;
import com.spring.cloud.api.demo.ResultObject;
import com.spring.cloud.api.demo.dto.HelloDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 注意, 此行是为服务预先定义的"域名", 服务提供方的"spring.application.name"必须是这个名称
@FeignClient("api.springcloud.com")
@RequestMapping("HelloService")
public interface HelloService {

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    ResultObject<String> hello(@RequestBody RequestObject<HelloDTO> requestObject);
}
