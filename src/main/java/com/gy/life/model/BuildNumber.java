package com.gy.life.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：build
 *
 * @author ${param.author}
 */
@Table(name = "build_number")
public class BuildNumber {
    @Id
    @Column(name = "build_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**  数据库字段：build_id */
    private Integer buildId;

    /**  数据库字段：build_Name */
    private String buildName;

    /**  数据库字段：start_unit */
    private Integer startUnit;

    /**  数据库字段：end_unit */
    private Integer endUnit;

    /**  数据库字段：start_floor */
    private Integer startFloor;

    /**  数据库字段：end_floor */
    private Integer endFloor;

    /** 第N楼 开始楼号 , 数据库字段：start_number */
    private Integer startNumber;

    /**  数据库字段：end_number */
    private Integer endNumber;

    /**  数据库字段：community_id */
    private Integer communityId;

    /**  数据库字段：build.build_id */
    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    /**  数据库字段：build.build_id */
    public Integer getBuildId() {
        return this.buildId;
    }

    /**  数据库字段：build.build_name */
    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    /**  数据库字段：build.build_name */
    public String getBuildName() {
        return this.buildName;
    }

    /**  数据库字段：build.start_unit */
    public void setStartUnit(Integer startUnit) {
        this.startUnit = startUnit;
    }

    /**  数据库字段：build.start_unit */
    public Integer getStartUnit() {
        return this.startUnit;
    }

    /**  数据库字段：build.end_unit */
    public void setEndUnit(Integer endUnit) {
        this.endUnit = endUnit;
    }

    /**  数据库字段：build.end_unit */
    public Integer getEndUnit() {
        return this.endUnit;
    }

    /**  数据库字段：build.start_floor */
    public void setStartFloor(Integer startFloor) {
        this.startFloor = startFloor;
    }

    /**  数据库字段：build.start_floor */
    public Integer getStartFloor() {
        return this.startFloor;
    }

    /**  数据库字段：build.end_floor */
    public void setEndFloor(Integer endFloor) {
        this.endFloor = endFloor;
    }

    /**  数据库字段：build.end_floor */
    public Integer getEndFloor() {
        return this.endFloor;
    }

    /** 设置第N楼 开始楼号 , 数据库字段：build.start_number */
    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    /** 获取第N楼 开始楼号 , 数据库字段：build.start_number */
    public Integer getStartNumber() {
        return this.startNumber;
    }

    /**  数据库字段：build.end_number */
    public void setEndNumber(Integer endNumber) {
        this.endNumber = endNumber;
    }

    /**  数据库字段：build.end_number */
    public Integer getEndNumber() {
        return this.endNumber;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
            ((buildId == null) ? 0 : buildId.hashCode());

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

        BuildNumber other = (BuildNumber) obj;

        if (buildId == null) {
            if (other.buildId != null) {
                return false;
            }
        } else if (!buildId.equals(other.buildId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BuildNumber [");
        sb.append("buildId=").append(buildId);
        sb.append(", ");
        sb.append("buildNo=").append(buildName);
        sb.append(", ");
        sb.append("startUnit=").append(startUnit);
        sb.append(", ");
        sb.append("endUnit=").append(endUnit);
        sb.append(", ");
        sb.append("startFloor=").append(startFloor);
        sb.append(", ");
        sb.append("endFloor=").append(endFloor);
        sb.append(", ");
        sb.append("startNumber=").append(startNumber);
        sb.append(", ");
        sb.append("endNumber=").append(endNumber);
        sb.append("]");

        return sb.toString();
    }
}
