package com.gy.life.model.order;

import com.gy.life.model.Address;
import com.gy.life.model.ProductDetail;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.UserInform;

import java.util.List;

public class ProductOrderUserDetail {
    private List<ProductDetail> productDetailList;

    private ProductOrder productOrder;

    private Address address;

    public List<ProductDetail> getProductDetailList() {
        return productDetailList;
    }

    public void setProductDetailList(List<ProductDetail> productDetailList) {
        this.productDetailList = productDetailList;
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
