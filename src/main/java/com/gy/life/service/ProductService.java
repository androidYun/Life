package com.gy.life.service;

import com.gy.life.common.PageEntity;
import com.gy.life.common.PageRequest;
import com.gy.life.model.ProductDetail;

import java.util.List;

public interface ProductService {

    int insertProductGood(ProductDetail productDetail);

    PageEntity selectList(int merchantId, PageRequest pageRequest);

    List<ProductDetail> selectListByProductId(List<Integer> productIdList);

    int deleteReserve(int reserveId);

    int updateReserve(ProductDetail productDetailModel);

    ProductDetail selectByProductId(int productId);

}
