package com.gy.life.mapper;

import com.gy.life.model.UserInform;
import java.util.List;

public interface UserInformMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInform record);

    UserInform selectByPrimaryKey(Integer userId);

    List<UserInform> selectAll();

    int updateByPrimaryKey(UserInform record);
}