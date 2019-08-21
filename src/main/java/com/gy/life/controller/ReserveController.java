package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.ReserveGood;
import com.gy.life.service.impl.ReserveGoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reserve")
public class ReserveController {


    @Autowired
    ReserveGoodServiceImpl reserveGoodService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private ResultEntity insertReserve(@RequestBody ReserveGood reserveGoodModel) {
        System.out.println("时间" + reserveGoodModel.toString());
        int deleteCount = reserveGoodService.insertServeGood(reserveGoodModel);
        if (deleteCount > 0) {
            return ResultEntity.getSuccessResult("添加成功");
        } else {
            return ResultEntity.getSuccessResult("添加失败");
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity loadReserveList() {
        return ResultEntity.getSuccessResult(reserveGoodService.selectList());
    }

    @RequestMapping(value = "/delete/{reserveId}", method = RequestMethod.GET)
    public ResultEntity deleteReserve(@PathVariable("reserveId") int reserveId) {
        int deleteCount = reserveGoodService.deleteReserve(reserveId);
        if (deleteCount > 0) {
            return ResultEntity.getSuccessResult("删除成功");
        } else {
            return ResultEntity.getSuccessResult("删除失败");
        }

    }
}
