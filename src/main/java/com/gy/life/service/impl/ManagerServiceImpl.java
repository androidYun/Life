package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.gy.life.mapper.RoleInformMapper;
import com.gy.life.model.RoleInform;
import com.gy.life.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    RoleInformMapper roleInformMapper;

    @Override
    public int insertRole(RoleInform roleInform) {
        return roleInformMapper.insert(roleInform);
    }

    @Override
    public RoleInform selectByPhone(String phoneNumber) {
        return roleInformMapper.selectByPhone(phoneNumber);
    }
}
