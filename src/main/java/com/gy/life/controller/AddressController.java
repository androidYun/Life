package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.Address;
import com.gy.life.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/address")
@RestController
public class AddressController {

    @Autowired
    AddressServiceImpl addressService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertAddress(@RequestBody Address address) {
        int insertCount = addressService.insertAddress(address);
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("插入成功");
        } else {
            return ResultEntity.getSuccessResult("添加失败");
        }
    }
    @RequestMapping(value = "/default", method = RequestMethod.GET)
    public ResultEntity getDefaultAddress(int userId) {
        Address address = addressService.selectDefaultAddress(userId);
        if (address == null) {
            return ResultEntity.getErrorResult("没有默认地址");
        }
        return ResultEntity.getSuccessResult(address);
    }

}
