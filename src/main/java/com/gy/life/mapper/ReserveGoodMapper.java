package com.gy.life.mapper;

import com.gy.life.model.ProductDetail;

import java.util.List;

public interface ReserveGoodMapper {
    int deleteByPrimaryKey(Integer reserveId);

    int insert(ProductDetail record);

    ProductDetail selectByPrimaryKey(Integer reserveId);

    List<ProductDetail> selectAll();

    int updateByPrimaryKey(ProductDetail record);
}