package com.gy.life.model;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：reserve_order
 *
 * @author ${param.author}
 */
@Table(name = "product_order")
public class ProductOrder {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** 预定订单Id, 数据库字段：order_id */
    private Integer orderId;

    /**  数据库字段：order_time */
    private Date orderTime;

    /** 购买人Id, 数据库字段：user_id */
    private Integer userId;

    /** 预期金额 , 数据库字段：total_price */
    private BigDecimal totalPrice;

    /** 订单类型 0新创建 1 派送中 2 结束, 数据库字段：order_status */
    private Integer orderStatus;

    /** 留言, 数据库字段：leave_message */
    private String leaveMessage;

    /** 设置预定订单Id, 数据库字段：product_order.order_id */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /** 获取预定订单Id, 数据库字段：product_order.order_id */
    public Integer getOrderId() {
        return this.orderId;
    }

    /**  数据库字段：product_order.order_time */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**  数据库字段：product_order.order_time */
    public Date getOrderTime() {
        return this.orderTime;
    }

    /** 设置购买人Id, 数据库字段：product_order.user_id */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /** 获取购买人Id, 数据库字段：product_order.user_id */
    public Integer getUserId() {
        return this.userId;
    }

    /** 设置预期金额 , 数据库字段：product_order.total_price */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /** 获取预期金额 , 数据库字段：product_order.total_price */
    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    /** 设置订单类型 0新创建 1 派送中 2 结束, 数据库字段：product_order.order_status */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /** 获取订单类型 0新创建 1 派送中 2 结束, 数据库字段：product_order.order_status */
    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    /** 设置留言, 数据库字段：product_order.leave_message */
    public void setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
    }

    /** 获取留言, 数据库字段：product_order.leave_message */
    public String getLeaveMessage() {
        return this.leaveMessage;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
                ((orderId == null) ? 0 : orderId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        ProductOrder other = (ProductOrder) obj;

        if (orderId == null) {
            if (other.orderId != null) {
                return false;
            }
        } else if (!orderId.equals(other.orderId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductOrder [");
        sb.append("orderId=").append(orderId);
        sb.append(", ");
        sb.append("orderTime=").append(orderTime);
        sb.append(", ");
        sb.append("userId=").append(userId);
        sb.append(", ");
        sb.append("totalPrice=").append(totalPrice);
        sb.append(", ");
        sb.append("orderStatus=").append(orderStatus);
        sb.append(", ");
        sb.append("leaveMessage=").append(leaveMessage);
        sb.append("]");

        return sb.toString();
    }
}
