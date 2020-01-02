package com.spring.cloud.server.demo;

import com.spring.cloud.api.demo.ResultObject;
import com.spring.cloud.api.demo.dto.ClassDTO;
import com.spring.cloud.api.demo.service.ClassService;
import feign.Feign;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassServiceImpl implements ClassService {

    @Override
    public ResultObject<ClassDTO> queryClass(Integer id, String name) {
        return new ResultObject<ClassDTO>()
                .setCode(ResultObject.SUCCESS_CODE)
                .setMsg(ResultObject.SUCCESS_MSG)
                .setData(new ClassDTO()
                        .setId(1)
                        .setName("1年1班")
                        .setLevel(1)
                );
    }
}
