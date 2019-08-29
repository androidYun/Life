package com.gy.life.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：home_service
 *
 * @author ${param.author}
 */
@Table(name = "home_service")
public class HomeServiceModel {
    @Id
    @Column(name = "home_service_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**  数据库字段：home_service_id */
    private Integer homeServiceId;

    /** 服务内容, 数据库字段：service_content */
    private String serviceContent;

    /** 服务人员姓名, 数据库字段：work_name */
    private String workName;

    /** 服务人员地址, 数据库字段：work_address */
    private String workAddress;

    /** 工作人员手机号, 数据库字段：work_phone */
    private String workPhone;

    /** 服务费, 数据库字段：service_amount */
    private String serviceAmount;

    /** 发布时间, 数据库字段：publish_time */
    private Date publishTime;

    /** 已经服务数量, 数据库字段：service_count */
    private Integer serviceCount;

    /** 服务状态 0 接单中 1 休息 2 移除服务, 数据库字段：service_state */
    private Integer serviceState;

    /** 服务公司 ：个人 或者 公司名称, 数据库字段：service_company */
    private String serviceCompany;
    /**服务单位**/
    private String unit;

    /**  数据库字段：home_service.home_service_id */
    public void setHomeServiceId(Integer homeServiceId) {
        this.homeServiceId = homeServiceId;
    }

    /**  数据库字段：home_service.home_service_id */
    public Integer getHomeServiceId() {
        return this.homeServiceId;
    }

    /** 设置服务内容, 数据库字段：home_service.service_content */
    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent;
    }

    /** 获取服务内容, 数据库字段：home_service.service_content */
    public String getServiceContent() {
        return this.serviceContent;
    }

    /** 设置服务人员姓名, 数据库字段：home_service.work_name */
    public void setWorkName(String workName) {
        this.workName = workName;
    }

    /** 获取服务人员姓名, 数据库字段：home_service.work_name */
    public String getWorkName() {
        return this.workName;
    }

    /** 设置服务人员地址, 数据库字段：home_service.work_address */
    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    /** 获取服务人员地址, 数据库字段：home_service.work_address */
    public String getWorkAddress() {
        return this.workAddress;
    }

    /** 设置工作人员手机号, 数据库字段：home_service.work_phone */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    /** 获取工作人员手机号, 数据库字段：home_service.work_phone */
    public String getWorkPhone() {
        return this.workPhone;
    }

    /** 设置服务费, 数据库字段：home_service.service_amount */
    public void setServiceAmount(String serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    /** 获取服务费, 数据库字段：home_service.service_amount */
    public String getServiceAmount() {
        return this.serviceAmount;
    }

    /** 设置发布时间, 数据库字段：home_service.publish_time */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /** 获取发布时间, 数据库字段：home_service.publish_time */
    public Date getPublishTime() {
        return this.publishTime;
    }

    /** 设置已经服务数量, 数据库字段：home_service.service_count */
    public void setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
    }

    /** 获取已经服务数量, 数据库字段：home_service.service_count */
    public Integer getServiceCount() {
        return this.serviceCount;
    }

    /** 设置服务状态 0 接单中 1 休息 2 移除服务, 数据库字段：home_service.service_state */
    public void setServiceState(Integer serviceState) {
        this.serviceState = serviceState;
    }

    /** 获取服务状态 0 接单中 1 休息 2 移除服务, 数据库字段：home_service.service_state */
    public Integer getServiceState() {
        return this.serviceState;
    }

    /** 设置服务公司 ：个人 或者 公司名称, 数据库字段：home_service.service_company */
    public void setServiceCompany(String serviceCompany) {
        this.serviceCompany = serviceCompany;
    }

    /** 获取服务公司 ：个人 或者 公司名称, 数据库字段：home_service.service_company */
    public String getServiceCompany() {
        return this.serviceCompany;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
            ((homeServiceId == null) ? 0 : homeServiceId.hashCode());

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

        HomeServiceModel other = (HomeServiceModel) obj;

        if (homeServiceId == null) {
            if (other.homeServiceId != null) {
                return false;
            }
        } else if (!homeServiceId.equals(other.homeServiceId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HomeServiceModel [");
        sb.append("homeServiceId=").append(homeServiceId);
        sb.append(", ");
        sb.append("serviceContent=").append(serviceContent);
        sb.append(", ");
        sb.append("workName=").append(workName);
        sb.append(", ");
        sb.append("workAddress=").append(workAddress);
        sb.append(", ");
        sb.append("workPhone=").append(workPhone);
        sb.append(", ");
        sb.append("serviceAmount=").append(serviceAmount);
        sb.append(", ");
        sb.append("publishTime=").append(publishTime);
        sb.append(", ");
        sb.append("serviceCount=").append(serviceCount);
        sb.append(", ");
        sb.append("serviceState=").append(serviceState);
        sb.append(", ");
        sb.append("serviceCompany=").append(serviceCompany);
        sb.append("]");

        return sb.toString();
    }
}
