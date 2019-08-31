package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.gy.life.mapper.CommunityMapper;
import com.gy.life.model.Community;
import com.gy.life.model.CommunityDetail;
import com.gy.life.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    CommunityMapper communityMapper;

    @Override
    public int insertCommunity(Community community) {
        return communityMapper.save(community);
    }

    @Override
    public List<Community> selectAllList() {
        return communityMapper.list(new Query());
    }

    @Override
    public int deleteCommunity(int communityId) {
        return communityMapper.deleteById(communityId);
    }

    @Override
    public Community selectByCommunityId(int communityId) {
        return communityMapper.getById(communityId);
    }

    @Override
    public List<CommunityDetail> selectCommunityDetail() {

        return communityMapper.selectCommunityDetail();
    }
}
