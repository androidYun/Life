package com.gy.life.controller;

import com.gy.life.model.ReserveGoodModel;
import com.gy.life.service.impl.ReserveGoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reserve")
public class ReserveController {
    @Autowired
    ReserveGoodServiceImpl reserveGoodService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    private String insertReserve(ReserveGoodModel reserveGoodModel) {
        reserveGoodService.insertServeGood(reserveGoodModel);
        return "good";
    }

}
