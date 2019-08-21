package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.ReserveGood;
import com.gy.life.service.impl.ReserveGoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/reserve/order")
public class ReserveOrderController {
    @Autowired
    ReserveGoodServiceImpl reserveGoodService;


    @RequestMapping(value = "insert", method = RequestMethod.GET)
    private ResultEntity insertOrder(int userId, int reserveId) {
        ReserveGood reserveGoodModel = reserveGoodService.selectByReserveId(reserveId);
        if (reserveGoodModel == null) {
            return ResultEntity.getErrorResult("此货物不存在");
        }
        return null;
    }
}
