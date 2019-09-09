package com.gy.life.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.model.Community;
import com.gy.life.model.ProductDetail;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ProductDetailMapper extends CrudMapper<ProductDetail, Integer> {
    int deleteByPrimaryKey(Integer reserveId);

    int insert(ProductDetail record);

    ProductDetail selectByPrimaryKey(Integer reserveId);


    List<ProductDetail> selectAll(int merchantId);

    List<ProductDetail> selectListByProductId(@Param("productIdList") List<Integer> productIdList);

    int updateByPrimaryKey(ProductDetail record);

    @Update("update product_detail set sell_out_count=sell_out_count + #{increaseCount} where product_id=#{productId} ")
    int updateSellCount(@Param("increaseCount") int increaseCount, @Param("productId") int productId);
}