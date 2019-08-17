package com.gy.life.mapper;

import com.gy.life.model.ReserveGoodModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface ReserveGoodModelMapper {
    int deleteByPrimaryKey(Integer reserveId);

    int insert(ReserveGoodModel record);

    ReserveGoodModel selectByPrimaryKey(Integer reserveId);

    List<ReserveGoodModel> selectAll();

    int updateByPrimaryKey(ReserveGoodModel record);
}