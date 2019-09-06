package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gy.life.mapper.ReserveGoodMapper;
import com.gy.life.model.ProductDetail;
import com.gy.life.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductGoodServiceImpl implements ProductService {
    @Autowired
    ReserveGoodMapper reserveGoodMapper;

    @Override
    public int insertProductGood(ProductDetail productDetail) {
        return reserveGoodMapper.save(productDetail);
    }

    @Override
    public List<ProductDetail> selectList() {
        Page<Object> page = PageHelper.startPage(1, 20);
        return reserveGoodMapper.selectAll();
    }

    @Override
    public int deleteReserve(int reserveId) {
        return reserveGoodMapper.deleteByPrimaryKey(reserveId);
    }

    @Override
    public int updateReserve(ProductDetail productDetailModel) {
        return reserveGoodMapper.update(productDetailModel);
    }

    @Override
    public ProductDetail selectByProductId(int productId) {
        return reserveGoodMapper.getByColumn("product_id",productId);
    }

    @Override
    public List<ProductDetail> selectListByProductId(List<Integer> productIdList) {
        return reserveGoodMapper.selectListByProductId(productIdList);
    }
}
