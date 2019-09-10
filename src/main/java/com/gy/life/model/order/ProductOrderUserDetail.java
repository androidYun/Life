package com.gy.life.model.order;

import com.gy.life.model.Address;
import com.gy.life.model.ProductOrder;

import java.util.List;

public class ProductOrderUserDetail {
    private List<OrderProductItemDetail> orderProductItemDetailList;

    private ProductOrder productOrder;

    private Address address;

    public List<OrderProductItemDetail> getOrderProductItemDetailList() {
        return orderProductItemDetailList;
    }

    public void setOrderProductItemDetailList(List<OrderProductItemDetail> orderProductItemDetailList) {
        this.orderProductItemDetailList = orderProductItemDetailList;
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
