package com.example.massociation.service;

import com.example.massociation.po.Student;

public interface StudentService {
    /**
     * 通过学号查找学生
     * @param stuNo 学号
     * @return Student
     */

    Student getStudentByStuNo(Integer stuNo);

    int loginStudent(Student student);

    int addStudent(Student student);

    int updatePassword(Integer stuNo, String password, String oldPassword);
}
