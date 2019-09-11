package com.gy.life.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gy.life.common.PageEntity;
import com.gy.life.common.PageRequest;
import com.gy.life.mapper.ProductDetailMapper;
import com.gy.life.model.ProductDetail;
import com.gy.life.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductGoodServiceImpl implements ProductService {
    @Autowired
    ProductDetailMapper productDetailMapper;

    @Override
    public int insertProductGood(ProductDetail productDetail) {
        return productDetailMapper.save(productDetail);
    }

    @Override
    public PageEntity selectList(int merchantId, PageRequest pageRequest) {
        PageHelper.startPage(pageRequest.getPageNumber(), pageRequest.getPageSize());
        List<ProductDetail> list = productDetailMapper.selectAll(merchantId);
        PageInfo<ProductDetail> page = new PageInfo<>(list);
        PageEntity pageEntity = PageEntity.createPageEntity(page.getPages(), page.getPageSize(), page.getPageNum(), page.getTotal(), list);
        return pageEntity;
    }

    @Override
    public int deleteReserve(int reserveId) {
        return productDetailMapper.deleteByPrimaryKey(reserveId);
    }

    @Override
    public int updateReserve(ProductDetail productDetailModel) {
        return productDetailMapper.update(productDetailModel);
    }

    @Override
    public ProductDetail selectByProductId(int productId) {
        return productDetailMapper.getByColumn("product_id", productId);
    }

    @Override
    public List<ProductDetail> selectListByProductId(List<Integer> productIdList) {
        return productDetailMapper.selectListByProductId(productIdList);
    }
}
