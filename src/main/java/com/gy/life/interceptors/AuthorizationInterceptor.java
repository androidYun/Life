package com.gy.life.interceptors;

import com.alibaba.fastjson.JSONObject;
import com.gy.life.common.ResultEntity;
import com.gy.life.jwt.JwtTokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class AuthorizationInterceptor implements HandlerInterceptor {

    @Autowired
    JwtTokenUtils jwtTokenUtils;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        if (StringUtils.isEmpty(token)) {
            responseMessage(response, ResultEntity.getErrorResult(70002, "token不能为空"));
            return true;
        }
        String userName = jwtTokenUtils.getPhoneNumberByToken(token);
        String phoneNumber = jwtTokenUtils.getPhoneNumberByToken(token);
        Integer userId = jwtTokenUtils.getUserIdByToken(token);
        if (userId == null) {
            responseMessage(response, ResultEntity.getErrorResult(70002, "请从新登陆"));
            return true;
        }
        request.setAttribute("userId", userId);
        request.setAttribute("phoneNumber", phoneNumber);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    //请求不通过，返回错误信息给客户端
    private void responseMessage(HttpServletResponse response,
                                 ResultEntity resultEntity) {
        response.setCharacterEncoding("UTF-8");

        try {
            PrintWriter out = response.getWriter();
            response.setContentType("application/json; charset=utf-8");
            String json = JSONObject.toJSONString(resultEntity);
            out.print(json);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                response.sendError(500);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
