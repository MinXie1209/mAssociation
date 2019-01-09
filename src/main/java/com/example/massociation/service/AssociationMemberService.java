package com.example.massociation.service;

import com.example.massociation.po.AssociationMember;

import java.util.List;

public interface AssociationMemberService {
    int addAssociationMember(AssociationMember associationMember);

    List<AssociationMember> listAssociationMember(Integer status, String aName);

    int updateAssociationMemberStatus(Integer stuNo, String aName, Integer status);
}
