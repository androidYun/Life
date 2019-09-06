package com.gy.life.enumeration;

/**
 * 0新创建 1 派送中 2 结束
 */
public enum OrderStateEnum {
    Create(0),
    confirm_order(1),
    finish(2),
    cancel(3);

    int state;

    OrderStateEnum(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
