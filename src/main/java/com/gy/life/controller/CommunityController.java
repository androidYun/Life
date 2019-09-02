package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.Community;
import com.gy.life.model.CommunityDetail;
import com.gy.life.service.impl.CommunityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/community")
@RestController
public class CommunityController {
    @Autowired
    CommunityServiceImpl communityService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertCommunity(@RequestBody Community community) {

        int insertCount = communityService.insertCommunity(community);
        if (insertCount > 0) {
            List<Community> communities = communityService.selectAllList();
            return ResultEntity.getSuccessResult(communities);
        } else {
            return ResultEntity.getSuccessResult("添加失败");
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity selectCommunityList() {
        List<Community> communities = communityService.selectAllList();
        return ResultEntity.getSuccessResult(communities);
    }

    @RequestMapping(value = "/listDetail", method = RequestMethod.GET)
    public ResultEntity selectCommunityDetailList() {
        List<CommunityDetail> communityDetails = communityService.selectCommunityDetail();
        return ResultEntity.getSuccessResult(communityDetails);
    }


    @RequestMapping(value = "/{communityId}", method = RequestMethod.GET)
    public ResultEntity deleteCommunity(@PathVariable int communityId) {
        Community communities = communityService.selectByCommunityId(communityId);
        if (communities == null) {
            return ResultEntity.getErrorResult("不存在");
        }
        int deleteCount = communityService.deleteCommunity(communityId);
        if (deleteCount > 0) {
            return ResultEntity.getSuccessResult("删除成功");
        } else {
            return ResultEntity.getSuccessResult("删除失败");
        }
    }
}
