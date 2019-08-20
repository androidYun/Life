package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login")
    private ResultEntity addUser() {
        return ResultEntity.getErrorResult("手机号不能为空");
    }

}
