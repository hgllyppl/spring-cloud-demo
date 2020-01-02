package com.spring.cloud.client.demo;

import com.spring.cloud.api.demo.RequestObject;
import com.spring.cloud.api.demo.ResultObject;
import com.spring.cloud.api.demo.dto.ClassDTO;
import com.spring.cloud.api.demo.dto.StudentDTO;
import com.spring.cloud.api.demo.service.ClassService;
import com.spring.cloud.api.demo.service.StudentService;
import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ClassService classService;

    @RequestMapping("queryStudent")
    public ResultObject<StudentDTO> queryStudent(Integer id) {
        int ret = studentService.calculateScore(3, id);
        return studentService.queryStudent(new RequestObject<Integer>().setData(ret));
    }

    @RequestMapping("addStudent")
    public ResultObject<Void> addStudent(StudentDTO studentDTO) {
        return studentService.addStudent(studentDTO.getId(), studentDTO.getName());
    }

    @RequestMapping("queryClass")
    public ResultObject<ClassDTO>  queryClass(Integer id) {
        return classService.queryClass(id, null);
    }
}
