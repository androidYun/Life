package com.gy.life.controller;

import com.alibaba.fastjson.JSON;
import com.gy.life.common.PageRequest;
import com.gy.life.common.ResultEntity;
import com.gy.life.model.ProductDetail;
import com.gy.life.model.request.ProductListRequest;
import com.gy.life.model.request.ProductPageRequest;
import com.gy.life.service.impl.CategoryServiceImpl;
import com.gy.life.service.impl.ProductGoodServiceImpl;
import com.gy.life.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {


    @Autowired
    ProductGoodServiceImpl reserveGoodService;

    @Autowired
    CategoryServiceImpl categoryService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private ResultEntity insertReserve(@RequestBody ProductDetail productDetailModel) {
        productDetailModel.setSellOutCount(0);
        productDetailModel.setCreateTime(DateUtils.getCurrentTime());
        int insertCount = reserveGoodService.insertProductGood(productDetailModel);
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("添加成功");
        } else {
            return ResultEntity.getSuccessResult("添加失败");
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private ResultEntity updateReserve(@RequestBody ProductDetail productDetailModel) {
        ProductDetail productDetail = reserveGoodService.selectByProductId(productDetailModel.getProductId());
        if (productDetail == null) {
            return ResultEntity.getErrorResult("此物品不存在");
        }
        productDetailModel.setCreateTime(productDetail.getCreateTime());
        int updateCount = reserveGoodService.updateReserve(productDetailModel);
        if (updateCount > 0) {
            return ResultEntity.getSuccessResult("更新成功");
        } else {
            return ResultEntity.getSuccessResult("更新失败");
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ResultEntity loadProduct(@RequestBody ProductPageRequest productPageRequest) {
        if (productPageRequest.getCategoryId() == null) {
            return ResultEntity.getSuccessListPage(reserveGoodService.selectList(productPageRequest.getMerchantId(), productPageRequest.getPageRequest()));
        } else {
            return ResultEntity.getSuccessResult(categoryService.selectProductListByCategoryId(productPageRequest.getCategoryId(), productPageRequest.getMerchantId()));
        }
    }

    @RequestMapping(value = "/productList", method = RequestMethod.POST)
    public ResultEntity loadProductList(@RequestBody ProductListRequest productListRequest) {
        List<Integer> productList = JSON.parseArray(productListRequest.getList(), Integer.class);
        List<Integer> cartIdList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            cartIdList.add(productList.get(i));
        }
        if (cartIdList.size() == 0) {
            return ResultEntity.getErrorResult("请选择商品");
        }
        return ResultEntity.getSuccessResult(reserveGoodService.selectListByProductId(cartIdList));
    }

    @RequestMapping(value = "/delete/{productId}", method = RequestMethod.GET)
    public ResultEntity deleteReserve(@PathVariable("productId") int productId) {
        int deleteCount = reserveGoodService.deleteReserve(productId);
        if (deleteCount > 0) {
            return ResultEntity.getSuccessResult("删除成功");
        } else {
            return ResultEntity.getSuccessResult("删除失败");
        }

    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public ResultEntity loadReserve(@PathVariable("productId") int productId) {
        ProductDetail productDetail = reserveGoodService.selectByProductId(productId);
        if (productDetail != null) {
            return ResultEntity.getSuccessResult(productDetail);
        } else {
            return ResultEntity.getErrorResult("此预购物品不存在");
        }
    }
}
