package com.spring.cloud.api.demo.service;

import com.spring.cloud.api.demo.RequestObject;
import com.spring.cloud.api.demo.ResultObject;
import com.spring.cloud.api.demo.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xin on 2019/9/4.
 */
@FeignClient(contextId = "StudentService", serviceId = "api.springcloud.com")
@RequestMapping("StudentService")
public interface StudentService {

    @RequestMapping(value = "queryStudent", method = RequestMethod.POST)
    ResultObject<StudentDTO> queryStudent(@RequestBody RequestObject<Integer> requestObject);

    default int calculateScore(int score1, int score2) {
        return score1 * score2;
    }
}