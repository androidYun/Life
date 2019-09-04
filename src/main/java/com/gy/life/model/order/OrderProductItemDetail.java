package com.gy.life.model.order;

import com.gy.life.model.ProductDetail;

public class OrderProductItemDetail {
    /**
     * 数据库字段：product_order_id
     */
    private Integer productOrderId;

    /**
     * 数据库字段：order_id
     */
    private Integer orderId;

    /**
     * 数据库字段：product_id
     */
    private Integer productId;

    /**
     * 购买数量, 数据库字段：buy_count
     */
    private Integer buyCount;

    private ProductDetail productDetail;

    /**
     * 数据库字段：order_product_item.product_order_id
     */
    public void setProductOrderId(Integer productOrderId) {
        this.productOrderId = productOrderId;
    }

    /**
     * 数据库字段：order_product_item.product_order_id
     */
    public Integer getProductOrderId() {
        return this.productOrderId;
    }

    /**
     * 数据库字段：order_product_item.order_id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 数据库字段：order_product_item.order_id
     */
    public Integer getOrderId() {
        return this.orderId;
    }

    /**
     * 数据库字段：order_product_item.product_id
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 数据库字段：order_product_item.product_id
     */
    public Integer getProductId() {
        return this.productId;
    }

    /**
     * 设置购买数量, 数据库字段：order_product_item.buy_count
     */
    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    /**
     * 获取购买数量, 数据库字段：order_product_item.buy_count
     */
    public Integer getBuyCount() {
        return this.buyCount;
    }

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }
}
