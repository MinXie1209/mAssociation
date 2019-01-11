package com.example.massociation.service.impl;

import com.example.massociation.mapper.AssociationMemberMapper;
import com.example.massociation.po.Association;
import com.example.massociation.po.AssociationMember;
import com.example.massociation.service.AssociationMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AssociationMemberServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/9 12:03
 * @Version 1.0
 **/
@Service("associationMemberService")
public class AssociationMemberServiceImpl implements AssociationMemberService {
    @Autowired
    AssociationMemberMapper associationMemberMapper;

    @Override
    public int addAssociationMember(AssociationMember associationMember) {
        return associationMemberMapper.addAssociationMember(associationMember);
    }


    @Override
    public List<AssociationMember> listAssociationMember(Integer status, String aName) {
        if(status==3){
            return associationMemberMapper.listAssociationMemberByName(aName);
        }
        return associationMemberMapper.listAssociationMember(status,aName);
    }

    @Override
    public int updateAssociationMemberStatus(Integer stuNo, String aName, Integer status) {
        return associationMemberMapper.updateAssociationMemberStatus(stuNo,aName,status);
    }

    @Override
    public Association getAssociationByStuNo(String sutNo) {
        return associationMemberMapper.getAssociationByStuNo(sutNo);
    }
}
