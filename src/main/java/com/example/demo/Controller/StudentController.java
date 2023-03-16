package com.example.demo.Controller;

import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/getStudents")
    @ResponseBody
    public Map<String, Object> getStudents(){
        Map<String, Object> map = new HashMap<>();
        System.out.println("已发送请求0...");
        try{
            map.put("data",studentService.studentlist());
            map.put("errorcode",0);
            map.put("message", "访问成功");
        }catch (Exception e){
            map.put("data","");
            map.put("errorcode",1);
            map.put("message", e);
        }
        return map;
    }

}
