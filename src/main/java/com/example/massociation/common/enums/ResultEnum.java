package com.example.massociation.common.enums;

/**
 * 返回数据
 */
public enum ResultEnum {
    UN_ERROR(-1, "未知错误"),
    SUCCESS(1, "成功"),
    ERROR_NOT_STUDENT(10001,"没有学生的信息" ),
    ERROR_UPDATE_PASSWORD(10002, "更新密码失败"),
    ERROR_LOGIN(10003, "登录失败"),
    ERROR_ADD_ASSOCIATION(10004,"申请社团失败" ),
    ERROR_ADD_ASSOCIATIONMEMBER(10005,"申请加入社团失败" ),
    ERROR_REGISTER(10006,"注册失败" ),
    ERROR_UPDATE_ASSOCIATION_STATUS(10007, "修改社团状态失败");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
