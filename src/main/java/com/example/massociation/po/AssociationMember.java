package com.example.massociation.po;

import lombok.Data;

/**
 * @ClassName AssociationMember
 * @Description TODO
 * @Author 江南小俊
 * @Date 2019/1/8 0:18
 * @Version 1.0.0
 **/
@Data
public class AssociationMember {
    //社团成员的id
    private Integer associationMemberId;
    //成员学号
    private Integer AssociationMemberNo;
    //社团名字
    private String getAssociationMemberId;
    //成员职务
    private String duties;
    //状态 0-未审核，1-已审核，2-已注销
    private Integer status;
}
