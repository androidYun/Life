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

    /**  数据库字段：merchant_id */
    private Integer merchantId;

    /**  数据库字段：order_number */
    private String orderNumber;

    /**  数据库字段：order_time */
    private Date orderTime;

    /** 购买人Id, 数据库字段：user_id */
    private Integer userId;

    /** 预期金额 , 数据库字段：total_price */
    private BigDecimal totalPrice;

    /**  数据库字段：total_count */
    private Integer totalCount;

    /** 订单类型 0新创建 1 接收订单 2 已完成 3 已取消, 数据库字段：order_status */
    private Integer orderStatus;

    /** 留言, 数据库字段：leave_message */
    private String leaveMessage;

    /**  数据库字段：address_id */
    private Integer addressId;

    /** 支付状态 10 未支付 20已支付 30 申请退款 40 退款成功  50 拒绝退款 60 完成交易, 数据库字段：pay_status */
    private String payStatus;

    /** 快递公司, 数据库字段：express_delivery_company */
    private String expressDeliveryCompany;

    /** 发货状态 100 待发货 200 已发货 300 已签收, 数据库字段：order_delivery_status */
    private Integer orderDeliveryStatus;

    /** 快递编号, 数据库字段：delivery_number */
    private Integer deliveryNumber;

    /** 设置预定订单Id, 数据库字段：product_order.order_id */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /** 获取预定订单Id, 数据库字段：product_order.order_id */
    public Integer getOrderId() {
        return this.orderId;
    }

    /**  数据库字段：product_order.merchant_id */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**  数据库字段：product_order.merchant_id */
    public Integer getMerchantId() {
        return this.merchantId;
    }

    /**  数据库字段：product_order.order_number */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**  数据库字段：product_order.order_number */
    public String getOrderNumber() {
        return this.orderNumber;
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

    /**  数据库字段：product_order.total_count */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**  数据库字段：product_order.total_count */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /** 设置订单类型 0新创建 1 接收订单 2 已完成 3 已取消, 数据库字段：product_order.order_status */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /** 获取订单类型 0新创建 1 接收订单 2 已完成 3 已取消, 数据库字段：product_order.order_status */
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

    /**  数据库字段：product_order.address_id */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**  数据库字段：product_order.address_id */
    public Integer getAddressId() {
        return this.addressId;
    }

    /** 设置支付状态 10 未支付 20已支付 30 申请退款 40 退款成功  50 拒绝退款 60 完成交易, 数据库字段：product_order.pay_status */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /** 获取支付状态 10 未支付 20已支付 30 申请退款 40 退款成功  50 拒绝退款 60 完成交易, 数据库字段：product_order.pay_status */
    public String getPayStatus() {
        return this.payStatus;
    }

    /** 设置快递公司, 数据库字段：product_order.express_delivery_company */
    public void setExpressDeliveryCompany(String expressDeliveryCompany) {
        this.expressDeliveryCompany = expressDeliveryCompany;
    }

    /** 获取快递公司, 数据库字段：product_order.express_delivery_company */
    public String getExpressDeliveryCompany() {
        return this.expressDeliveryCompany;
    }

    /** 设置发货状态 100 待发货 200 已发货 300 已签收, 数据库字段：product_order.order_delivery_status */
    public void setOrderDeliveryStatus(Integer orderDeliveryStatus) {
        this.orderDeliveryStatus = orderDeliveryStatus;
    }

    /** 获取发货状态 100 待发货 200 已发货 300 已签收, 数据库字段：product_order.order_delivery_status */
    public Integer getOrderDeliveryStatus() {
        return this.orderDeliveryStatus;
    }

    /** 设置快递编号, 数据库字段：product_order.delivery_number */
    public void setDeliveryNumber(Integer deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    /** 获取快递编号, 数据库字段：product_order.delivery_number */
    public Integer getDeliveryNumber() {
        return this.deliveryNumber;
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
        sb.append("merchantId=").append(merchantId);
        sb.append(", ");
        sb.append("orderNumber=").append(orderNumber);
        sb.append(", ");
        sb.append("orderTime=").append(orderTime);
        sb.append(", ");
        sb.append("userId=").append(userId);
        sb.append(", ");
        sb.append("totalPrice=").append(totalPrice);
        sb.append(", ");
        sb.append("totalCount=").append(totalCount);
        sb.append(", ");
        sb.append("orderStatus=").append(orderStatus);
        sb.append(", ");
        sb.append("leaveMessage=").append(leaveMessage);
        sb.append(", ");
        sb.append("addressId=").append(addressId);
        sb.append(", ");
        sb.append("payStatus=").append(payStatus);
        sb.append(", ");
        sb.append("expressDeliveryCompany=").append(expressDeliveryCompany);
        sb.append(", ");
        sb.append("orderDeliveryStatus=").append(orderDeliveryStatus);
        sb.append(", ");
        sb.append("deliveryNumber=").append(deliveryNumber);
        sb.append("]");

        return sb.toString();
    }
}
