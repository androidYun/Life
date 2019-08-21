package com.gy.life.mapper;

import com.gy.life.model.ReserveGood;
import java.util.List;

public interface ReserveGoodMapper {
    int deleteByPrimaryKey(Integer reserveId);

    int insert(ReserveGood record);

    ReserveGood selectByPrimaryKey(Integer reserveId);

    List<ReserveGood> selectAll();

    int updateByPrimaryKey(ReserveGood record);
}