package com.gy.life.mapper;


import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.model.ProductOrder;
import com.gy.life.model.ReserveOrderDetail;
import com.gy.life.model.order.ProductOrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ${param.author}
 */
public interface ProductOrderMapper extends CrudMapper<ProductOrder, Integer> {

    List<ReserveOrderDetail> selectDetailList(int reserveId);


    List<ProductOrderDetail> selectOrderProductList(@Param("orderStatus") int orderStatus, @Param("userId") int userId);
}
