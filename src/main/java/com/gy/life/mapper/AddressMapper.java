package com.gy.life.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.model.Address;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


/**
 * @author ${param.author}
 */
public interface AddressMapper extends CrudMapper<Address, Integer> {

    @Select("select * from address where user_id=#{userId}")
    List<Address> selectAddressList(@Param("userId") int userId);

<<<<<<< HEAD
    @Select("select * from address where is_default=1 and user_id=#{userId} LIMIT 1")
    Address selectDefaultAddress(@Param("userId") int userId);

    @Update("update address set is_default=1 where address_id=#{addressId}")
    int updateDefaultAddress(@Param("addressId") int addressId);

    @Update("update address set is_default=0 where is_default=1 and user_id=#{userId}")
    int setDefaultToIsNot(@Param("userId") int userId);


=======
    @Select("select * from address where user_id=#{userId} and is_default=1 LIMIT 1 ")
    Address selectDefaultAddress(@Param("userId") int userId);
>>>>>>> bff75bd61ace82f108f885576c7f37a2e2a46a86
}
