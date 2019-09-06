package com.gy.life.model;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：product_detail
 *
 * @author ${param.author}
 */
@Table(name = "product_detail")
public class ProductDetail {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**  数据库字段：product_id */
    private Integer productId;

    /**  数据库字段：category_id */
    private Integer categoryId;


    /**  数据库字段：category_name */
    private String categoryName;

    /**  数据库字段：image_url */
    private String imageUrl;

    /**  数据库字段：product_name */
    private String productName;

    /**  数据库字段：product_desc */
    private String productDesc;

    /**  数据库字段：create_time */
    private Date createTime;

    /**  数据库字段：max_count */
    private Integer maxCount;

    /** 单位 个 斤 箱 升  毫升 , 数据库字段：unit */
    private String unit;

    /**  数据库字段：product_finish_time */
    private Date productFinishTime;

    /**  数据库字段：delivery_time */
    private Date deliveryTime;

    /**  数据库字段：pick_address */
    private String pickAddress;

    /** 送货类型 0 全部都支持 1 派送 2 自取  , 数据库字段：delivery_type */
    private Integer deliveryType;

    /** 注意事项, 数据库字段：attention */
    private String attention;

    /** 派送费用, 数据库字段：delivery_money */
    private BigDecimal deliveryMoney;

    /** 卖出数量 默认为0, 数据库字段：sell_out_count */
    private Integer sellOutCount;

    /** 商品价格, 数据库字段：product_price */
    private BigDecimal productPrice;

    /** 市场上面的价格, 数据库字段：market_price */
    private BigDecimal marketPrice;

    /** 发布人的手机号, 数据库字段：publish_phone */
    private String publishPhone;

    /**  数据库字段：product_detail.product_id */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**  数据库字段：product_detail.product_id */
    public Integer getProductId() {
        return this.productId;
    }

    /**  数据库字段：product_detail.category_id */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**  数据库字段：product_detail.category_id */
    public Integer getCategoryId() {
        return this.categoryId;
    }
    /**  数据库字段：product_detail.category_name */
    public String getCategoryName() {
        return categoryName;
    }
    /**  数据库字段：product_detail.category_name */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**  数据库字段：product_detail.image_url */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**  数据库字段：product_detail.image_url */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**  数据库字段：product_detail.product_name */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**  数据库字段：product_detail.product_name */
    public String getProductName() {
        return this.productName;
    }

    /**  数据库字段：product_detail.product_desc */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    /**  数据库字段：product_detail.product_desc */
    public String getProductDesc() {
        return this.productDesc;
    }

    /**  数据库字段：product_detail.create_time */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**  数据库字段：product_detail.create_time */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**  数据库字段：product_detail.max_count */
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    /**  数据库字段：product_detail.max_count */
    public Integer getMaxCount() {
        return this.maxCount;
    }

    /** 设置单位 个 斤 箱 升  毫升 , 数据库字段：product_detail.unit */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /** 获取单位 个 斤 箱 升  毫升 , 数据库字段：product_detail.unit */
    public String getUnit() {
        return this.unit;
    }

    /**  数据库字段：product_detail.product_finish_time */
    public void setProductFinishTime(Date productFinishTime) {
        this.productFinishTime = productFinishTime;
    }

    /**  数据库字段：product_detail.product_finish_time */
    public Date getProductFinishTime() {
        return this.productFinishTime;
    }

    /**  数据库字段：product_detail.delivery_time */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**  数据库字段：product_detail.delivery_time */
    public Date getDeliveryTime() {
        return this.deliveryTime;
    }

    /**  数据库字段：product_detail.pick_address */
    public void setPickAddress(String pickAddress) {
        this.pickAddress = pickAddress;
    }

    /**  数据库字段：product_detail.pick_address */
    public String getPickAddress() {
        return this.pickAddress;
    }

    /** 设置送货类型 0 全部都支持 1 派送 2 自取  , 数据库字段：product_detail.delivery_type */
    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    /** 获取送货类型 0 全部都支持 1 派送 2 自取  , 数据库字段：product_detail.delivery_type */
    public Integer getDeliveryType() {
        return this.deliveryType;
    }

    /** 设置注意事项, 数据库字段：product_detail.attention */
    public void setAttention(String attention) {
        this.attention = attention;
    }

    /** 获取注意事项, 数据库字段：product_detail.attention */
    public String getAttention() {
        return this.attention;
    }

    /** 设置派送费用, 数据库字段：product_detail.delivery_money */
    public void setDeliveryMoney(BigDecimal deliveryMoney) {
        this.deliveryMoney = deliveryMoney;
    }

    /** 获取派送费用, 数据库字段：product_detail.delivery_money */
    public BigDecimal getDeliveryMoney() {
        return this.deliveryMoney;
    }

    /** 设置卖出数量 默认为0, 数据库字段：product_detail.sell_out_count */
    public void setSellOutCount(Integer sellOutCount) {
        this.sellOutCount = sellOutCount;
    }

    /** 获取卖出数量 默认为0, 数据库字段：product_detail.sell_out_count */
    public Integer getSellOutCount() {
        return this.sellOutCount;
    }

    /** 设置商品价格, 数据库字段：product_detail.product_price */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /** 获取商品价格, 数据库字段：product_detail.product_price */
    public BigDecimal getProductPrice() {
        return this.productPrice;
    }

    /** 设置市场上面的价格, 数据库字段：product_detail.market_price */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /** 获取市场上面的价格, 数据库字段：product_detail.market_price */
    public BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    /** 设置发布人的手机号, 数据库字段：product_detail.publish_phone */
    public void setPublishPhone(String publishPhone) {
        this.publishPhone = publishPhone;
    }

    /** 获取发布人的手机号, 数据库字段：product_detail.publish_phone */
    public String getPublishPhone() {
        return this.publishPhone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
                ((productId == null) ? 0 : productId.hashCode());

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

        ProductDetail other = (ProductDetail) obj;

        if (productId == null) {
            if (other.productId != null) {
                return false;
            }
        } else if (!productId.equals(other.productId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductDetail [");
        sb.append("productId=").append(productId);
        sb.append(", ");
        sb.append("categoryId=").append(categoryId);
        sb.append(", ");
        sb.append("imageUrl=").append(imageUrl);
        sb.append(", ");
        sb.append("productName=").append(productName);
        sb.append(", ");
        sb.append("productDesc=").append(productDesc);
        sb.append(", ");
        sb.append("createTime=").append(createTime);
        sb.append(", ");
        sb.append("maxCount=").append(maxCount);
        sb.append(", ");
        sb.append("unit=").append(unit);
        sb.append(", ");
        sb.append("productFinishTime=").append(productFinishTime);
        sb.append(", ");
        sb.append("deliveryTime=").append(deliveryTime);
        sb.append(", ");
        sb.append("pickAddress=").append(pickAddress);
        sb.append(", ");
        sb.append("deliveryType=").append(deliveryType);
        sb.append(", ");
        sb.append("attention=").append(attention);
        sb.append(", ");
        sb.append("deliveryMoney=").append(deliveryMoney);
        sb.append(", ");
        sb.append("sellOutCount=").append(sellOutCount);
        sb.append(", ");
        sb.append("productPrice=").append(productPrice);
        sb.append(", ");
        sb.append("marketPrice=").append(marketPrice);
        sb.append(", ");
        sb.append("publishPhone=").append(publishPhone);
        sb.append("]");

        return sb.toString();
    }
}