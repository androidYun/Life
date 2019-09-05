package com.gy.life.mapper;

import com.gy.life.model.ProductDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReserveGoodMapper {
    int deleteByPrimaryKey(Integer reserveId);

    int insert(ProductDetail record);

    ProductDetail selectByPrimaryKey(Integer reserveId);


    List<ProductDetail> selectAll();


    List<ProductDetail> selectListByProductId(@Param("productIdList") List<Integer> productIdList);

    int updateByPrimaryKey(ProductDetail record);
}