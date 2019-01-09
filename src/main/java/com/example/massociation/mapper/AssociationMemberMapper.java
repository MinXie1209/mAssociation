package com.example.massociation.mapper;

import com.example.massociation.po.AssociationMember;
import com.example.massociation.po.AssociationMemberExample;

import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface AssociationMemberMapper {
    @Insert("insert into association_member(association_member_no,association_name,status,duties) values(${associationMember.associationMemberNo},'${associationMember.associationName}',${associationMember.status},${associationMember.duties})")
    int addAssociationMember(@Param("associationMember") AssociationMember associationMember);

    @Select("select association_member_id associationMemberId,association_member_no associationMemberNo,association_name associationName,duties,status from association_member where status=${status} and association_name='${aName}'")
    List<AssociationMember> listAssociationMember(Integer status, String aName);
    @Update("update association_member set status=${status} where association_name='${aName}' and association_member_no=${stuNo}")
    int updateAssociationMemberStatus(Integer stuNo, String aName, Integer status);
}