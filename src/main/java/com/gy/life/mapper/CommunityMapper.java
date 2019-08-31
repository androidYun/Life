package com.gy.life.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.model.Community;
import com.gy.life.model.CommunityDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author ${param.author}
 */
@Mapper
public interface CommunityMapper extends CrudMapper<Community, Integer> {

    List<CommunityDetail> selectCommunityDetail();
}
