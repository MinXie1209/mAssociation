package com.example.massociation.po;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@AllArgsConstructor
public class Association {
    private String associationName;

    private String associationNature;

    private Integer president;

    private Date establishmentTime;

    private String financialInformation;

    private Integer status;

    public Association(Integer stuNo, String aName) {
        this.president=stuNo;
        this.associationName =aName;
    }

    public Association() {

    }

    public Association(Integer stuNo, String aName, String aNature) {
        this(stuNo,aName);
        this.associationNature =aNature;
    }
}