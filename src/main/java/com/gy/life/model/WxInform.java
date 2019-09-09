package com.gy.life.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：wx_inform
 *
 * @author ${param.author}
 */
@Table(name = "wx_inform")
public class WxInform {
    @Id
    @Column(name = "merchant_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** 商户Id, 数据库字段：merchant_id */
    private Integer merchantId;

    /** 商户编号, 数据库字段：merchant_no */
    private String merchantNo;

    /**  数据库字段：open_id */
    private String openId;

    /**  数据库字段：secret */
    private String secret;

    /** 设置商户Id, 数据库字段：wx_inform.merchant_id */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /** 获取商户Id, 数据库字段：wx_inform.merchant_id */
    public Integer getMerchantId() {
        return this.merchantId;
    }

    /** 设置商户编号, 数据库字段：wx_inform.merchant_no */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    /** 获取商户编号, 数据库字段：wx_inform.merchant_no */
    public String getMerchantNo() {
        return this.merchantNo;
    }

    /**  数据库字段：wx_inform.open_id */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**  数据库字段：wx_inform.open_id */
    public String getOpenId() {
        return this.openId;
    }

    /**  数据库字段：wx_inform.secret */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**  数据库字段：wx_inform.secret */
    public String getSecret() {
        return this.secret;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
            ((merchantId == null) ? 0 : merchantId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        WxInform other = (WxInform) obj;

        if (merchantId == null) {
            if (other.merchantId != null) {
                return false;
            }
        } else if (!merchantId.equals(other.merchantId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WxInform [");
        sb.append("merchantId=").append(merchantId);
        sb.append(", ");
        sb.append("merchantNo=").append(merchantNo);
        sb.append(", ");
        sb.append("openId=").append(openId);
        sb.append(", ");
        sb.append("secret=").append(secret);
        sb.append("]");

        return sb.toString();
    }
}
