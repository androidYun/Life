package com.gy.life.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gy.life.model.BuildNumber;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @author ${param.author}
 */
public interface BuildNumberMapper extends CrudMapper<BuildNumber, Integer> {

    @Select("select* from build_number where community_id=#{communityId}")
    List<BuildNumber> selectByCommunity(@Param("communityId") int communityId);

    @Select("select * from build_number where community_id=#{communityId} and build_name=#{buildName}")
    BuildNumber selectByBuildName(@Param("communityId") int communityId, @Param("buildName") String buildName);

    @Select("select * from build_number where community_id=#{communityId} and build_id=#{buildId}")
    BuildNumber selectByBuildId(@Param("communityId") int communityId, @Param("buildId") int buildId);
}
