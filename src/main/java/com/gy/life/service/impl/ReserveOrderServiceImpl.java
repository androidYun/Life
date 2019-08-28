package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gy.life.common.PageEntity;
import com.gy.life.mapper.ReserveOrderMapper;
import com.gy.life.model.ReserveOrder;
import com.gy.life.model.ReserveOrderDetail;
import com.gy.life.service.ReserveOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReserveOrderServiceImpl implements ReserveOrderService {

    @Autowired
    ReserveOrderMapper reserveOrderMapper;

    @Override
    public int insertIntoReserveOrder(ReserveOrder reserveOrder) {
        return reserveOrderMapper.save(reserveOrder);
    }

    @Override
    public ReserveOrder selectByUserIdAndReserveId(int userId, int reserveId) {
        Query query = new Query();
        query.addParam("userId", userId);
        query.addParam("reserveId", reserveId);
        return reserveOrderMapper.getByQuery(query);
    }

    @Override
    public PageEntity selectByReserveId(int reserveId) {
        Page<Object> startPage = PageHelper.startPage(1, 10);
        PageEntity pageEntity = new PageEntity();
        pageEntity.setTotalCount(startPage.getTotal());
        pageEntity.setPageNumber(startPage.getPageNum());
        pageEntity.setPageIndex(startPage.getPages());
        pageEntity.setTotalPageSize(startPage.getPageSize());
        pageEntity.setList(startPage.getResult());
        reserveOrderMapper.selectDetailList(reserveId);
        return pageEntity;
    }
}
