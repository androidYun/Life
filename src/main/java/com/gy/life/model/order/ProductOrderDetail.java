package com.gy.life.model.order;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ProductOrderDetail {

    /**
     * 预定订单Id, 数据库字段：order_id
     */
    private Integer orderId;

    /**
     * 数据库字段：order_time
     */
    private Date orderTime;

    /**
     * 购买人Id, 数据库字段：user_id
     */
    private Integer userId;

    /**
     * 预期金额 , 数据库字段：total_price
     */
    private BigDecimal totalPrice;

    /**
     * 订单类型 0新创建 1 派送中 2 结束, 数据库字段：order_status
     */
    private Integer orderStatus;

    /**
     * 留言, 数据库字段：leave_message
     */
    private String leaveMessage;

    private List<OrderProductItemDetail> orderProductItemDetailList;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getLeaveMessage() {
        return leaveMessage;
    }

    public void setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
    }

    public List<OrderProductItemDetail> getOrderProductItemDetailList() {
        return orderProductItemDetailList;
    }

    public void setOrderProductItemDetailList(List<OrderProductItemDetail> orderProductItemDetailList) {
        this.orderProductItemDetailList = orderProductItemDetailList;
    }
}
