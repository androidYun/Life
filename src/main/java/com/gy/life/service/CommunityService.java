package com.gy.life.service;

import com.gy.life.model.Community;
import com.gy.life.model.CommunityDetail;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CommunityService {

    int insertCommunity(Community community);

    List<Community> selectAllList();

    int deleteCommunity(int communityId);


    Community selectByCommunityId(int communityId);

    List<CommunityDetail> selectCommunityDetail();


}
