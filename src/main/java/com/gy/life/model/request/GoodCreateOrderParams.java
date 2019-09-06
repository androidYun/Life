package com.gy.life.model.request;

import java.math.BigDecimal;
import java.util.List;

public class GoodCreateOrderParams {
    private int userId;
    private List<BuyProductInform> productIdList;
    private String leaveMessage;

    BigDecimal totalPrice;

    public static class BuyProductInform {

        public BuyProductInform() {
        }


        private int productId;

        private int buyCount;

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public int getBuyCount() {
            return buyCount;
        }

        public void setBuyCount(int buyCount) {
            this.buyCount = buyCount;
        }
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<BuyProductInform> getProductIdList() {
        return productIdList;
    }

    public void setProductIdList(List<BuyProductInform> productIdList) {
        this.productIdList = productIdList;
    }

    public String getLeaveMessage() {
        return leaveMessage;
    }

    public void setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
