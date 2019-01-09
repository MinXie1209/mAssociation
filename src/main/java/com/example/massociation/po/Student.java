package com.example.massociation.po;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private Integer stuNo;

    private String name;

    private String college;

    private String concat;

    private String sex;

    private String password;

    private Integer accountRole;

    public Student(Integer stuNo) {
        this.stuNo=stuNo;
    }

    public Student(Integer stuNo, String password) {
        this.stuNo=stuNo;
        this.password=password;
    }

    public Student(Integer stuNo, String password, Integer accountRole) {
        this(stuNo,password);
        this.accountRole=accountRole;
    }
}