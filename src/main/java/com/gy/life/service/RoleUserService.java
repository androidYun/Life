package com.gy.life.service;

import com.gy.life.model.RoleInform;

public interface RoleUserService {
    int insertRoleUser(RoleInform roleInform);

    RoleInform selectById(int roleId);


    RoleInform selectByPhoneAndPassword(String phoneNumber, String password);
}
