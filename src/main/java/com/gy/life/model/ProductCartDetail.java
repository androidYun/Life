package com.gy.life.model;

public class ProductCartDetail {
    private ProductCart productCart;

    private ReserveGood reserveGood;


    public ProductCart getProductCart() {
        return productCart;
    }

    public void setProductCart(ProductCart productCart) {
        this.productCart = productCart;
    }

    public ReserveGood getReserveGood() {
        return reserveGood;
    }

    public void setReserveGood(ReserveGood reserveGood) {
        this.reserveGood = reserveGood;
    }
}
