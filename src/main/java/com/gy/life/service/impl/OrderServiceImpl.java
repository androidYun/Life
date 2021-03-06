package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gy.life.common.PageEntity;
import com.gy.life.mapper.OrderProductItemMapper;
import com.gy.life.mapper.ProductCartMapper;
import com.gy.life.mapper.ProductDetailMapper;
import com.gy.life.mapper.ProductOrderMapper;
import com.gy.life.model.OrderProductItem;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.order.ProductOrderDetail;
import com.gy.life.model.order.ProductOrderUserDetail;
import com.gy.life.model.request.GoodCreateOrderParams;
import com.gy.life.model.request.OrderRequest;
import com.gy.life.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    ProductOrderMapper productOrderMapper;

    @Autowired
    OrderProductItemMapper orderProductItemMapper;

    @Autowired
    ProductCartMapper productCartMapper;

    @Autowired
    ProductDetailMapper productDetailMapper;

    @Override
    public int insertOrder(ProductOrder productOrder) {
        return productOrderMapper.save(productOrder);
    }

    @Override
    public ProductOrder selectByUserIdAndReserveId(int userId, int reserveId) {
        Query query = new Query();
        query.eq("user_id", userId);
        query.eq("product_id_id", reserveId);
        return productOrderMapper.getByQuery(query);
    }

    @Override
    public PageEntity selectByReserveId(int reserveId) {
        Page<Object> startPage = PageHelper.startPage(1, 10);
        PageEntity pageEntity = new PageEntity();
        pageEntity.setTotalCount(startPage.getTotal());
        pageEntity.setPageNumber(startPage.getPageNum());
        pageEntity.setPageSize(startPage.getPages());
        pageEntity.setTotalPageSize(startPage.getPageSize());
        pageEntity.setList(startPage.getResult());
        productOrderMapper.selectDetailList(reserveId);
        return pageEntity;
    }

    @Transactional
    @Override
    public int insertProductOrderItem(List<OrderRequest> orderRequestList, int orderId) {
        List<OrderProductItem> orderProductItemList = new ArrayList<>();
        for (OrderRequest orderRequest : orderRequestList) {
            OrderProductItem orderProductItem = new OrderProductItem();
            orderProductItem.setBuyCount(orderRequest.getBuyCount());

            orderProductItem.setSingleTotalPrice(new BigDecimal(orderRequest.getBuyCount()).multiply(orderRequest.getProductPrice()));
            orderProductItem.setOrderId(orderId);
            orderProductItem.setProductId(orderRequest.getProductId());
            orderProductItemList.add(orderProductItem);
            //删除购物车
            productCartMapper.deleteById(orderRequest.getCartId());
            productDetailMapper.updateSellCount(orderRequest.getBuyCount(), orderRequest.getProductId());
        }
        int saveMulti = orderProductItemMapper.saveMulti(orderProductItemList);

        return saveMulti;
    }

    @Override
    public int insertProductOrderItemByList(List<GoodCreateOrderParams.BuyProductInform> productIdList, int orderId) {
        List<OrderProductItem> orderProductItemList = new ArrayList<>();
        for (int i = 0; i < productIdList.size(); i++) {
            OrderProductItem orderProductItem = new OrderProductItem();
            orderProductItem.setBuyCount(productIdList.get(i).getBuyCount());
            orderProductItem.setOrderId(orderId);
            orderProductItem.setSingleTotalPrice(new BigDecimal(productIdList.get(i).getBuyCount()).multiply(productIdList.get(i).getProductPrice()));
            orderProductItem.setProductId(productIdList.get(i).getProductId());
            orderProductItemList.add(orderProductItem);
            productDetailMapper.updateSellCount(productIdList.get(i).getBuyCount(), productIdList.get(i).getProductId());
        }
        int insetCount = orderProductItemMapper.saveMulti(orderProductItemList);
        return insetCount;
    }

    @Override
    public List<ProductOrderDetail> selectOrderProductList(int userId, int orderStatus) {
        return productOrderMapper.selectOrderProductList(orderStatus, userId);
    }

    @Override
    public ProductOrder selectById(int orderId) {
        return productOrderMapper.getById(orderId);
    }

    @Override
    public int updateOrder(ProductOrder productOrder) {
        return productOrderMapper.update(productOrder);
    }

    @Override
    public List<ProductOrderUserDetail> selectAllOrderList(int orderStatus, Date startTime, Date endTime) {
        return productOrderMapper.selectAllOrderListDetail(orderStatus, startTime, endTime);
    }


}
