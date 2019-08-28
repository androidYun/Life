package com.gy.life.service;

import com.gy.life.common.PageEntity;
import com.gy.life.model.ReserveOrder;
import com.gy.life.model.ReserveOrderDetail;

import java.util.List;

public interface ReserveOrderService {
    int insertIntoReserveOrder(ReserveOrder reserveOrder);

    ReserveOrder selectByUserIdAndReserveId(int userId, int reserveId);

    PageEntity<ReserveOrderDetail> selectByReserveId(int reserveId);
}
