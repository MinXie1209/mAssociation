package com.example.massociation.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/8 10:08
 * @Version 1.0
 **/
@Data
public class Result<T> implements Serializable {
    private Integer code=1;
    private String msg="成功";
    private T data=null;

    public Result(T data) {
        this.msg="成功";
        this.data = data;
    }

    public Result(String msg) {
        this.msg = msg;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
    }


}
