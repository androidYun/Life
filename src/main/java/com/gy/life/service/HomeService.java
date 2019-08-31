package com.gy.life.service;

import com.gy.life.model.HomeServiceModel;

import java.util.List;

public interface HomeService {
    List<HomeServiceModel> selectAllList();

    int insertHomeService(HomeServiceModel homeServiceModel);

    int updateHomeService(HomeServiceModel homeServiceModel);

    HomeServiceModel selectById(int homeServiceId);

    int deleteHomeService(int homeServiceId);
}
