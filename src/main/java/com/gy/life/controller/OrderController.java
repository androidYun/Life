package com.gy.life.controller;

import com.gy.life.common.PageRequest;
import com.gy.life.common.ResultEntity;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.ProductDetail;
import com.gy.life.model.order.ProductOrderDetail;
import com.gy.life.model.request.CartParams;
import com.gy.life.model.request.GoodCreateOrderParams;
import com.gy.life.service.impl.ProductGoodServiceImpl;
import com.gy.life.service.impl.OrderServiceImpl;
import com.gy.life.utils.DateUtils;
import com.gy.life.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    ProductGoodServiceImpl reserveGoodService;

    @Autowired
    OrderServiceImpl orderService;

    @Transactional
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertOrder(@RequestBody CartParams cartParams) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setLeaveMessage(cartParams.getLeaveMessage());
        productOrder.setOrderNumber(StringUtils.getOrderNo());
        productOrder.setOrderTime(DateUtils.getCurrentTime());
        productOrder.setTotalPrice(cartParams.getTotalPrice());
        productOrder.setUserId(cartParams.getUserId());
        productOrder.setOrderStatus(0);
        int productOrderId = orderService.insertOrder(productOrder);
        int insertCount = orderService.insertProductOrderItem(cartParams.getCartList(), productOrder.getOrderId());
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("添加成功");
        } else {
            return ResultEntity.getErrorResult("添加失败");
        }
    }

    @Transactional
    @RequestMapping(value = "/addGood", method = RequestMethod.POST)
    public ResultEntity insertOrder(@RequestBody GoodCreateOrderParams goodCreateOrderParams) {
        List<Integer> productIdList = new ArrayList<>();
        for (GoodCreateOrderParams.BuyProductInform buyProductInform : goodCreateOrderParams.getProductIdList()) {
            productIdList.add(buyProductInform.getProductId());
        }
        List<ProductDetail> productDetailsList = reserveGoodService.selectListByProductId(productIdList);
        if (productDetailsList.size() != goodCreateOrderParams.getProductIdList().size()) {
            return ResultEntity.getErrorResult("有的物品不存在");
        }
        ProductOrder productOrder = new ProductOrder();
        productOrder.setLeaveMessage(goodCreateOrderParams.getLeaveMessage());
        productOrder.setOrderStatus(0);
        productOrder.setOrderTime(DateUtils.getCurrentTime());
        productOrder.setTotalPrice(goodCreateOrderParams.getTotalPrice());
        productOrder.setUserId(goodCreateOrderParams.getUserId());
        productOrder.setOrderNumber(StringUtils.getOrderNo());
        int productOrderId = orderService.insertOrder(productOrder);
        int insertCount = orderService.insertProductOrderItemByList( goodCreateOrderParams.getProductIdList(), productOrderId);
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("添加成功");
        } else {
            return ResultEntity.getErrorResult("添加失败");
        }
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    private ResultEntity loadOrderDetail(int reserveId, @RequestBody PageRequest pageData) {
        return ResultEntity.getSuccessListPage(orderService.selectByReserveId(reserveId));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity loadOrderList(int userId, int orderStatus) {
        List<ProductOrderDetail> productOrderDetails = orderService.selectOrderProductList(userId, orderStatus);
<<<<<<< HEAD
        System.out.println("ddddd" + productOrderDetails.toString());
=======
>>>>>>> 05653f8db55a17c0eff50ec9f8b711f8c8da2641
        return ResultEntity.getSuccessResult(productOrderDetails);
    }

}
