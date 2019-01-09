package com.example.massociation.service.impl;

import com.example.massociation.mapper.StudentMapper;
import com.example.massociation.po.Student;
import com.example.massociation.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/9 11:29
 * @Version 1.0
 **/
@Slf4j
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student getStudentByStuNo(Integer stuNo) {
        log.info("stuNo:{}", stuNo);
        return studentMapper.getStudentByStuNo(stuNo);
    }


    @Override
    public int loginStudent(Student student) {
        return studentMapper.loginStudent(student);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int updatePassword(Integer stuNo, String password, String oldPassword) {
        return studentMapper.updatePassword(stuNo,password,oldPassword);
    }
}
