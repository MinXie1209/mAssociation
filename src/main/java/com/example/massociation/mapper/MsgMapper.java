package com.example.massociation.mapper;

import com.example.massociation.po.Msg;
import com.example.massociation.po.MsgExample;

import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface MsgMapper {
    @Update("update msg set status=1 where msg_id= ${msgId}")
    int consumeMsg(@Param("msgId") Integer msgId);

    @Insert("<script>" +
            "insert into msg(content,association_name,stu_no) values" +
            "<foreach collection='msgList' item='item' index='index' separator=','>" +
            "            (#{item.content},#{item.associationName},#{item.stuNo})" +
            "        </foreach> " + "</script>")
    int addMsgList(@Param("msgList") List<Msg> msgList);

    @Select("select msg_id msgId,content,association_name associationName,status,stu_no stuNo from msg where stu_no=${stuNo} and status=${status}")
    List<Msg> listMsgByStatus(@Param("stuNo") Integer stuNo,@Param("status") Integer status);

    @Select("select msg_id msgId,content,association_name associationName,status,stu_no stuNo from msg where stu_no=${stuNo}")
    List<Msg> listMsg(@Param("stuNo") Integer stuNo);
}