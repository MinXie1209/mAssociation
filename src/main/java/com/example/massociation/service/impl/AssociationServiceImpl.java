package com.example.massociation.service.impl;

import com.example.massociation.mapper.AssociationMapper;
import com.example.massociation.mapper.AssociationMemberMapper;
import com.example.massociation.po.Association;
import com.example.massociation.po.AssociationMember;
import com.example.massociation.service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName AssociationServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/9 11:56
 * @Version 1.0
 **/
@Service("associationService")
public class AssociationServiceImpl implements AssociationService {
    @Autowired
    AssociationMapper associationMapper;
    @Autowired
    AssociationMemberMapper associationMemberMapper;

    @Transactional()
    @Override
    public int addAssociation(Association association) {
        try {
            int res = associationMapper.addAssociation(association);
            if (res == 1) {
                //插入社团成员表
                AssociationMember associationMember=new AssociationMember(association.getPresident(),association.getAssociationName(),1,"社长");
                associationMemberMapper.addAssociationMember(associationMember);
            } else {

            }
            return res;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public List<Association> listAssociation(Integer status) {
        if (status == 3) {
            return associationMapper.listAssociation();
        }
        return associationMapper.listAssociationByStatus(status);
    }

    @Override
    public int updateAssociationStatus(Association association) {
        return associationMapper.updateAssociationStatus(association);
    }
}
