package com.example.massociation.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.massociation.common.enums.ResultEnum;
import com.example.massociation.common.utils.ResultUtils;
import com.example.massociation.common.utils.TokenUtil;
import com.example.massociation.common.vo.Result;

import com.example.massociation.po.Student;
import com.example.massociation.service.StudentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName StudentController
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/8 10:06
 * @Version 1.0
 **/
@RestController
@Slf4j
@RequestMapping("/api")
@CrossOrigin
public class StudentController {
    @Autowired
     StudentService studentService;


    @ApiOperation(value = "获取用户信息", notes = "")
    @GetMapping("/student/{stuNo}")
    public Result selectStudentById(@PathVariable(value = "stuNo",required = false)@ApiParam("学号") Integer stuNo) {
        Student student = studentService.getStudentByStuNo(stuNo);
        if (student!=null) {
            student.setPassword(null);
            return ResultUtils.success(student);

        } else {
            return  ResultUtils.error(ResultEnum.ERROR_NOT_STUDENT);
        }

    }

    @ApiOperation(value = "更新密码", notes = "")
    @PutMapping("/student")
    public Result updateStudent(@RequestParam("stuNo")@ApiParam("学号") Integer stuNo,
                                @RequestParam("oldPassword")@ApiParam("旧的加密后的密码") String oldPassword,
                                @RequestParam("password")@ApiParam("新的加密后的密码") String password) {
        log.info("{}:{}", stuNo, password);
        int res = studentService.updatePassword(stuNo,password,oldPassword);
        if (res == 1) {

           return ResultUtils.success();
        } else {
          return  ResultUtils.error(ResultEnum.ERROR_UPDATE_PASSWORD);
        }

    }
    @ApiOperation(value = "登录", notes = "")
    @GetMapping("/student")
    public Result loginStudent(@RequestParam("stuNo")@ApiParam("学号") Integer stuNo,
                               @RequestParam("password")@ApiParam("加密后的密码") String password,
                               @RequestParam("accountRole")@ApiParam("身份：0-普通学生，1-管理员") Integer accountRole) {
        log.info("{}:{}:{}", stuNo, password,accountRole);
        Student student=new Student(stuNo, password,accountRole);
        int res = studentService.loginStudent(student);

        if (res == 1) {
            String token= null;
            try {
                token = TokenUtil.createJWT(JSONObject.toJSONString(student),3*60*1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ResultUtils.success(token);
        } else {
            return  ResultUtils.error(ResultEnum.ERROR_LOGIN);
        }
    }
    @ApiOperation(value = "注册", notes = "")//TODO
    @PostMapping("/student")
    public Result addStudent(@RequestParam("stuNo")@ApiParam("学号") Integer stuNo,
                             @RequestParam("password")@ApiParam("加密后的密码") String password,
                             @RequestParam("name")@ApiParam("名字")String name,
                             @RequestParam("sex")@ApiParam("性别")String sex,
                             @RequestParam("concat")@ApiParam("联系")String concat,
                             @RequestParam("college")@ApiParam("学院")String college
                             ) {
        log.info("{}:{}", stuNo, password);
        Student student=new Student(stuNo, name,college,concat,sex,password,null);
        int res = studentService.addStudent(student);

        if (res == 1) {
            return ResultUtils.success();
        } else {
            return  ResultUtils.error(ResultEnum.ERROR_REGISTER);
        }
    }



}
