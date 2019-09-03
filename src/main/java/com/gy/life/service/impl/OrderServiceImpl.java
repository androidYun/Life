package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gy.life.common.PageEntity;
import com.gy.life.mapper.OrderProductItemMapper;
import com.gy.life.mapper.ProductCartMapper;
import com.gy.life.mapper.ReserveOrderMapper;
import com.gy.life.model.OrderProductItem;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.request.OrderRequest;
import com.gy.life.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    ReserveOrderMapper reserveOrderMapper;

    @Autowired
    OrderProductItemMapper orderProductItemMapper;


    @Autowired
    ProductCartMapper productCartMapper;

    @Override
    public int insertOrder(ProductOrder productOrder) {
        return reserveOrderMapper.save(productOrder);
    }

    @Override
    public ProductOrder selectByUserIdAndReserveId(int userId, int reserveId) {
        Query query = new Query();
        query.eq("user_id", userId);
        query.eq("reserve_id", reserveId);
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

    @Transactional
    @Override
    public int insertProductOrderItem(List<OrderRequest> orderRequestList, int orderId) {
        List<OrderProductItem> orderProductItemList = new ArrayList<>();
        for (OrderRequest orderRequest : orderRequestList) {
            OrderProductItem orderProductItem = new OrderProductItem();
            orderProductItem.setBuyCount(orderRequest.getBuyCount());
            orderProductItem.setOrderId(orderId);
            orderProductItem.setProductId(orderRequest.getProductId());
            orderProductItemList.add(orderProductItem);
            //删除购物车
            int deleteById = productCartMapper.deleteById(orderRequest.getCartId());
        }
        int saveMulti = orderProductItemMapper.saveMulti(orderProductItemList);

        return saveMulti;
    }

    @Override
    public int insertProductOrderItem(int buyCount, int productId, int orderId) {
        OrderProductItem orderProductItem = new OrderProductItem();
        orderProductItem.setBuyCount(buyCount);
        orderProductItem.setOrderId(orderId);
        orderProductItem.setProductId(productId);
        int insetCount = orderProductItemMapper.save(orderProductItem);
        return insetCount;
    }
}
