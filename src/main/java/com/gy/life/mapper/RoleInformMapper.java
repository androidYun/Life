package com.gy.life.mapper;

import com.gy.life.model.RoleInform;
import org.apache.ibatis.annotations.Mapper;

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