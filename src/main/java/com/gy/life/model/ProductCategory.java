package com.gy.life.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：product_category
 *
 * @author ${param.author}
 */
@Table(name = "product_category")
public class ProductCategory {
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**  数据库字段：category_id */
    private Integer categoryId;

    /**  数据库字段：category_name */
    private String categoryName;

    /**  数据库字段：parent_id */
    private Integer parentId;

    /**  数据库字段：product_category.category_id */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**  数据库字段：product_category.category_id */
    public Integer getCategoryId() {
        return this.categoryId;
    }

    /**  数据库字段：product_category.category_name */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**  数据库字段：product_category.category_name */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**  数据库字段：product_category.parent_id */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**  数据库字段：product_category.parent_id */
    public Integer getParentId() {
        return this.parentId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
            ((categoryId == null) ? 0 : categoryId.hashCode());

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

        ProductCategory other = (ProductCategory) obj;

        if (categoryId == null) {
            if (other.categoryId != null) {
                return false;
            }
        } else if (!categoryId.equals(other.categoryId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductCategory [");
        sb.append("categoryId=").append(categoryId);
        sb.append(", ");
        sb.append("categoryName=").append(categoryName);
        sb.append(", ");
        sb.append("parentId=").append(parentId);
        sb.append("]");

        return sb.toString();
    }
}
