package com.example.demo.dao;

import com.example.demo.entity.GetFalse;
import com.example.demo.entity.Example.GetFalseExample;
import com.example.demo.entity.GetFalseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GetFalseMapper {
    int countByExample(GetFalseExample example);

    int deleteByExample(GetFalseExample example);

    int deleteByPrimaryKey(GetFalseKey key);

    int insert(GetFalse record);

    int insertSelective(GetFalse record);

    List<GetFalse> selectByExample(GetFalseExample example);

    GetFalse selectByPrimaryKey(GetFalseKey key);

    int updateByExampleSelective(@Param("record") GetFalse record, @Param("example") GetFalseExample example);

    int updateByExample(@Param("record") GetFalse record, @Param("example") GetFalseExample example);

    int updateByPrimaryKeySelective(GetFalse record);

    int updateByPrimaryKey(GetFalse record);
}