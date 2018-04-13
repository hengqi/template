package com.chenhl.template.mapper;

import com.chenhl.template.domain.AcctRequest;
import com.chenhl.template.domain.AcctRequestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AcctRequestMapper {
    int countByExample(AcctRequestExample example);

    int deleteByExample(AcctRequestExample example);

    int deleteByPrimaryKey(Long acctrequestid);

    int insert(AcctRequest record);

    int insertSelective(AcctRequest record);

    List<AcctRequest> selectByExample(AcctRequestExample example);

    AcctRequest selectByPrimaryKey(Long acctrequestid);

    int updateByExampleSelective(@Param("record") AcctRequest record, @Param("example") AcctRequestExample example);

    int updateByExample(@Param("record") AcctRequest record, @Param("example") AcctRequestExample example);

    int updateByPrimaryKeySelective(AcctRequest record);

    int updateByPrimaryKey(AcctRequest record);
}