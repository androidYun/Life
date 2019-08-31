package com.gy.life.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：address
 *
 * @author ${param.author}
 */
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "addres_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**  数据库字段：addres_id */
    private Integer addresId;

    /**  数据库字段：province_id */
    private Integer provinceId;

    /**  数据库字段：province */
    private String province;

    /**  数据库字段：city_id */
    private Integer cityId;

    /**  数据库字段：city */
    private String city;

    /**  数据库字段：area_id */
    private Integer areaId;

    /**  数据库字段：area */
    private String area;

    /**  数据库字段：community_id */
    private Integer communityId;

    /** 社区名称, 数据库字段：community */
    private String community;

    /** 楼栋编号, 数据库字段：build_id */
    private Integer buildId;

    /**  数据库字段：user_id */
    private Integer userId;

    /** true 代表1  false代表0 , 数据库字段：is_default */
    private Byte isDefault;

    /**  数据库字段：phone_number */
    private String phoneNumber;

    /** 如果选择的地址不存在可以 自定义地址, 数据库字段：define_address */
    private String defineAddress;

    /**  数据库字段：address.addres_id */
    public void setAddresId(Integer addresId) {
        this.addresId = addresId;
    }

    /**  数据库字段：address.addres_id */
    public Integer getAddresId() {
        return this.addresId;
    }

    /**  数据库字段：address.province_id */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**  数据库字段：address.province_id */
    public Integer getProvinceId() {
        return this.provinceId;
    }

    /**  数据库字段：address.province */
    public void setProvince(String province) {
        this.province = province;
    }

    /**  数据库字段：address.province */
    public String getProvince() {
        return this.province;
    }

    /**  数据库字段：address.city_id */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**  数据库字段：address.city_id */
    public Integer getCityId() {
        return this.cityId;
    }

    /**  数据库字段：address.city */
    public void setCity(String city) {
        this.city = city;
    }

    /**  数据库字段：address.city */
    public String getCity() {
        return this.city;
    }

    /**  数据库字段：address.area_id */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**  数据库字段：address.area_id */
    public Integer getAreaId() {
        return this.areaId;
    }

    /**  数据库字段：address.area */
    public void setArea(String area) {
        this.area = area;
    }

    /**  数据库字段：address.area */
    public String getArea() {
        return this.area;
    }

    /**  数据库字段：address.community_id */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    /**  数据库字段：address.community_id */
    public Integer getCommunityId() {
        return this.communityId;
    }

    /** 设置社区名称, 数据库字段：address.community */
    public void setCommunity(String community) {
        this.community = community;
    }

    /** 获取社区名称, 数据库字段：address.community */
    public String getCommunity() {
        return this.community;
    }

    /** 设置楼栋编号, 数据库字段：address.build_id */
    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    /** 获取楼栋编号, 数据库字段：address.build_id */
    public Integer getBuildId() {
        return this.buildId;
    }

    /**  数据库字段：address.user_id */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**  数据库字段：address.user_id */
    public Integer getUserId() {
        return this.userId;
    }

    /** 设置true 代表1  false代表0 , 数据库字段：address.is_default */
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

    /** 获取true 代表1  false代表0 , 数据库字段：address.is_default */
    public Byte getIsDefault() {
        return this.isDefault;
    }

    /**  数据库字段：address.phone_number */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**  数据库字段：address.phone_number */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /** 设置如果选择的地址不存在可以 自定义地址, 数据库字段：address.define_address */
    public void setDefineAddress(String defineAddress) {
        this.defineAddress = defineAddress;
    }

    /** 获取如果选择的地址不存在可以 自定义地址, 数据库字段：address.define_address */
    public String getDefineAddress() {
        return this.defineAddress;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
                ((addresId == null) ? 0 : addresId.hashCode());

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

        Address other = (Address) obj;

        if (addresId == null) {
            if (other.addresId != null) {
                return false;
            }
        } else if (!addresId.equals(other.addresId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address [");
        sb.append("addresId=").append(addresId);
        sb.append(", ");
        sb.append("provinceId=").append(provinceId);
        sb.append(", ");
        sb.append("province=").append(province);
        sb.append(", ");
        sb.append("cityId=").append(cityId);
        sb.append(", ");
        sb.append("city=").append(city);
        sb.append(", ");
        sb.append("areaId=").append(areaId);
        sb.append(", ");
        sb.append("area=").append(area);
        sb.append(", ");
        sb.append("communityId=").append(communityId);
        sb.append(", ");
        sb.append("community=").append(community);
        sb.append(", ");
        sb.append("buildId=").append(buildId);
        sb.append(", ");
        sb.append("userId=").append(userId);
        sb.append(", ");
        sb.append("isDefault=").append(isDefault);
        sb.append(", ");
        sb.append("phoneNumber=").append(phoneNumber);
        sb.append(", ");
        sb.append("defineAddress=").append(defineAddress);
        sb.append("]");

        return sb.toString();
    }
}
