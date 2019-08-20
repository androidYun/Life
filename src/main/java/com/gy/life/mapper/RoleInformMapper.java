package com.gy.life.mapper;

import com.gy.life.model.RoleInform;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface RoleInformMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(RoleInform record);

    RoleInform selectByPrimaryKey(Integer roleId);

    RoleInform selectByPhone(String phoneNumber);

    List<RoleInform> selectAll();

    int updateByPrimaryKey(RoleInform record);
}