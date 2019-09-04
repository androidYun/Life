package com.gy.life.service;

import com.gy.life.model.ProductDetail;

import java.util.List;

public interface ReserveService {

    int insertServeGood(ProductDetail productDetail);

    List<ProductDetail> selectList();

    int deleteReserve(int reserveId);

    int updateReserve(ProductDetail productDetailModel);

    ProductDetail selectByReserveId(int reserveId);
}
