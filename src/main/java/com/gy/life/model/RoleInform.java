package com.gy.life.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class RoleInform {
    @Id
    @Column(name = "merchant_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**  数据库字段：merchant_id */
    private Integer merchantId;

    /** 1 超级管理员   2管理员   3 员工, 数据库字段：role_type */
    private Integer roleType;

    /**  数据库字段：name */
    private String name;

    /**  数据库字段：password */
    private String password;

    /**  数据库字段：phone_number */
    private String phoneNumber;

    /**  数据库字段：create_time */
    private Date createTime;

    /** 商户编号, 数据库字段：merchant_no */
    private String merchantNo;

    /** 他的父亲Id是谁, 数据库字段：parent_id */
    private Integer parentId;

    /**  数据库字段：token */
    private String token;

    /** 微信openId, 数据库字段：open_id */
    private String openId;

    /**  数据库字段：secret */
    private String secret;

    /**  数据库字段：role_inform.merchant_id */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**  数据库字段：role_inform.merchant_id */
    public Integer getMerchantId() {
        return this.merchantId;
    }

    /** 设置1 超级管理员   2管理员   3 员工, 数据库字段：role_inform.role_type */
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    /** 获取1 超级管理员   2管理员   3 员工, 数据库字段：role_inform.role_type */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**  数据库字段：role_inform.name */
    public void setName(String name) {
        this.name = name;
    }

    /**  数据库字段：role_inform.name */
    public String getName() {
        return this.name;
    }

    /**  数据库字段：role_inform.password */
    public void setPassword(String password) {
        this.password = password;
    }

    /**  数据库字段：role_inform.password */
    public String getPassword() {
        return this.password;
    }

    /**  数据库字段：role_inform.phone_number */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**  数据库字段：role_inform.phone_number */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**  数据库字段：role_inform.create_time */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**  数据库字段：role_inform.create_time */
    public Date getCreateTime() {
        return this.createTime;
    }

    /** 设置商户编号, 数据库字段：role_inform.merchant_no */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    /** 获取商户编号, 数据库字段：role_inform.merchant_no */
    public String getMerchantNo() {
        return this.merchantNo;
    }

    /** 设置他的父亲Id是谁, 数据库字段：role_inform.parent_id */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /** 获取他的父亲Id是谁, 数据库字段：role_inform.parent_id */
    public Integer getParentId() {
        return this.parentId;
    }

    /**  数据库字段：role_inform.token */
    public void setToken(String token) {
        this.token = token;
    }

    /**  数据库字段：role_inform.token */
    public String getToken() {
        return this.token;
    }

    /** 设置微信openId, 数据库字段：role_inform.open_id */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /** 获取微信openId, 数据库字段：role_inform.open_id */
    public String getOpenId() {
        return this.openId;
    }

    /**  数据库字段：role_inform.secret */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**  数据库字段：role_inform.secret */
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

        RoleInform other = (RoleInform) obj;

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
        sb.append("RoleInform [");
        sb.append("merchantId=").append(merchantId);
        sb.append(", ");
        sb.append("roleType=").append(roleType);
        sb.append(", ");
        sb.append("name=").append(name);
        sb.append(", ");
        sb.append("password=").append(password);
        sb.append(", ");
        sb.append("phoneNumber=").append(phoneNumber);
        sb.append(", ");
        sb.append("createTime=").append(createTime);
        sb.append(", ");
        sb.append("merchantNo=").append(merchantNo);
        sb.append(", ");
        sb.append("parentId=").append(parentId);
        sb.append(", ");
        sb.append("token=").append(token);
        sb.append(", ");
        sb.append("openId=").append(openId);
        sb.append(", ");
        sb.append("secret=").append(secret);
        sb.append("]");

        return sb.toString();
    }
}