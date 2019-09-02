package com.gy.life.mapper;


import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.ReserveOrderDetail;

import java.util.List;

/**
 * @author ${param.author}
 */
public interface ReserveOrderMapper extends CrudMapper<ProductOrder, Integer> {

    List<ReserveOrderDetail> selectDetailList(int reserveId);
}
