package com.gy.life.controller;

import com.gy.life.common.PageRequest;
import com.gy.life.common.ResultEntity;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.request.CartParams;
import com.gy.life.model.request.OrderRequest;
import com.gy.life.service.impl.ReserveGoodServiceImpl;
import com.gy.life.service.impl.OrderServiceImpl;
import com.gy.life.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    ReserveGoodServiceImpl reserveGoodService;

    @Autowired
    OrderServiceImpl reserveOrderService;

    @Transactional
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertOrder(@RequestBody CartParams cartParams) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setLeaveMessage(cartParams.getLeaveMessage());
        productOrder.setOrderStatus(0);
        productOrder.setOrderTime(DateUtils.INSTANCE.getCurrentTime());
        productOrder.setTotalPrice(cartParams.getTotalPrice());
        productOrder.setUserId(cartParams.getUserId());
        int productOrderId = reserveOrderService.insertOrder(productOrder);
        int insertCount = reserveOrderService.insertProductOrderItem(cartParams.getCartList(), productOrderId);
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("添加成功");
        } else {
            return ResultEntity.getErrorResult("添加失败");
        }

    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    private ResultEntity loadOrderDetail(int reserveId, @RequestBody PageRequest pageData) {
        return ResultEntity.getSuccessListPage(reserveOrderService.selectByReserveId(reserveId));
    }
}
