package com.gy.life.mapper;


import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.common.PageEntity;
import com.gy.life.model.ReserveOrder;
import com.gy.life.model.ReserveOrderDetail;

import java.util.List;

/**
 * @author ${param.author}
 */
public interface ReserveOrderMapper extends CrudMapper<ReserveOrder, Integer> {

    List<ReserveOrderDetail> selectDetailList(int reserveId);
}
