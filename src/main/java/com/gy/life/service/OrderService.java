package com.gy.life.service;

import com.gy.life.common.PageEntity;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.ReserveOrderDetail;
import com.gy.life.model.request.OrderRequest;

import java.util.List;

public interface OrderService {
    int insertOrder(ProductOrder productOrder);

    ProductOrder selectByUserIdAndReserveId(int userId, int reserveId);

    PageEntity<ReserveOrderDetail> selectByReserveId(int reserveId);

    int insertProductOrderItem(List<OrderRequest> orderRequest, int orderId);
}
