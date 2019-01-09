package com.example.massociation.mapper;

import com.example.massociation.po.Association;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface AssociationMapper {
    @Insert("insert into association(president,association_name,association_nature) values(${association.president},'${association.associationName}','${association.associationNature}')")
    int addAssociation(@Param("association") Association association);

    @Select("select association_name associationName,association_nature associationNature,president,establishment_time establishmentTime,financial_information financialInformation,status from association where status=${status}")
    ArrayList<Association> listAssociationByStatus(@Param("status") Integer status);

    @Select("select association_name associationName,association_nature associationNature,president,establishment_time establishmentTime,financial_information financialInformation,status from association")
    ArrayList<Association> listAssociation();
    @Update("update association set status= ${association.status} where association_name='${association.associationName}'")
    int updateAssociationStatus(@Param("association") Association association);

}