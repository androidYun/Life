package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.gy.life.mapper.ProductCartMapper;
import com.gy.life.model.ProductCart;
import com.gy.life.model.ProductCartDetail;
import com.gy.life.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.CacheRequest;
import java.util.List;

@Component
public class CartServiceImpl implements CartService {

    @Autowired
    ProductCartMapper productCartMapper;

    @Override
    public int insertCart(ProductCart productCart) {
        return productCartMapper.save(productCart);
    }

    @Override
    public ProductCart selectByCart(int CartId) {
        return productCartMapper.getById(CartId);
    }

    @Override
    public List<ProductCartDetail> selectAllList(int userId) {
        return productCartMapper.selectCartDetails(userId);
    }

    @Override
    public int updateCart(ProductCart productCart) {
        return productCartMapper.update(productCart);
    }

    @Override
    public ProductCart selectByUserId(int userId, int productId) {
        return productCartMapper.selectByUserId(userId, productId);
    }

    @Override
    public int deleteCart(int CartId) {
        return productCartMapper.deleteById(CartId);
    }

    @Override
    public List<ProductCartDetail> selectCartGoodList(List<Integer> cartListId) {
        System.out.println("对不对"+ cartListId);
        return productCartMapper.selectListByCartId(cartListId);
    }


}
