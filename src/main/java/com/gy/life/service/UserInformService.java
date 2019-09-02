package com.gy.life.service;

import com.gy.life.model.UserInform;

public interface UserInformService {
    UserInform selectUserByOpenId(String openId);

    int insertUserInform(UserInform userInform);
}
