package com.spring.cloud.client.demo;

import com.spring.cloud.api.demo.RequestObject;
import com.spring.cloud.api.demo.ResultObject;
import com.spring.cloud.api.demo.dto.HelloDTO;
import com.spring.cloud.api.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("hello")
    public ResultObject hello(String name) {
        HelloDTO helloDTO = new HelloDTO().setName(name);
        RequestObject<HelloDTO> requestObject = new RequestObject<HelloDTO>().setRequestId(UUID.randomUUID().toString()).setData(helloDTO);
        ResultObject<String> resultObject = helloService.hello(requestObject);
        return resultObject;
    }
}
