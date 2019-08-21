package com.gy.life.controller;

import com.gitee.fastmybatis.core.query.Query;
import com.gy.life.common.ResultEntity;
import com.gy.life.mapper.GoodUnitMapper;
import com.gy.life.model.GoodUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.gy.life.common.ResultEntity.getSuccessResult;

@RequestMapping(value = "/unit")
@RestController
public class UnitController {

    @Autowired
    GoodUnitMapper unitMapper;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertUnit(@RequestBody GoodUnit goodUnit) {

        if (StringUtils.isEmpty(goodUnit.getUnitName())) {
            return ResultEntity.getErrorResult("名字不能为空");
        }
        GoodUnit goodUnitByName = unitMapper.getByColumn("unit_name", goodUnit.getUnitName());
        if (goodUnitByName != null) {
            return ResultEntity.getErrorResult("单位已存在");
        }
        int save = unitMapper.save(goodUnit);
        if (save > 0) {
            return getSuccessResult(unitMapper.list(new Query().setQueryAll(true)));
        } else {
            return ResultEntity.getErrorResult("添加失败");
        }
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity loadList() {
        return ResultEntity.getSuccessResult(unitMapper.list(new Query().setQueryAll(true)));
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ResultEntity deleteUnit(int unitId) {
        unitMapper.deleteById(unitId);
        return ResultEntity.getSuccessResult(unitMapper.list(new Query().setQueryAll(true)));
    }
}
