package com.gy.life.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gy.life.common.ResultEntity;
import com.gy.life.jwt.JwtTokenUtils;
import com.gy.life.model.UserInform;
import com.gy.life.service.impl.UserInformServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/wx")
public class WxController {

    @Value("${oauth.wx.appId}")
    private String appId;

    @Value("${oauth.wx.secret}")
    private String secret;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UserInformServiceImpl userInformService;

    @Autowired
    JwtTokenUtils jwtTokenUtils;


    @RequestMapping(value = "/login")
    public ResultEntity login(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid={appId}&secret={secret}&js_code={code}&grant_type=authorization_code";
        Map<String, Object> map = new HashMap<>();
        map.put("appId", appId);
        map.put("secret", secret);
        map.put("code", code);
        String str = restTemplate.getForObject(url, String.class, map);
        JSONObject jsonObject = JSON.parseObject(str);
        String openid = jsonObject.getString("openid");
        String session_key = jsonObject.getString("session_key");
        UserInform selectUserInform = userInformService.selectUserByOpenId(openid);

        if (selectUserInform == null) {
            UserInform userInform = new UserInform();
            userInform.setOpenId(openid);
            int userId = userInformService.insertUserInform(userInform);
            String token = jwtTokenUtils.createToken(userId + "");
            userInform.setToken(token);
            return ResultEntity.getSuccessResult(userInform);
        } else {
            String token = jwtTokenUtils.createToken(selectUserInform.getUserId() + "");
            selectUserInform.setToken(token);
            return ResultEntity.getSuccessResult(selectUserInform);
        }
    }
}
