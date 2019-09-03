package com.spring.cloud.server.demo;

import com.spring.cloud.sdk.demo.RequestObject;
import com.spring.cloud.sdk.demo.ResultObject;
import com.spring.cloud.sdk.demo.dto.HelloDTO;
import com.spring.cloud.sdk.demo.service.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceImpl implements HelloService {

    @Override
    public ResultObject<String> hello(@RequestBody RequestObject<HelloDTO> requestObject) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResultObject<String>()
                .setRequestId(requestObject.getRequestId())
                .setCode("0")
                .setMsg("success")
                .setData("hello " + requestObject.getData().getName() + ", welcome to cloud'world!");
    }
}
