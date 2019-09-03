package com.gy.life.mapper;


import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.model.ProductCart;
import com.gy.life.model.ProductCartDetail;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author ${param.author}
 */
public interface ProductCartMapper extends CrudMapper<ProductCart, Integer> {


    @Select("select * from product_cart where user_id=#{userId} and product_id=#{productId}")
    ProductCart selectByUserId(@PathVariable int userId, int productId);

    List<ProductCartDetail> selectCartDetails(int userId);

    List<ProductCartDetail> selectListByCartId(@Param("cardIdList") List<Integer> cartIdList);
}
