package com.gy.life.controller;

import com.gy.life.common.PageRequest;
import com.gy.life.common.ResultEntity;
import com.gy.life.enumeration.ReserveOrderStateEnum;
import com.gy.life.model.ReserveGood;
import com.gy.life.model.ReserveOrder;
import com.gy.life.service.impl.ReserveGoodServiceImpl;
import com.gy.life.service.impl.ReserveOrderServiceImpl;
import com.gy.life.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/reserve/order")
public class ReserveOrderController {
    @Autowired
    ReserveGoodServiceImpl reserveGoodService;

    @Autowired
    ReserveOrderServiceImpl reserveOrderService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private ResultEntity insertOrder(int reserveId, int userId, int buyCount) {
        ReserveGood reserveGoodModel = reserveGoodService.selectByReserveId(reserveId);
        if (reserveGoodModel == null) {
            return ResultEntity.getErrorResult("此货物不存在");
        }
        ReserveOrder selectReserveOrder = reserveOrderService.selectByUserIdAndReserveId(userId, reserveId);
        if (selectReserveOrder != null) {
            return ResultEntity.getErrorResult("已经预定过此物品");
        }
        ReserveOrder reserveOrder = new ReserveOrder();
        reserveOrder.setBuyCount(buyCount);
        reserveOrder.setBuyTime(DateUtils.INSTANCE.getCurrentTime());
        reserveOrder.setReserveId(reserveId);
        reserveOrder.setUserId(userId);
        reserveOrder.setExpectAmount(reserveGoodModel.getGoodPrice().multiply(new BigDecimal(buyCount)));
        reserveOrder.setOrderState(ReserveOrderStateEnum.Create.getState());
        int insertCount = reserveOrderService.insertIntoReserveOrder(reserveOrder);
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("添加订单成功");
        } else {
            return ResultEntity.getErrorResult("添加订单失败");
        }
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    private ResultEntity loadOrderDetail(int reserveId, @RequestBody PageRequest pageData) {
        return ResultEntity.getSuccessListPage(reserveOrderService.selectByReserveId(reserveId));
    }
}
