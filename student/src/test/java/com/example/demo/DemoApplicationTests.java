package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.Dao.StudentDao;
import com.example.demo.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@SuppressWarnings("unchecked")
class DemoApplicationTests {

    @Autowired
    private StudentDao studentDao;

    @Test
    void contextLoads() {
        List<Student> list = studentDao.listStudent();
        System.out.println(list);
    }

}
