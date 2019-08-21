package com.gy.life.service;

import com.gy.life.model.ReserveGood;

import java.util.List;

public interface ReserveService {

    int insertServeGood(ReserveGood reserveGood);

    List<ReserveGood> selectList();

    int deleteReserve(int reserveId);

    int updateReserve(ReserveGood reserveGoodModel);

    ReserveGood selectByReserveId(int reserveId);
}
