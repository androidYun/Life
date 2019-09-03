package com.gy.life.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.model.Address;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @author ${param.author}
 */
public interface AddressMapper extends CrudMapper<Address, Integer> {

    @Select("select * from address where user_id=#{userId}")
    List<Address> selectAddressList(@Param("userId") int userId);

    @Select("select * from address where user_id=#{userId} and is_default=1 LIMIT 1 ")
    Address selectDefaultAddress(@Param("userId") int userId);
}
