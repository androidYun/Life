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
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**  数据库字段：address_id */
    private Integer addressId;

    /**
     * 数据库字段：province_id
     */
    private Integer provinceId;

    /**
     * 数据库字段：province
     */
    private String province;

    /**
     * 数据库字段：city_id
     */
    private Integer cityId;

    /**
     * 数据库字段：city
     */
    private String city;

    /**
     * 数据库字段：area_id
     */
    private Integer areaId;

    /**
     * 数据库字段：area
     */
    private String area;

    /**
     * 数据库字段：community_id
     */
    private Integer communityId;

    /**
     * 社区名称, 数据库字段：community_name
     */
    private String communityName;


    /**
     * 楼栋编号, 数据库字段：build_id
     */
    private Integer buildId;

    /**
     * 数据库字段：user_id
     */
    private Integer userId;


    private String userName;

    /**
     * true 代表1  false代表0 , 数据库字段：is_default
     */
    private Boolean isDefault;


    /**
     * 数据库字段：phone_number
     */
    private String phoneNumber;

    /**
     * 如果选择的地址不存在可以 自定义地址, 数据库字段：define_address
     */
    private String defineAddress;

    /**
     * 数据库字段：address.addres_id
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 数据库字段：address.addres_id
     */
    public Integer getAddressId() {
        return this.addressId;
    }

    /**
     * 数据库字段：address.province_id
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 数据库字段：address.province_id
     */
    public Integer getProvinceId() {
        return this.provinceId;
    }

    /**
     * 数据库字段：address.province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 数据库字段：address.province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * 数据库字段：address.city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 数据库字段：address.city_id
     */
    public Integer getCityId() {
        return this.cityId;
    }

    /**
     * 数据库字段：address.city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 数据库字段：address.city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 数据库字段：address.area_id
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * 数据库字段：address.area_id
     */
    public Integer getAreaId() {
        return this.areaId;
    }

    /**
     * 数据库字段：address.area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 数据库字段：address.area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * 数据库字段：address.community_id
     */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    /**
     * 数据库字段：address.community_id
     */
    public Integer getCommunityId() {
        return this.communityId;
    }

    /**
     * 设置社区名称, 数据库字段：address.communityName
     */
    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    /**
     * 获取社区名称, 数据库字段：address.communityName
     */
    public String getCommunityName() {
        return this.communityName;
    }

    /**
     * 设置true 代表1  false代表0 , 数据库字段：address.is_default
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 数据库字段：address.user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 数据库字段：address.user_id
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * 数据库字段：address.user_id
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 数据库字段：address.user_id
     */
    public String getUserName() {
        return this.userName;
    }


    /**
     * 数据库字段：address.phone_number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 数据库字段：address.phone_number
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * 设置如果选择的地址不存在可以 自定义地址, 数据库字段：address.define_address
     */
    public void setDefineAddress(String defineAddress) {
        this.defineAddress = defineAddress;
    }

    /**
     * 获取如果选择的地址不存在可以 自定义地址, 数据库字段：address.define_address
     */
    public String getDefineAddress() {
        return this.defineAddress;
    }

    public Integer getBuildId() {
        return buildId;
    }

    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
                ((addressId == null) ? 0 : addressId.hashCode());

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

        if (addressId == null) {
            if (other.addressId != null) {
                return false;
            }
        } else if (!addressId.equals(other.addressId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address [");
        sb.append("addressId=").append(addressId);
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
        sb.append("communityName=").append(communityName);
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
