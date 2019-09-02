package com.gy.life.service.impl;

import com.gy.life.mapper.UserInformMapper;
import com.gy.life.model.UserInform;
import com.gy.life.service.UserInformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInformServiceImpl implements UserInformService {

    @Autowired
    UserInformMapper userInformMapper;

    @Override
    public UserInform selectUserByOpenId(String openId) {
        return userInformMapper.getByColumn("open_id", openId);
    }

    @Override
    public int insertUserInform(UserInform userInform) {
        return userInformMapper.save(userInform);
    }
}
