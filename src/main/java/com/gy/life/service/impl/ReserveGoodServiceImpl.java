package com.gy.life.service.impl;

import com.gy.life.mapper.ReserveGoodModelMapper;
import com.gy.life.model.ReserveGoodModel;
import com.gy.life.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ReserveGoodServiceImpl implements ReserveService {

    @Autowired
    ReserveGoodModelMapper reserveGoodModelMapper;

    @Override
    public int insertServeGood(ReserveGoodModel reserveGoodModel) {
        return reserveGoodModelMapper.insert(reserveGoodModel);
    }

    @Override
    public List<ReserveGoodModel> selectList() {
        return reserveGoodModelMapper.selectAll();
    }

    @Override
    public int deleteReserve(int reserveId) {
        return reserveGoodModelMapper.deleteByPrimaryKey(reserveId);
    }

    @Override
    public int updateReserve(ReserveGoodModel reserveGoodModel) {
        return reserveGoodModelMapper.updateByPrimaryKey(reserveGoodModel);
    }

    @Override
    public ReserveGoodModel selectByReserveId(int reserveId) {
        return reserveGoodModelMapper.selectByPrimaryKey(reserveId);
    }
}
