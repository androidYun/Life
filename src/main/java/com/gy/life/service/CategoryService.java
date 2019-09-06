package com.gy.life.service;

import com.gy.life.model.Category;
import com.gy.life.model.ProductDetail;

import java.util.List;

public interface CategoryService {

    int insertCategory(Category category);

    List<Category> selectCategoryList();

    int deleteCategory(int category);

    List<ProductDetail> selectProductListByCategoryId(int categoryId);
}
