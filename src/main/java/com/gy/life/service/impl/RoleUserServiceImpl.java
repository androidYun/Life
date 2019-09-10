package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.gy.life.mapper.RoleInformMapper;
import com.gy.life.model.RoleInform;
import com.gy.life.service.RoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleUserServiceImpl implements RoleUserService {

    @Autowired
    RoleInformMapper roleInformMapper;

    @Override
    public int insertRoleUser(RoleInform roleInform) {
        return roleInformMapper.insert(roleInform);
    }

    @Override
    public RoleInform selectById(int roleId) {
        return roleInformMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public RoleInform selectByPhoneAndPassword(String phoneNumber, String password) {
        RoleInform roleInform = roleInformMapper.selectByPhone(phoneNumber);
        if (roleInform != null && roleInform.getPassword().equals(password)) {
            return roleInform;
        }
        return null;
    }

    @Override
    public RoleInform selectByPhone(String phoneNumber) {
        return roleInformMapper.selectByPhone(phoneNumber);
    }

    @Override
    public List<RoleInform> selectRoleList() {
        return roleInformMapper.list(new Query());
    }

    @Override
    public int deleteRole(int merchantId) {
        return roleInformMapper.deleteById(merchantId);
    }

    @Override
    public RoleInform selectRoleByOpenId(String openId) {
        return roleInformMapper.selectRoleByOpenId(openId);
    }
}
