package com.gy.life.model;

public class ReserveOrderDetail {
    private ReserveGood reserveGood;

    private ReserveOrder reserveOrder;

    public ReserveGood getReserveGood() {
        return reserveGood;
    }

    public void setReserveGood(ReserveGood reserveGood) {
        this.reserveGood = reserveGood;
    }

    public ReserveOrder getReserveOrder() {
        return reserveOrder;
    }

    public void setReserveOrder(ReserveOrder reserveOrder) {
        this.reserveOrder = reserveOrder;
    }
}
