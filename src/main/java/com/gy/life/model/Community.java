package com.gy.life.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：community
 *
 * @author ${param.author}
 */
@Table(name = "community")
public class Community {
    @Id
    @Column(name = "community_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**  数据库字段：community_id */
    private Integer communityId;

    /**  数据库字段：community_name */
    private String communityName;

    /**  数据库字段：community_address */
    private String communityAddress;

    /**  数据库字段：community.community_id */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    /**  数据库字段：community.community_id */
    public Integer getCommunityId() {
        return this.communityId;
    }

    /**  数据库字段：community.community_name */
    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    /**  数据库字段：community.community_name */
    public String getCommunityName() {
        return this.communityName;
    }

    public String getCommunityAddress() {
        return communityAddress;
    }

    public void setCommunityAddress(String communityAddress) {
        this.communityAddress = communityAddress;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
            ((communityId == null) ? 0 : communityId.hashCode());

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

        Community other = (Community) obj;

        if (communityId == null) {
            if (other.communityId != null) {
                return false;
            }
        } else if (!communityId.equals(other.communityId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Community [");
        sb.append("communityId=").append(communityId);
        sb.append(", ");
        sb.append("communityName=").append(communityName);
        sb.append("]");

        return sb.toString();
    }
}
