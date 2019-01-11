package com.example.massociation.controller;

import com.example.massociation.common.enums.ResultEnum;
import com.example.massociation.common.utils.ResultUtils;
import com.example.massociation.common.vo.Result;
import com.example.massociation.po.Association;
import com.example.massociation.po.AssociationMember;
import com.example.massociation.service.AssociationMemberService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName AssociationMemberController
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/8 10:06
 * @Version 1.0
 **/
@RestController
@Slf4j
@RequestMapping("/api")
@CrossOrigin
public class AssociationMemberController {
    @Autowired
     AssociationMemberService associationMemberService;


    @ApiOperation(value = "申请加入社团", notes = "")
    @PostMapping("/association_member")
    public Result addAssociationMember(@RequestParam("stuNo") @ApiParam("学号") Integer stuNo, @RequestParam("aName") @ApiParam("社团名字") String aName) {
        int res = associationMemberService.addAssociationMember(new AssociationMember(stuNo, aName,0,"普通成员"));
        if (res == 1) {
            return ResultUtils.success();
        } else {
            return ResultUtils.error(ResultEnum.ERROR_ADD_ASSOCIATIONMEMBER);
        }
    }

    @ApiOperation(value = "获取社团成员信息", notes = "")
    @GetMapping("/association_member")
    public Result listAssociationMember(@RequestParam(value = "status", defaultValue = "3") @ApiParam("状态：0-未审核，1-已审核，2-退团,3-全部") Integer status, @RequestParam("aName") @ApiParam("社团名字") String aName) {
        List<AssociationMember> associationMemberList = associationMemberService.listAssociationMember(status,aName);
        if (associationMemberList!=null) {
            return ResultUtils.success(associationMemberList);
        } else {
            return ResultUtils.error(ResultEnum.ERROR_ADD_ASSOCIATIONMEMBER);
        }
    }
    @ApiOperation(value = "通过学号获取社团", notes = "")
    @GetMapping("/association_member/{stuNo}")
    public Result getAssociationByStuNo( @PathVariable("stuNo") @ApiParam("学号") String stuNo) {
        Association association=associationMemberService.getAssociationByStuNo(stuNo);
        if (association!=null) {
            return ResultUtils.success(association);
        } else {
            return ResultUtils.error(ResultEnum.UN_ERROR);
        }
    }
    @ApiOperation(value = "修改社团成员的状态", notes = "")
    @PutMapping("/association_member")
    public Result updateAssociationMemberStatus(@RequestParam("stuNo") @ApiParam("学号") Integer stuNo,
                                       @RequestParam("aName") @ApiParam("社团名字") String aName,
                                       @RequestParam("status") @ApiParam("状态 0-未审核，1-已审核，2-退团") Integer status) {
        int res = associationMemberService.updateAssociationMemberStatus(stuNo, aName,status);
        if (res == 1) {
            return ResultUtils.success();
        } else {
            return ResultUtils.error(ResultEnum.ERROR_ADD_ASSOCIATIONMEMBER);
        }
    }


}
