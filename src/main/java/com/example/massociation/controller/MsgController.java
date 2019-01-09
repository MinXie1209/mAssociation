package com.example.massociation.controller;

import com.example.massociation.common.enums.ResultEnum;
import com.example.massociation.common.utils.ResultUtils;
import com.example.massociation.common.vo.Result;
import com.example.massociation.po.Association;
import com.example.massociation.po.Msg;
import com.example.massociation.service.MsgService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName MsgController
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/9 13:57
 * @Version 1.0
 **/
@RestController
@Slf4j
@RequestMapping("/api")
@CrossOrigin
public class MsgController {
    @Autowired
     MsgService msgService;

    @ApiOperation(value = "获取信息", notes = "")
    @GetMapping("/msg")
    public Result listMsg(
            @RequestParam(value = "status", defaultValue = "2") @ApiParam("消息状态：0-未读，1-已读，2-所有") Integer status,
            @RequestParam(value = "stuNo") @ApiParam("接受的学号") Integer stuNo) {
        List<Msg> msgList = msgService.listMsg(stuNo, status);
        if(msgList!=null){
            return ResultUtils.success(msgList);
        }else {
            return ResultUtils.error(ResultEnum.UN_ERROR);
        }
    }
    @ApiOperation(value = "发送信息", notes = "")
    @PostMapping("/msg")
    public Result addMsg(
            @RequestParam(value = "associationName") @ApiParam("发送的社团") String associationName,
            @RequestParam(value = "content") @ApiParam("消息内容") String content) {
        int res= msgService.addMsg(associationName,content);
        if(res==1){
            return ResultUtils.success();
        }else {
            return ResultUtils.error(ResultEnum.UN_ERROR);
        }
    }
    @ApiOperation(value = "消费信息", notes = "")
    @PutMapping("/msg")
    public Result consumeMsg(@RequestParam(value = "msgId") @ApiParam("消息id") Integer msgId) {
        int res= msgService.consumeMsg(msgId);
        if(res==1){
            return ResultUtils.success();
        }else {
            return ResultUtils.error(ResultEnum.UN_ERROR);
        }
    }
}
