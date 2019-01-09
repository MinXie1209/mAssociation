package com.example.massociation.service;

import com.example.massociation.po.Association;

import java.util.List;

public interface AssociationService {
    int addAssociation(Association association);

    List<Association> listAssociation(Integer status);

    int updateAssociationStatus(Association association);
}
