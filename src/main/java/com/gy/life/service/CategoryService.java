package com.gy.life.service;

import com.gy.life.model.ProductCategory;
import com.gy.life.model.ProductDetail;

import java.util.List;

public interface CategoryService {

    int insertCategory(ProductCategory category);

    List<ProductCategory> selectCategoryList();

    int deleteCategory(int category);

    ProductCategory selectCategoryByName(String categoryName);

    List<ProductDetail> selectProductListByCategoryId(int categoryId,int merchantId);
}
