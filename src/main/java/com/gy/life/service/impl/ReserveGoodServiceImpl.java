package com.gy.life.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gy.life.mapper.ReserveGoodMapper;
import com.gy.life.model.ProductDetail;
import com.gy.life.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReserveGoodServiceImpl implements ReserveService {
    @Autowired
    ReserveGoodMapper reserveGoodMapper;

    @Override
    public int insertServeGood(ProductDetail productDetail) {
        return reserveGoodMapper.insert(productDetail);
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
        return reserveGoodMapper.updateByPrimaryKey(productDetailModel);
    }

    @Override
    public ProductDetail selectByReserveId(int reserveId) {
        return reserveGoodMapper.selectByPrimaryKey(reserveId);
    }
}
