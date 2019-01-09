package com.example.massociation.service;

import com.example.massociation.po.Msg;

import java.util.List;

public interface MsgService {
    List<Msg> listMsg(Integer stuNo, Integer status);

    int addMsg(String associationName, String content);

    int consumeMsg(Integer msgId);
}
