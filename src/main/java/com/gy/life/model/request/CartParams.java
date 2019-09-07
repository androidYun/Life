package com.gy.life.model.request;

import java.math.BigDecimal;
import java.util.List;

public class CartParams {
    private List<OrderRequest> cartList;

    int userId;

    BigDecimal totalPrice;

    String leaveMessage;

    private int addressId;


    public List<OrderRequest> getCartList() {
        return cartList;
    }

    public void setCartList(List<OrderRequest> cartList) {
        this.cartList = cartList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getLeaveMessage() {
        return leaveMessage;
    }

    public void setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
