package com.gy.life.service;

import com.gy.life.model.RoleInform;

import java.util.List;

public interface RoleUserService {
    int insertRoleUser(RoleInform roleInform);

    RoleInform selectById(int roleId);


    RoleInform selectByPhoneAndPassword(String phoneNumber, String password);


    RoleInform selectByPhone(String phoneNumber);

    List<RoleInform> selectRoleList();

    int deleteRole(int merchantId);


    RoleInform selectRoleByOpenId(String openId);
}
