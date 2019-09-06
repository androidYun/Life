package com.gy.life.service;

import com.gy.life.common.PageEntity;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.ReserveOrderDetail;
import com.gy.life.model.order.ProductOrderDetail;
import com.gy.life.model.order.ProductOrderUserDetail;
import com.gy.life.model.request.GoodCreateOrderParams;
import com.gy.life.model.request.OrderRequest;

import java.util.Date;
import java.util.List;

public interface OrderService {
    int insertOrder(ProductOrder productOrder);

    ProductOrder selectByUserIdAndReserveId(int userId, int productId);


    int updateOrder(ProductOrder productOrder);


    ProductOrder selectById(int orderId);


    List<ProductOrderDetail> selectOrderProductList(int userId, int orderStatus);

    List<ProductOrderUserDetail> selectAllOrderList(int orderStatus, Date startTime, Date endTime);

    PageEntity<ReserveOrderDetail> selectByReserveId(int reserveId);

    int insertProductOrderItem(List<OrderRequest> orderRequest, int orderId);

    int insertProductOrderItemByList(List<GoodCreateOrderParams.BuyProductInform> productInformList, int orderId);
}
