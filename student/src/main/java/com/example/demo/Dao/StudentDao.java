package com.example.demo.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentDao extends BaseMapper<Student> {

    @Select("select * from student")
    List<Student> listStudent();

    Student saveStudents(@Param("student")Student student);

}
