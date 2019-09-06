package com.gy.life.model.order;

import com.gy.life.model.Address;
import com.gy.life.model.ProductDetail;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.UserInform;

public class ProductOrderUserDetail {
    private ProductDetail productDetail;

    private ProductOrder productOrder;

    private Address address;

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrder productOrder) {
        this.productOrder = productOrder;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
