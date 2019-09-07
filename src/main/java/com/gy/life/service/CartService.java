package com.gy.life.service;

import com.gy.life.model.ProductCart;
import com.gy.life.model.ProductCartDetail;

import java.util.List;

public interface CartService {

    Integer insertCart(ProductCart productCart);

    ProductCart selectByCart(Integer cartId);

    ProductCart selectByUserId(Integer userId, Integer productId);

    List<ProductCartDetail> selectAllList(Integer userId);

    List<ProductCartDetail> selectCartGoodList(List<Integer> cartListId);

    Integer updateCart(ProductCart productCart);

    Integer deleteCart(Integer cartId);

    Integer calculateCartTotalCount(Integer userId);


}
