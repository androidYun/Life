package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.ProductDetail;
import com.gy.life.service.impl.ReserveGoodServiceImpl;
import com.gy.life.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reserve")
public class ReserveController {


    @Autowired
    ReserveGoodServiceImpl reserveGoodService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private ResultEntity insertReserve(@RequestBody ProductDetail productDetailModel) {
        System.out.println("时间" + productDetailModel.toString());
        productDetailModel.setSellOutCount(0);
        productDetailModel.setCreateTime(DateUtils.INSTANCE.getCurrentTime());
        int insertCount = reserveGoodService.insertServeGood(productDetailModel);
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("添加成功");
        } else {
            return ResultEntity.getSuccessResult("添加失败");
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private ResultEntity updateReserve(@RequestBody ProductDetail productDetailModel) {
        ProductDetail productDetail = reserveGoodService.selectByReserveId(productDetailModel.getProductId());
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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity loadReserveList() {
        return ResultEntity.getSuccessResult(reserveGoodService.selectList());
    }

    @RequestMapping(value = "/delete/{productId}", method = RequestMethod.GET)
    public ResultEntity deleteReserve(@PathVariable("productId") int productId) {
        int deleteCount = reserveGoodService.deleteReserve(productId);
        if (deleteCount > 0) {
            return ResultEntity.getSuccessResult(reserveGoodService.selectList());
        } else {
            return ResultEntity.getSuccessResult("删除失败");
        }

    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public ResultEntity loadReserve(@PathVariable("productId") int productId) {
        ProductDetail productDetail = reserveGoodService.selectByReserveId(productId);
        if (productDetail != null) {
            return ResultEntity.getSuccessResult(productDetail);
        } else {
            return ResultEntity.getErrorResult("此预购物品不存在");
        }

    }
}
