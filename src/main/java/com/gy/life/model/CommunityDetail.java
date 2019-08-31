package com.gy.life.model;

import java.util.List;

public class CommunityDetail {
    private Integer communityId;

    private String communityName;

    private String communityAddress;

    private List<BuildNumber> buildNumbers;

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityAddress() {
        return communityAddress;
    }

    public void setCommunityAddress(String communityAddress) {
        this.communityAddress = communityAddress;
    }

    public List<BuildNumber> getBuildNumbers() {
        return buildNumbers;
    }

    public void setBuildNumbers(List<BuildNumber> buildNumbers) {
        this.buildNumbers = buildNumbers;
    }
}