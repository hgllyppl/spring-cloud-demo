package com.spring.cloud.client.demo;

import com.spring.cloud.api.demo.RequestObject;
import com.spring.cloud.api.demo.ResultObject;
import com.spring.cloud.api.demo.dto.StudentDTO;
import com.spring.cloud.api.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("queryStudent")
    public ResultObject<StudentDTO> queryStudent(Integer id) {
        return studentService.queryStudent(new RequestObject<Integer>().setData(id));
    }

    @RequestMapping("addStudent")
    public ResultObject<Void> addStudent(StudentDTO studentDTO) {
        return studentService.addStudent(studentDTO.getId(), studentDTO.getName());
    }
}
