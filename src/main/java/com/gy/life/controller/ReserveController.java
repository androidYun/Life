package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.ReserveGood;
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
    private ResultEntity insertReserve(@RequestBody ReserveGood reserveGoodModel) {
        System.out.println("时间" + reserveGoodModel.toString());
        reserveGoodModel.setSellOutCount(0);
        reserveGoodModel.setCreateTime(DateUtils.INSTANCE.getCurrentTime());
        int insertCount = reserveGoodService.insertServeGood(reserveGoodModel);
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("添加成功");
        } else {
            return ResultEntity.getSuccessResult("添加失败");
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private ResultEntity updateReserve(@RequestBody ReserveGood reserveGoodModel) {
        ReserveGood reserveGood = reserveGoodService.selectByReserveId(reserveGoodModel.getReserveId());
        if (reserveGood == null) {
            return ResultEntity.getErrorResult("此物品不存在");
        }
        reserveGoodModel.setCreateTime(reserveGood.getCreateTime());
        int updateCount = reserveGoodService.updateReserve(reserveGoodModel);
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

    @RequestMapping(value = "/delete/{reserveId}", method = RequestMethod.GET)
    public ResultEntity deleteReserve(@PathVariable("reserveId") int reserveId) {
        int deleteCount = reserveGoodService.deleteReserve(reserveId);
        if (deleteCount > 0) {
            return ResultEntity.getSuccessResult(reserveGoodService.selectList());
        } else {
            return ResultEntity.getSuccessResult("删除失败");
        }

    }

    @RequestMapping(value = "/{reserveId}", method = RequestMethod.GET)
    public ResultEntity loadReserve(@PathVariable("reserveId") int reserveId) {
        ReserveGood reserveGood = reserveGoodService.selectByReserveId(reserveId);
        if (reserveGood != null) {
            return ResultEntity.getSuccessResult(reserveGood);
        } else {
            return ResultEntity.getErrorResult("此预购物品不存在");
        }

    }
}
