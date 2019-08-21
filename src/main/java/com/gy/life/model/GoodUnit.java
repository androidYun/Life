package com.gy.life.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：good_unit
 *
 * @author ${param.author}
 */
@Table(name = "good_unit")
public class GoodUnit {
    @Id
    @Column(name = "unit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**  数据库字段：unit_id */
    private Integer unitId;

    /** 类型名字, 数据库字段：unit_name */
    @Column(name = "unit_name")
    private String unitName;

    /**  数据库字段：good_unit.unit_id */
    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    /**  数据库字段：good_unit.unit_id */
    public Integer getUnitId() {
        return this.unitId;
    }

    /** 设置类型名字, 数据库字段：good_unit.unit_name */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /** 获取类型名字, 数据库字段：good_unit.unit_name */
    public String getUnitName() {
        return this.unitName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((unitId == null) ? 0 : unitId.hashCode());

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

        GoodUnit other = (GoodUnit) obj;

        if (unitId == null) {
            if (other.unitId != null) {
                return false;
            }
        } else if (!unitId.equals(other.unitId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GoodUnit [");
        sb.append("unitId=").append(unitId);
        sb.append(", ");
        sb.append("unitName=").append(unitName);
        sb.append("]");

        return sb.toString();
    }
}
