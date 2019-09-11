package com.gy.life.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.model.RoleInform;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleInformMapper extends CrudMapper<RoleInform, Integer> {
    int deleteByPrimaryKey(Integer roleId);

    int insert(RoleInform record);


    @Select("select ri.* from role_inform ri where phone_number=#{phoneNumber}")
    RoleInform selectByPhone(@Param("phoneNumber") String phoneNumber);

    List<RoleInform> selectAll();

    int updateByPrimaryKey(RoleInform record);

    @Select("select ri.* from role_inform ri where open_id=#{openId}")
    RoleInform selectRoleByOpenId(@Param("openId") String openId);
}