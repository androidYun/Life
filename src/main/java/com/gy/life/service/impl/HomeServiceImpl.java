package com.gy.life.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.gy.life.mapper.HomeServiceMapper;
import com.gy.life.model.HomeServiceModel;
import com.gy.life.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HomeServiceImpl implements HomeService {

    @Autowired
    HomeServiceMapper homeServiceMapper;

    @Override
    public List<HomeServiceModel> selectAllList() {
        return homeServiceMapper.list(new Query());
    }

    @Override
    public int insertHomeService(HomeServiceModel homeServiceModel) {
        return homeServiceMapper.save(homeServiceModel);
    }

    @Override
    public HomeServiceModel selectById(int homeServiceId) {
        return homeServiceMapper.getById(homeServiceId);
    }

    @Override
    public int deleteHomeService(int homeServiceId) {
        return homeServiceMapper.deleteById(homeServiceId);
    }

    @Override
    public int updateHomeService(HomeServiceModel homeServiceModel) {
        return homeServiceMapper.update(homeServiceModel);
    }
}
