package com.example.demo.service.imp;

import com.example.demo.Dao.StudentDao;
import com.example.demo.domain.Student;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> studentlist() {
        return studentDao.listStudent();
    }
}
