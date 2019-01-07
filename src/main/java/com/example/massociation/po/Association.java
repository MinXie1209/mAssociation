package com.example.massociation.po;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Association
 * @Description TODO
 * @Author 江南小俊
 * @Date 2019/1/8 0:12
 * @Version 1.0.0
 **/
@Data
public class Association {
    //社团名称
    private String assocaitionName;
    //社团性质
    private String assocaitionNature;
    //社长-学生表学号
    private Integer president;
    //成立时间
    private Date establishmentTime;
    //财务信息
    private String financialInformation;

}
