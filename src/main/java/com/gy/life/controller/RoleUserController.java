package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.common.UserToken;
import com.gy.life.jwt.JwtTokenUtils;
import com.gy.life.model.RoleInform;
import com.gy.life.service.impl.RoleUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/role")
@RestController
public class RoleUserController {
    @Autowired
    RoleUserServiceImpl roleUserService;

    @Autowired
    JwtTokenUtils jwtTokenUtils;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertRole(@RequestBody RoleInform roleInform) {
        int insertCount = roleUserService.insertRoleUser(roleInform);
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("插入成功");
        } else {
            return ResultEntity.getErrorResult("插入失败");
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResultEntity loadRole(String phoneNumber, String password, int roleType) {
        System.out.println("ddd");
        RoleInform roleInform = roleUserService.selectByPhoneAndPassword(phoneNumber, password);
        if (roleInform != null) {
            if (roleInform.getRoleType() == roleType) {
                UserToken userToken = new UserToken();
                userToken.setPhoneNumber(roleInform.getPhoneNumber());
                userToken.setUserName(roleInform.getName());
                userToken.setUserId(roleInform.getRoleId());
                String token = jwtTokenUtils.createToken(userToken);
                roleInform.setToken(token);
                return ResultEntity.getSuccessResult(roleInform);
            } else {
                return ResultEntity.getErrorResult("权限错误");
            }

        } else {
            return ResultEntity.getErrorResult("用户或者面错误");
        }
    }


}
