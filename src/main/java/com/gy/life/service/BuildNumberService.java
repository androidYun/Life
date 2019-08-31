package com.gy.life.service;

import com.gy.life.model.BuildNumber;

import java.util.List;

public interface BuildNumberService {

    int insertBuildNumber(BuildNumber buildNumber);

    int updateNumber(BuildNumber buildNumber);

    List<BuildNumber> selectAllList(int communityId);

    int deleteBuildNumber(int buildNumberId);


    BuildNumber selectByBuildNumberId(int communityId);

    BuildNumber selectByBuildNumberId(int communityId, int buildId);

    BuildNumber selectByBuildNumberName(int communityId, String buildName);
}
