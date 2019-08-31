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
@Table(name = "reserve_order")
public class ReserveOrder {
    @Id
    @Column(name = "reserve_order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** 预定订单Id, 数据库字段：reserve_order_id */
    private Integer reserveOrderId;

    /**  数据库字段：reserve_id */
    private Integer reserveId;

    /** 购买数量, 数据库字段：buy_count */
    private Integer buyCount;

    /**  数据库字段：buy_time */
    private Date buyTime;

    /** 购买人Id, 数据库字段：user_id */
    private Integer userId;

    /** 预期金额, 数据库字段：expect_amount */
    private BigDecimal expectAmount;

    /** 订单类型 0新创建 1 派送中 2 结束, 数据库字段：order_state */
    private Integer orderState;

    /** 设置预定订单Id, 数据库字段：reserve_order.reserve_order_id */
    public void setReserveOrderId(Integer reserveOrderId) {
        this.reserveOrderId = reserveOrderId;
    }

    /** 获取预定订单Id, 数据库字段：reserve_order.reserve_order_id */
    public Integer getReserveOrderId() {
        return this.reserveOrderId;
    }

    /**  数据库字段：reserve_order.reserve_id */
    public void setReserveId(Integer reserveId) {
        this.reserveId = reserveId;
    }

    /**  数据库字段：reserve_order.reserve_id */
    public Integer getReserveId() {
        return this.reserveId;
    }

    /** 设置购买数量, 数据库字段：reserve_order.buy_count */
    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    /** 获取购买数量, 数据库字段：reserve_order.buy_count */
    public Integer getBuyCount() {
        return this.buyCount;
    }

    /**  数据库字段：reserve_order.buy_time */
    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    /**  数据库字段：reserve_order.buy_time */
    public Date getBuyTime() {
        return this.buyTime;
    }

    /** 设置购买人Id, 数据库字段：reserve_order.user_id */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /** 获取购买人Id, 数据库字段：reserve_order.user_id */
    public Integer getUserId() {
        return this.userId;
    }

    /** 设置预期金额, 数据库字段：reserve_order.expect_amount */
    public void setExpectAmount(BigDecimal expectAmount) {
        this.expectAmount = expectAmount;
    }

    /** 获取预期金额, 数据库字段：reserve_order.expect_amount */
    public BigDecimal getExpectAmount() {
        return this.expectAmount;
    }

    /** 设置订单类型 0新创建 1 派送中 2 结束, 数据库字段：reserve_order.order_state */
    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    /** 获取订单类型 0新创建 1 派送中 2 结束, 数据库字段：reserve_order.order_state */
    public Integer getOrderState() {
        return this.orderState;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
            ((reserveOrderId == null) ? 0 : reserveOrderId.hashCode());

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

        ReserveOrder other = (ReserveOrder) obj;

        if (reserveOrderId == null) {
            if (other.reserveOrderId != null) {
                return false;
            }
        } else if (!reserveOrderId.equals(other.reserveOrderId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReserveOrder [");
        sb.append("reserveOrderId=").append(reserveOrderId);
        sb.append(", ");
        sb.append("reserveId=").append(reserveId);
        sb.append(", ");
        sb.append("buyCount=").append(buyCount);
        sb.append(", ");
        sb.append("buyTime=").append(buyTime);
        sb.append(", ");
        sb.append("userId=").append(userId);
        sb.append(", ");
        sb.append("expectAmount=").append(expectAmount);
        sb.append(", ");
        sb.append("orderState=").append(orderState);
        sb.append("]");

        return sb.toString();
    }
}
