package com.gy.life.controller;


import com.gy.life.common.ResultEntity;
import com.gy.life.model.RoleInform;
import com.gy.life.service.impl.ManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/web")
public class ManagerController {

    @Autowired
    ManagerServiceImpl managerService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResultEntity addUser(@RequestBody RoleInform roleInform) {
        if (StringUtils.isEmpty(roleInform.getPhoneNumber())) {
            return ResultEntity.getErrorResult("手机号不能为空");
        }
        if (StringUtils.isEmpty(roleInform.getName())) {
            return ResultEntity.getErrorResult("姓名不能为空");
        }
        if (StringUtils.isEmpty(roleInform.getPassword())) {
            return ResultEntity.getErrorResult("密码不能为空");
        }
        if (roleInform.getRoleType() == null) {
            return ResultEntity.getErrorResult("请选择角色");
        }
        roleInform.setCreateTime(new Date());
        RoleInform roleByPhone = managerService.selectByPhone(roleInform.getPhoneNumber());
        if (roleByPhone != null) {
            return ResultEntity.getErrorResult("此手机号已经注册");
        }

        int column = managerService.insertRole(roleInform);
        if (column > 0) {
            return ResultEntity.getSuccessResult("注册成功");
        } else {
            return ResultEntity.getErrorResult("注册失败");
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public ResultEntity login(String phoneNumber, String password) {
        if (StringUtils.isEmpty(phoneNumber)) {
            return ResultEntity.getErrorResult("手机号不能为空");
        }
        if (StringUtils.isEmpty(password)) {
            return ResultEntity.getErrorResult("密码不能为空");
        }
        RoleInform roleByPhone = managerService.selectByPhone(phoneNumber);
        if (roleByPhone == null) {
            return ResultEntity.getErrorResult("此用户不存在");
        }
        if (!roleByPhone.getPassword().equals(password)) {
            return ResultEntity.getErrorResult("用户名和密码不正确");
        }
        return ResultEntity.getSuccessResult(roleByPhone);
    }


}
