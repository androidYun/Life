package com.gy.life.service;

import com.gy.life.common.PageEntity;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.ReserveOrderDetail;
import com.gy.life.model.order.ProductOrderDetail;
import com.gy.life.model.request.OrderRequest;

import java.util.List;

public interface OrderService {
    int insertOrder(ProductOrder productOrder);

    ProductOrder selectByUserIdAndReserveId(int userId, int reserveId);

    List<ProductOrderDetail> selectOrderProductList(int userId, int orderStatus);

    PageEntity<ReserveOrderDetail> selectByReserveId(int reserveId);

    int insertProductOrderItem(List<OrderRequest> orderRequest, int orderId);

    int insertProductOrderItem(int buyCount, int productId, int orderId);
}
