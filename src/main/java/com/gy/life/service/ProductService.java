package com.gy.life.service;

import com.gy.life.model.ProductDetail;

import java.util.List;

public interface ProductService {

    int insertProductGood(ProductDetail productDetail);

    List<ProductDetail> selectList(int merchantId);

    List<ProductDetail> selectListByProductId(List<Integer> productIdList);

    int deleteReserve(int reserveId);

    int updateReserve(ProductDetail productDetailModel);

    ProductDetail selectByProductId(int productId);

}
