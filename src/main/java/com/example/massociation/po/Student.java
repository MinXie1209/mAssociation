package com.example.massociation.po;

import lombok.Data;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 江南小俊
 * @Date 2019/1/8 0:02
 * @Version 1.0.0
 **/
@Data
public class Student {
    //学号
    private Integer stuNo;
    //姓名
    private String name;
    //学院
    private String college;
    //联系方式
    private String concat;
    //性别
    private String sex;
    //密码
    private String password;
}
