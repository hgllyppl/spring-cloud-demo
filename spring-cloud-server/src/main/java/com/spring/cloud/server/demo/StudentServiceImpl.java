package com.spring.cloud.server.demo;

import com.spring.cloud.api.demo.RequestObject;
import com.spring.cloud.api.demo.ResultObject;
import com.spring.cloud.api.demo.dto.StudentDTO;
import com.spring.cloud.api.demo.service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xin on 2019/9/4.
 */
@RestController
public class StudentServiceImpl implements StudentService {

    @Override
    public ResultObject<StudentDTO> queryStudent(@RequestBody RequestObject<Integer> requestObject) {
        return new ResultObject<StudentDTO>()
                .setCode(ResultObject.SUCCESS_CODE)
                .setMsg(ResultObject.SUCCESS_MSG)
                .setData(new StudentDTO()
                        .setId(requestObject.getData())
                        .setName("z3")
                        .setSex(1)
                );
    }

    @Override
    public ResultObject<Void> addStudent(Integer id, String name) {
        return new ResultObject<Void>()
                .setCode(ResultObject.SUCCESS_CODE)
                .setMsg(ResultObject.SUCCESS_MSG)
                ;
    }
}
