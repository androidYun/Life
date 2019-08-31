package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.gy.life.mapper.BuildNumberMapper;
import com.gy.life.model.BuildNumber;
import com.gy.life.service.BuildNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BuildNumberServiceImpl implements BuildNumberService {

    @Autowired
    BuildNumberMapper buildNumberMapper;

    @Override
    public int insertBuildNumber(BuildNumber BuildNumber) {
        return buildNumberMapper.save(BuildNumber);
    }

    @Override
    public int updateNumber(BuildNumber buildNumber) {
        return buildNumberMapper.update(buildNumber);
    }

    @Override
    public List<BuildNumber> selectAllList(int communityId) {
        return buildNumberMapper.selectByCommunity(communityId);
    }

    @Override
    public BuildNumber selectByBuildNumberId(int communityId, int buildId) {
        return buildNumberMapper.selectByBuildId(communityId, buildId);
    }

    @Override
    public int deleteBuildNumber(int buildNumberId) {
        return buildNumberMapper.deleteById(buildNumberId);
    }

    @Override
    public BuildNumber selectByBuildNumberId(int buildNumberId) {
        return buildNumberMapper.getById(buildNumberId);
    }

    @Override
    public BuildNumber selectByBuildNumberName(int communityId, String buildName) {
        return buildNumberMapper.selectByBuildName(communityId, buildName);
    }
}
