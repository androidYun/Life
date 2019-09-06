package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.gy.life.mapper.ProductCategoryMapper;
import com.gy.life.model.ProductCategory;
import com.gy.life.model.ProductDetail;
import com.gy.life.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Override
    public int insertCategory(ProductCategory category) {
        return productCategoryMapper.save(category);
    }

    @Override
    public List<ProductCategory> selectCategoryList() {
        return productCategoryMapper.list(new Query());
    }

    @Override
    public int deleteCategory(int categoryId) {
        return productCategoryMapper.deleteById(categoryId);
    }

    @Override
    public ProductCategory selectCategoryByName(String categoryName) {
        return productCategoryMapper.getByColumn("category_name", categoryName);
    }

    @Override
    public List<ProductDetail> selectProductListByCategoryId(int categoryId) {
        return productCategoryMapper.selectProductDetailByCategoryId(categoryId);
    }
}
