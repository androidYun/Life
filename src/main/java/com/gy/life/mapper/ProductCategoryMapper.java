package com.gy.life.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.model.ProductCategory;
import com.gy.life.model.ProductDetail;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @author ${param.author}
 */
public interface ProductCategoryMapper extends CrudMapper<ProductCategory, Integer> {

    @Select("select * from product_detail where category_id=#{categoryId} and merchant_id=#{merchantId}")
    List<ProductDetail> selectProductDetailByCategoryId(@Param("categoryId") int categoryId,
                                                        @Param("merchantId") int merchantId);
}
