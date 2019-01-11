package com.example.massociation.mapper;

import com.example.massociation.po.Association;
import com.example.massociation.po.AssociationMember;
import com.example.massociation.po.AssociationMemberExample;

import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface AssociationMemberMapper {
    @Insert("insert into association_member(association_member_no,association_name,status,duties) values(${associationMember.associationMemberNo},'${associationMember.associationName}',${associationMember.status},'${associationMember.duties}')")
    int addAssociationMember(@Param("associationMember") AssociationMember associationMember);

    @Select("select association_member_id associationMemberId,association_member_no associationMemberNo,association_name associationName,duties,status from association_member where status=${status} and association_name='${aName}'")
    List<AssociationMember> listAssociationMember(@Param("status")Integer status, @Param("aName")String aName);
    @Update("update association_member set status=${status} where association_name='${aName}' and association_member_no=${stuNo}")
    int updateAssociationMemberStatus(@Param("stuNo")Integer stuNo, @Param("aName")String aName,@Param("status") Integer status);
    @Select("select association_name associationName,association_nature associationNature,president,establishment_time establishmentTime,financial_information financialInformation,status from association where association_name = (select association_name from association_member where association_member_no= '${stuNo}')")
    Association getAssociationByStuNo(@Param("stuNo")String sutNo);
    @Select("select association_member_id associationMemberId,association_member_no associationMemberNo,association_name associationName,duties,status from association_member where association_name='${aName}'")
    List<AssociationMember> listAssociationMemberByName(@Param("aName")String aName);
}