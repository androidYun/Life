package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.BuildNumber;
import com.gy.life.service.impl.BuildNumberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/build")
@RestController
public class BuildNumberController {

    @Autowired
    BuildNumberServiceImpl buildNumberService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertBuildNumber(@RequestBody BuildNumber buildNumber) {

        BuildNumber selectBuildNumber = buildNumberService.selectByBuildNumberName(buildNumber.getCommunityId(), buildNumber.getBuildName());
        if (selectBuildNumber != null) {
            return ResultEntity.getErrorResult("已存在");
        }
        int insertCount = buildNumberService.insertBuildNumber(buildNumber);
        if (insertCount > 0) {
            List<BuildNumber> communities = buildNumberService.selectAllList(buildNumber.getCommunityId());
            return ResultEntity.getSuccessResult(communities);
        } else {
            return ResultEntity.getSuccessResult("添加失败");
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity selectBuildNumberList(int communityId) {
        List<BuildNumber> communities = buildNumberService.selectAllList(communityId);
        return ResultEntity.getSuccessResult(communities);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public ResultEntity selectBuildNumberDetail(int communityId,int buildId) {
        BuildNumber buildNumber = buildNumberService.selectByBuildNumberId(communityId, buildId);
        return ResultEntity.getSuccessResult(buildNumber);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultEntity updateBuildNumber(@RequestBody BuildNumber buildNumber) {
        BuildNumber selectByBuildNumber = buildNumberService.selectByBuildNumberId(buildNumber.getCommunityId(), buildNumber.getBuildId());
        if (selectByBuildNumber == null) {
            return ResultEntity.getErrorResult("不存在");
        }
        int updateCount = buildNumberService.updateNumber(buildNumber);
        if (updateCount > 0) {
            return ResultEntity.getSuccessResult("更新成功");
        } else {
            return ResultEntity.getSuccessResult("更新失败");
        }
    }

    @RequestMapping(value = "/delete/{buildNumberId}", method = RequestMethod.GET)
    public ResultEntity deleteBuildNumber(@PathVariable int buildNumberId) {
        BuildNumber communities = buildNumberService.selectByBuildNumberId(buildNumberId);
        if (communities == null) {
            return ResultEntity.getErrorResult("不存在");
        }
        int deleteCount = buildNumberService.deleteBuildNumber(buildNumberId);
        if (deleteCount > 0) {
            return ResultEntity.getSuccessResult("删除成功");
        } else {
            return ResultEntity.getSuccessResult("删除失败");
        }
    }
}
