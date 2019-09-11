package com.gy.life.exception;

import com.alibaba.fastjson.JSONObject;
import com.gy.life.common.ResultEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(GlobalException.class)
    public ResultEntity passwordMistake(GlobalException e) {
        JSONObject result = new JSONObject();
        result.put("code", "1201");
        result.put("msg", e.getMessage());
        return ResultEntity.getErrorResult(e.getMessage());
    }
}
