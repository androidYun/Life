package com.gy.life.service.impl;

import com.gy.life.mapper.RoleInformMapper;
import com.gy.life.mapper.WxInformMapper;
import com.gy.life.model.RoleInform;
import com.gy.life.model.WxInform;
import com.gy.life.service.ManagerService;
import com.gy.life.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    RoleInformMapper roleInformMapper;

    @Autowired
    WxInformMapper wxInformMapper;

    @Override
    public int insertRole(RoleInform roleInform) {
        WxInform wxInform = new WxInform();
        wxInform.setMerchantNo(UUIDUtils.getMerchantNo());
        wxInformMapper.save(wxInform);
        roleInform.setMerchantId(wxInform.getMerchantId());
        roleInform.setMerchantNo(wxInform.getMerchantNo());
        return roleInformMapper.insert(roleInform);
    }

    @Override
    public RoleInform selectByPhone(String phoneNumber) {
        return roleInformMapper.selectByPhone(phoneNumber);
    }
}
