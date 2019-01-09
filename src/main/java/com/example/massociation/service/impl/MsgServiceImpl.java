package com.example.massociation.service.impl;

import com.example.massociation.mapper.AssociationMemberMapper;
import com.example.massociation.mapper.MsgMapper;
import com.example.massociation.po.AssociationMember;
import com.example.massociation.po.Msg;
import com.example.massociation.service.MsgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MsgServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/9 14:08
 * @Version 1.0
 **/
@Service
public class MsgServiceImpl implements MsgService {
    @Autowired
    MsgMapper msgMapper;
    @Autowired
    AssociationMemberMapper associationMemberMapper;
    @Override
    public List<Msg> listMsg(Integer stuNo, Integer status) {
        if (status==2){
            return msgMapper.listMsg(stuNo);
        }
        return msgMapper.listMsgByStatus(stuNo,status);
    }

    /**
     * 1.先查询社团成员
     * 2.批插入信息
     * @param associationName
     * @param content
     * @return
     */
    @Override
    public int addMsg(String associationName, String content) {
        List<AssociationMember> associationMemberList=associationMemberMapper.listAssociationMember(1,associationName);
        List<Msg>msgList=new ArrayList<>();
        for (AssociationMember associationMember:associationMemberList){
            Msg msg=new Msg(associationMember.getAssociationMemberNo(),content,associationName);
            msgList.add(msg);
        }
        return msgMapper.addMsgList(msgList);
    }

    @Override
    public int consumeMsg(Integer msgId) {
        return msgMapper.consumeMsg(msgId);
    }
}
