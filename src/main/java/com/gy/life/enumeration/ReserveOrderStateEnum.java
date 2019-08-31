package com.gy.life.enumeration;

/**
 * 0新创建 1 派送中 2 结束
 */
public enum ReserveOrderStateEnum {
    Create(0),
    Delivery(1),
    End(2);

    int state;

    ReserveOrderStateEnum(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
