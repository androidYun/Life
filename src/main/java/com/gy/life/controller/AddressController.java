package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.Address;
import com.gy.life.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/address")
@RestController
public class AddressController {

    @Autowired
    AddressServiceImpl addressService;

    @Transactional
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertAddress(@RequestBody Address address) {
        List<Address> addresses = addressService.selectAllList(address.getUserId());
        if (addresses.size() == 0) {
            address.setIsDefault(true);
        }
        if (address.getDefault()) {
            addressService.updateAllNotDefault();
        }
        int insertCount = addressService.insertAddress(address);
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("插入成功");
        } else {
            return ResultEntity.getErrorResult("添加失败");
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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity loadAllAddress(int userId) {
        return ResultEntity.getSuccessResult(addressService.selectAllList(userId));
    }

    @RequestMapping(value = "/{addressId}", method = RequestMethod.GET)
    public ResultEntity loadAddressDetail(@PathVariable int addressId) {
        ResultEntity successResult = ResultEntity.getSuccessResult(addressService.selectByAddressId(addressId));
        System.out.println("日志" + successResult.getData().toString());
        return successResult;
    }

    @RequestMapping(value = "/delete/{addressId}", method = RequestMethod.GET)
    public ResultEntity deleteAddress(@PathVariable int addressId) {
        Address address = addressService.selectByAddressId(addressId);
        if (address == null) {
            return ResultEntity.getErrorResult("此地址不存在");
        }
        int deleteCount = addressService.deleteAddress(addressId);
        if (deleteCount > 0) {
            return ResultEntity.getSuccessResult("删除成功");
        } else {
            return ResultEntity.getErrorResult("删除失败");
        }
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultEntity updateAddress(@RequestBody Address address) {
        if (address == null) {
            return ResultEntity.getErrorResult("此地址不存在");
        }
        Address selectAddress = addressService.selectByAddressId(address.getAddressId());
        if (selectAddress == null) {
            return ResultEntity.getErrorResult("此地址不存在");
        }
        int updateCount = addressService.updateAddress(address);
        if (updateCount > 0) {
            return ResultEntity.getSuccessResult("编辑成功");
        } else {
            return ResultEntity.getErrorResult("编辑失败");
        }
    }

    @RequestMapping(value = "/default/{addressId}", method = RequestMethod.GET)
    public ResultEntity updateDefaultAddress(@PathVariable int addressId) {
        Address address = addressService.selectByAddressId(addressId);

        if (address == null) {
            return ResultEntity.getErrorResult("此地址不存在");
        }
        int updateCount = addressService.updateDefaultAddress(addressId, address.getUserId());
        if (updateCount > 0) {
            return ResultEntity.getSuccessResult("更新成功");
        } else {
            return ResultEntity.getErrorResult("更新失败");
        }
    }
}
