package com.gy.life.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


/**
 * 表名：order_product_item
 *
 * @author ${param.author}
 */
@Table(name = "order_product_item")
public class OrderProductItem {
    @Id
    @Column(name = "product_order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**  数据库字段：product_order_id */
    private Integer productOrderId;

    /**  数据库字段：order_id */
    private Integer orderId;

    /**  数据库字段：product_id */
    private Integer productId;

    /** 购买数量, 数据库字段：buy_count */
    private Integer buyCount;

    /** 购买数量, 数据库字段：single_total_price */
    private BigDecimal singleTotalPrice;

    /**  数据库字段：order_product_item.product_order_id */
    public void setProductOrderId(Integer productOrderId) {
        this.productOrderId = productOrderId;
    }

    /**  数据库字段：order_product_item.product_order_id */
    public Integer getProductOrderId() {
        return this.productOrderId;
    }

    /**  数据库字段：order_product_item.order_id */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**  数据库字段：order_product_item.order_id */
    public Integer getOrderId() {
        return this.orderId;
    }

    /**  数据库字段：order_product_item.product_id */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**  数据库字段：order_product_item.product_id */
    public Integer getProductId() {
        return this.productId;
    }

    /** 设置购买数量, 数据库字段：order_product_item.buy_count */
    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    /** 获取购买数量, 数据库字段：order_product_item.buy_count */
    public Integer getBuyCount() {
        return this.buyCount;
    }

    public BigDecimal getSingleTotalPrice() {
        return singleTotalPrice;
    }

    public void setSingleTotalPrice(BigDecimal singleTotalPrice) {
        this.singleTotalPrice = singleTotalPrice;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
                ((productOrderId == null) ? 0 : productOrderId.hashCode());

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

        OrderProductItem other = (OrderProductItem) obj;

        if (productOrderId == null) {
            if (other.productOrderId != null) {
                return false;
            }
        } else if (!productOrderId.equals(other.productOrderId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderProductItem [");
        sb.append("productOrderId=").append(productOrderId);
        sb.append(", ");
        sb.append("orderId=").append(orderId);
        sb.append(", ");
        sb.append("productId=").append(productId);
        sb.append(", ");
        sb.append("buyCount=").append(buyCount);
        sb.append("]");

        return sb.toString();
    }
}
