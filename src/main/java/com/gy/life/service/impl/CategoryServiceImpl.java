package com.gy.life.service.impl;

import com.gy.life.model.Category;
import com.gy.life.model.ProductDetail;
import com.gy.life.service.CategoryService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryServiceImpl implements CategoryService {

    @Override
    public int insertCategory(Category category) {
        return 0;
    }

    @Override
    public List<Category> selectCategoryList() {
        return null;
    }

    @Override
    public int deleteCategory(int category) {
        return 0;
    }


    @Override
    public List<ProductDetail> selectProductListByCategoryId(int categoryId) {
        return null;
    }
}
