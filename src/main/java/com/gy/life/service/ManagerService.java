package com.gy.life.service;

import com.gy.life.model.RoleInform;

import javax.management.relation.RoleInfo;

public interface ManagerService {

    int insertRole(RoleInform roleInform);

    RoleInform selectByPhone(String phoneNumber);
}
