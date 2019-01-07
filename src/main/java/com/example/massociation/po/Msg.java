package com.example.massociation.po;

import lombok.Data;

/**
 * @ClassName Msg
 * @Description TODO
 * @Author 江南小俊
 * @Date 2019/1/8 0:33
 * @Version 1.0.0
 **/
@Data
public class Msg {
    //消息id
    private Integer msgId;
    //消息内容
    private String content;
    //消息发送社团
    private String associationName;
    //消息状态:0-未读，1-已读
    private Integer status;
    //消息接受的学生学号
    private Integer stuNo;
}
