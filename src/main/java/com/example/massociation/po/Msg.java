package com.example.massociation.po;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Msg {
    private Integer msgId;

    private String content;

    private String associationName;

    private Integer status;

    private Integer stuNo;


    public Msg(Integer associationMemberNo, String content, String associationName) {
        this.stuNo=associationMemberNo;
        this.content=content;
        this.associationName=associationName;
    }
}