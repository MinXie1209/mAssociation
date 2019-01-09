package com.example.massociation.controller;

import com.example.massociation.common.enums.ResultEnum;
import com.example.massociation.common.utils.ResultUtils;
import com.example.massociation.common.vo.Result;
import com.example.massociation.po.Association;
import com.example.massociation.service.AssociationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName AssociationController
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/8 10:06
 * @Version 1.0
 **/
@RestController
@Slf4j
@RequestMapping("/api")
@CrossOrigin
public class AssociationController {
    @Autowired
    AssociationService associationService;


    @ApiOperation(value = "申请社团", notes = "")
    @PostMapping("/association")
    public Result addAssociation(@RequestParam("stuNo") @ApiParam("学号") Integer stuNo,
                                 @RequestParam("aName") @ApiParam("社团名字") String aName,
                                 @RequestParam("aNature") @ApiParam("社团性质") String aNature) {
        int res = associationService.addAssociation(new Association(stuNo, aName,aNature));
        if (res == 1) {
            return ResultUtils.success();
        } else {
            return ResultUtils.error(ResultEnum.ERROR_ADD_ASSOCIATION);
        }
    }

    @ApiOperation(value = "获取社团信息", notes = "")
    @GetMapping("/association")
    public Result listAssociation(@RequestParam(value = "status", defaultValue = "3") @ApiParam("社团状态：0-未审核，1-已审核，2：注销,3-全部") Integer status) {
        List<Association> associationList = associationService.listAssociation(status);
        if (associationList != null) {
            return ResultUtils.success(associationList);
        } else {
            return ResultUtils.error(ResultEnum.UN_ERROR);
        }
    }

    @ApiOperation(value = "修改社团状态", notes = "")
    @PutMapping("/association")
    public Result updateAssociationStatus(@RequestParam("status") @ApiParam("状态 0-未审核，1-已审核，2-注销") Integer status, @RequestParam("aName") @ApiParam("社团名字") String aName) {
        Association association = new Association();
        association.setAssociationName(aName);
        association.setStatus(status);
        int res = associationService.updateAssociationStatus(association);
        if (res == 1) {
            return ResultUtils.success();
        } else {
            return ResultUtils.error(ResultEnum.ERROR_UPDATE_ASSOCIATION_STATUS);
        }
    }


}
