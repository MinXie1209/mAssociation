package com.example.massociation.po;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AssociationMember {
    private Integer associationMemberId;

    private Integer associationMemberNo;

    private String associationName;

    private String duties;

    private Integer status;


    public AssociationMember(Integer stuNo, String aName) {
        this.associationMemberNo = stuNo;
        this.associationName = aName;
    }

    public AssociationMember(Integer stuNo, String aName, Integer status, String duties) {
        this(stuNo, aName);
        this.status = status;
        this.duties = duties;
    }
}