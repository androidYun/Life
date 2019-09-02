package com.gy.life.service;

import com.gy.life.model.ProductCart;
import com.gy.life.model.ProductCartDetail;

import java.util.List;

public interface CartService {

    int insertCart(ProductCart productCart);

    ProductCart selectByCart(int cartId);

    ProductCart selectByUserId(int userId, int productId);

    List<ProductCartDetail> selectAllList(int userId);


    int updateCart(ProductCart productCart);


    int deleteCart(int cartId);
}
