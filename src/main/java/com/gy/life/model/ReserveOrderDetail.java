package com.gy.life.model;

public class ReserveOrderDetail {
    private ReserveGood reserveGood;

    private ProductOrder productOrder;

    public ReserveGood getReserveGood() {
        return reserveGood;
    }

    public void setReserveGood(ReserveGood reserveGood) {
        this.reserveGood = reserveGood;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrder productOrder) {
        this.productOrder = productOrder;
    }
}
