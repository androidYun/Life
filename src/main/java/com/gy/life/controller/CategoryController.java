package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.ProductCategory;
import com.gy.life.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/category")
@RestController
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity loadCategoryList() {
        return ResultEntity.getSuccessResult(categoryService.selectCategoryList());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertCategory(@RequestBody ProductCategory category) {
        ProductCategory selectProductCategory = categoryService.selectCategoryByName(category.getCategoryName());
        if (selectProductCategory != null) {
            return ResultEntity.getErrorResult("此分类已经存在");
        }
        return ResultEntity.getSuccessResult(categoryService.insertCategory(category));
    }

    @RequestMapping(value = "/delete/{categoryId}", method = RequestMethod.GET)
    public ResultEntity deleteCategory(@PathVariable("categoryId") int categoryId) {
        return ResultEntity.getSuccessResult(categoryService.deleteCategory(categoryId));
    }
}
