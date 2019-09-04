package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.HomeServiceModel;
import com.gy.life.service.impl.HomeServiceImpl;
import com.gy.life.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/service")
@RestController
public class HomeServiceController {

    @Autowired
    HomeServiceImpl homeService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertHomeService(@RequestBody HomeServiceModel homeServiceModel) {
        int insertCount = homeService.insertHomeService(homeServiceModel);
        homeServiceModel.setPublishTime(DateUtils.getCurrentTime());
        if (insertCount > 0) {
            return ResultEntity.getSuccessResult("添加成功");
        } else {
            return ResultEntity.getErrorResult("添加失败");
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultEntity updateHomeService(@RequestBody HomeServiceModel homeServiceModel) {
        HomeServiceModel selectHomeService = homeService.selectById(homeServiceModel.getHomeServiceId());
        if (selectHomeService == null) {
            return ResultEntity.getErrorResult("此服务项目不存在");
        }
        int updateCount = homeService.updateHomeService(homeServiceModel);
        if (updateCount > 0) {
            return ResultEntity.getSuccessResult("更新成功");
        } else {
            return ResultEntity.getErrorResult("更新失败");
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity loadAllHomeService() {
        List<HomeServiceModel> homeServiceModels = homeService.selectAllList();
        return ResultEntity.getSuccessResult(homeServiceModels);
    }

    @RequestMapping(value = "/delete/{homeServiceId}", method = RequestMethod.GET)
    public ResultEntity loadAllHomeService(@PathVariable int homeServiceId) {
        int deleteCount = homeService.deleteHomeService(homeServiceId);
        if (deleteCount > 0) {
            List<HomeServiceModel> homeServiceModels = homeService.selectAllList();
            return ResultEntity.getSuccessResult(homeServiceModels);
        } else {
            return ResultEntity.getErrorResult("添加失败");
        }
    }

    @RequestMapping(value = "/{homeServiceId}", method = RequestMethod.GET)
    public ResultEntity loadHomeService(@PathVariable int homeServiceId) {
        HomeServiceModel homeServiceModel = homeService.selectById(homeServiceId);
        if (homeServiceModel != null) {
            return ResultEntity.getSuccessResult(homeServiceModel);
        } else {
            return ResultEntity.getErrorResult("次服务不存在");
        }
    }
}
