package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.common.UserToken;
import com.gy.life.exception.GlobalException;
import com.gy.life.jwt.JwtTokenUtils;
import com.gy.life.model.RoleInform;
import com.gy.life.service.impl.RoleUserServiceImpl;
import com.gy.life.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/role")
@RestController
public class RoleUserController {
    @Autowired
    RoleUserServiceImpl roleUserService;

    @Autowired
    JwtTokenUtils jwtTokenUtils;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertRole(@RequestBody RoleInform roleInform) {
        RoleInform selectRole = roleUserService.selectByPhone(roleInform.getPhoneNumber());
        if (selectRole != null) {
            return ResultEntity.getErrorResult("此手机号已经注册");
        }
        roleInform.setMerchantId(new Double(Math.random() * 1000).intValue());
        roleInform.setCreateTime(DateUtils.getCurrentTime());
        int insertCount = roleUserService.insertRoleUser(roleInform);

        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("插入成功");
        } else {
            return ResultEntity.getErrorResult("插入失败");
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResultEntity loadRole(String phoneNumber, String password, int roleType) throws GlobalException {

        try {
            RoleInform roleInform = roleUserService.selectByPhoneAndPassword(phoneNumber, password);
            if (roleInform != null) {
                if (roleInform.getRoleType() == roleType) {
                    UserToken userToken = new UserToken();
                    userToken.setPhoneNumber(roleInform.getPhoneNumber());
                    userToken.setUserName(roleInform.getName());
                    userToken.setUserId(roleInform.getMerchantId());
                    String token = jwtTokenUtils.createToken(userToken);
                    roleInform.setToken(token);
                    return ResultEntity.getSuccessResult(roleInform);
                } else {
                    return ResultEntity.getErrorResult("权限错误");
                }

            } else {
                return ResultEntity.getErrorResult("用户或者面错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(e.getMessage());
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity loadRoleList(int merchantId) {
        RoleInform roleInform = roleUserService.selectById(merchantId);
        if (roleInform == null || roleInform.getRoleType() != 0) {
            return ResultEntity.getErrorResult("用户没权限");
        }
        List<RoleInform> roleInforms = roleUserService.selectRoleList();
        if (roleInforms == null) {
            return ResultEntity.getSuccessResult(new ArrayList<>());
        } else {
            return ResultEntity.getSuccessResult(roleInforms);
        }
    }

    @RequestMapping(value = "/delete/{merchantId}", method = RequestMethod.GET)
    public ResultEntity delete(@PathVariable int merchantId) {
        RoleInform roleInform = roleUserService.selectById(merchantId);
        if (roleInform == null) {
            return ResultEntity.getErrorResult("用户不存在");
        }
        int deleteRoleCount = roleUserService.deleteRole(merchantId);
        if (deleteRoleCount > 0) {
            return ResultEntity.getSuccessResult("删除成功");
        } else {
            return ResultEntity.getErrorResult("删除失败");
        }
    }

    @RequestMapping(value = "/{merchantId}", method = RequestMethod.GET)
    public ResultEntity loadRole(@PathVariable int merchantId) {
        RoleInform roleInform = roleUserService.selectById(merchantId);
        if (roleInform == null) {
            return ResultEntity.getErrorResult("用户不存在");
        }
        return ResultEntity.getSuccessResult(roleInform);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultEntity loadRole(@RequestBody  RoleInform roleInform) {
        RoleInform selectRole = roleUserService.selectById(roleInform.getMerchantId());
        if (selectRole == null) {
            return ResultEntity.getErrorResult("此用户不存在");
        }
        int updateRole = roleUserService.updateRole(roleInform);
        if (updateRole > 0) {
            return ResultEntity.getSuccessResult("更新成功");
        } else {
            return ResultEntity.getErrorResult("更新失败");
        }

    }
}
