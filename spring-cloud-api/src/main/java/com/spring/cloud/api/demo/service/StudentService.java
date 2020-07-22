package com.spring.cloud.api.demo.service;

import com.spring.cloud.api.demo.RequestObject;
import com.spring.cloud.api.demo.ResultObject;
import com.spring.cloud.api.demo.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xin on 2019/9/4.
 */
@FeignClient(value = "api.springcloud.com", contextId = "StudentService")
@RequestMapping("StudentService")
public interface StudentService {

    @RequestMapping(value = "queryStudent", method = RequestMethod.POST)
    ResultObject<StudentDTO> queryStudent(@RequestBody RequestObject<Integer> requestObject);

    @RequestMapping(value = "addStudent")
    ResultObject<Void> addStudent(@RequestParam("id") Integer id, @RequestParam("name") String name);

    default int calculateScore(int score1, int score2) {
        return score1 * score2;
    }
}
