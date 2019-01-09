package com.example.massociation.mapper;

import com.example.massociation.po.Student;
import com.example.massociation.po.StudentExample;

import java.util.List;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StudentMapper {
    @Select("select*from student where stu_no = ${stuNo}")
    Student getStudentByStuNo(@Param("stuNo") Integer stuNo);
    @Update("UPDATE student SET PASSWORD = '${password}' WHERE stu_no = ${stuNo} and password= '${oldPassword}'")
    int updatePassword(@Param("stuNo") Integer stuNo,@Param("password") String password,@Param("oldPassword") String oldPassword);
    @Insert("insert into student(stu_no,name,college,concat,sex,password) values(${student.stuNo},'${student.name}','${student.college}','${student.concat}','${student.sex}','${student.password}')")
    int addStudent(@Param("student") Student student);
    @Select("select count(*) from student where stu_no=${student.stuNo} and password = '${student.password}' and account_role = ${student.accountRole} ")
    int loginStudent(@Param("student")Student student);
}