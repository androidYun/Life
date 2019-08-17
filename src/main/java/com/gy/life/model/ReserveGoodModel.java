package com.gy.life.model;

import java.util.Date;

public class ReserveGoodModel {
    private Integer reserveId;

    private String imageUrl;

    private String goodName;

    private String goodDesc;

    private Date createTime;

    private Integer maxCount;

    private String unit;

    private Date reserveFinishTime;

    private Date deliveryTime;

    private String pickAddress;

    private Integer deliveryType;

    private String attention;

    private Long deliveryMoney;

    public Integer getReserveId() {
        return reserveId;
    }

    public void setReserveId(Integer reserveId) {
        this.reserveId = reserveId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodDesc() {
        return goodDesc;
    }

    public void setGoodDesc(String goodDesc) {
        this.goodDesc = goodDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getReserveFinishTime() {
        return reserveFinishTime;
    }

    public void setReserveFinishTime(Date reserveFinishTime) {
        this.reserveFinishTime = reserveFinishTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getPickAddress() {
        return pickAddress;
    }

    public void setPickAddress(String pickAddress) {
        this.pickAddress = pickAddress;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public Long getDeliveryMoney() {
        return deliveryMoney;
    }

    public void setDeliveryMoney(Long deliveryMoney) {
        this.deliveryMoney = deliveryMoney;
    }
}