package com.gy.life.service.impl;

import com.gy.life.mapper.ProductCartMapper;
import com.gy.life.model.ProductCart;
import com.gy.life.model.ProductCartDetail;
import com.gy.life.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CartServiceImpl implements CartService {

    @Autowired
    ProductCartMapper productCartMapper;

    @Override
    public Integer insertCart(ProductCart productCart) {
        return productCartMapper.save(productCart);
    }

    @Override
    public ProductCart selectByCart(Integer CartId) {
        return productCartMapper.getById(CartId);
    }

    @Override
    public List<ProductCartDetail> selectAllList(Integer userId) {
        return productCartMapper.selectCartDetails(userId);
    }

    @Override
    public Integer updateCart(ProductCart productCart) {
        return productCartMapper.update(productCart);
    }

    @Override
    public ProductCart selectByUserId(Integer userId, Integer productId) {
        return productCartMapper.selectByUserId(userId, productId);
    }

    @Override
    public Integer deleteCart(Integer CartId) {
        return productCartMapper.deleteById(CartId);
    }

    @Override
    public List<ProductCartDetail> selectCartGoodList(List<Integer> cartListId) {
        return productCartMapper.selectListByCartId(cartListId);
    }

    @Override
    public Integer calculateCartTotalCount(Integer userId) {
        return productCartMapper.calculateCartTotalCount(userId);
    }
}
