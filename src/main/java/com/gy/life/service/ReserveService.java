package com.gy.life.service;

import com.gy.life.model.ReserveGoodModel;

import java.util.List;

public interface ReserveService {

    int insertServeGood(ReserveGoodModel reserveGoodModel);

    List<ReserveGoodModel> selectList();

    int deleteReserve(int reserveId);

    int updateReserve(ReserveGoodModel reserveGoodModel);

    ReserveGoodModel selectByReserveId(int reserveId);
}
