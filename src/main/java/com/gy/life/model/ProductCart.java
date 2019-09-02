package com.gy.life.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：product_cart
 *
 * @author ${param.author}
 */
@Table(name = "product_cart")
public class ProductCart {
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**  数据库字段：cart_id */
    private Integer cartId;

    /**  数据库字段：product_id */
    private Integer productId;

    /**  数据库字段：cart_time */
    private Date cartTime;

    /** 添加购物车的数量, 数据库字段：cart_count */
    private Integer cartCount;

    /**  数据库字段：user_id */
    private Integer userId;

    /**  数据库字段：product_cart.cart_id */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    /**  数据库字段：product_cart.cart_id */
    public Integer getCartId() {
        return this.cartId;
    }

    /**  数据库字段：product_cart.product_id */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**  数据库字段：product_cart.product_id */
    public Integer getProductId() {
        return this.productId;
    }

    /**  数据库字段：product_cart.cart_time */
    public void setCartTime(Date cartTime) {
        this.cartTime = cartTime;
    }

    /**  数据库字段：product_cart.cart_time */
    public Date getCartTime() {
        return this.cartTime;
    }

    /** 设置添加购物车的数量, 数据库字段：product_cart.cart_count */
    public void setCartCount(Integer cartCount) {
        this.cartCount = cartCount;
    }

    /** 获取添加购物车的数量, 数据库字段：product_cart.cart_count */
    public Integer getCartCount() {
        return this.cartCount;
    }

    /**  数据库字段：product_cart.user_id */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**  数据库字段：product_cart.user_id */
    public Integer getUserId() {
        return this.userId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((cartId == null) ? 0 : cartId.hashCode());

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

        ProductCart other = (ProductCart) obj;

        if (cartId == null) {
            if (other.cartId != null) {
                return false;
            }
        } else if (!cartId.equals(other.cartId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductCart [");
        sb.append("cartId=").append(cartId);
        sb.append(", ");
        sb.append("productId=").append(productId);
        sb.append(", ");
        sb.append("cartTime=").append(cartTime);
        sb.append(", ");
        sb.append("cartCount=").append(cartCount);
        sb.append(", ");
        sb.append("userId=").append(userId);
        sb.append("]");

        return sb.toString();
    }
}
