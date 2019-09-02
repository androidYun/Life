package com.gy.life.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：user_inform
 *
 * @author ${param.author}
 */
@Table(name = "user_inform")
public class UserInform {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**  数据库字段：user_id */
    private Integer userId;

    /**  数据库字段：name */
    private String name;

    /**  数据库字段：image_url */
    private String imageUrl;

    /** 楼号比如：46-1-1102, 数据库字段：build_no */
    private String buildNo;

    /** 小区名字 比如 水榭花城, 数据库字段：village_name */
    private String villageName;

    /**  数据库字段：phone_number */
    private String phoneNumber;

    /**  数据库字段：integral */
    private Integer integral;

    /**  数据库字段：open_id */
    private String openId;

    /**  数据库字段：user_inform.user_id */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**  数据库字段：user_inform.user_id */
    public Integer getUserId() {
        return this.userId;
    }

    /**  数据库字段：user_inform.name */
    public void setName(String name) {
        this.name = name;
    }

    /**  数据库字段：user_inform.name */
    public String getName() {
        return this.name;
    }

    /**  数据库字段：user_inform.image_url */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**  数据库字段：user_inform.image_url */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /** 设置楼号比如：46-1-1102, 数据库字段：user_inform.build_no */
    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo;
    }

    /** 获取楼号比如：46-1-1102, 数据库字段：user_inform.build_no */
    public String getBuildNo() {
        return this.buildNo;
    }

    /** 设置小区名字 比如 水榭花城, 数据库字段：user_inform.village_name */
    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    /** 获取小区名字 比如 水榭花城, 数据库字段：user_inform.village_name */
    public String getVillageName() {
        return this.villageName;
    }

    /**  数据库字段：user_inform.phone_number */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**  数据库字段：user_inform.phone_number */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**  数据库字段：user_inform.integral */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**  数据库字段：user_inform.integral */
    public Integer getIntegral() {
        return this.integral;
    }

    /**  数据库字段：user_inform.open_id */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**  数据库字段：user_inform.open_id */
    public String getOpenId() {
        return this.openId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((userId == null) ? 0 : userId.hashCode());

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

        UserInform other = (UserInform) obj;

        if (userId == null) {
            if (other.userId != null) {
                return false;
            }
        } else if (!userId.equals(other.userId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserInform [");
        sb.append("userId=").append(userId);
        sb.append(", ");
        sb.append("name=").append(name);
        sb.append(", ");
        sb.append("imageUrl=").append(imageUrl);
        sb.append(", ");
        sb.append("buildNo=").append(buildNo);
        sb.append(", ");
        sb.append("villageName=").append(villageName);
        sb.append(", ");
        sb.append("phoneNumber=").append(phoneNumber);
        sb.append(", ");
        sb.append("integral=").append(integral);
        sb.append(", ");
        sb.append("openId=").append(openId);
        sb.append("]");

        return sb.toString();
    }
}
