package com.chenhl.template.mapper;

import com.chenhl.template.domain.Successkilled;
import com.chenhl.template.domain.SuccesskilledExample;
import com.chenhl.template.domain.SuccesskilledKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuccesskilledMapper {
    int countByExample(SuccesskilledExample example);

    int deleteByExample(SuccesskilledExample example);

    int deleteByPrimaryKey(SuccesskilledKey key);

    int insert(Successkilled record);

    int insertSelective(Successkilled record);

    List<Successkilled> selectByExample(SuccesskilledExample example);

    Successkilled selectByPrimaryKey(SuccesskilledKey key);

    int updateByExampleSelective(@Param("record") Successkilled record, @Param("example") SuccesskilledExample example);

    int updateByExample(@Param("record") Successkilled record, @Param("example") SuccesskilledExample example);

    int updateByPrimaryKeySelective(Successkilled record);

    int updateByPrimaryKey(Successkilled record);

    Successkilled queryByIdWithSeckill(long seckillId);
}