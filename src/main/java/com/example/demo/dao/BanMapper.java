package com.example.demo.dao;

import com.example.demo.entity.Ban;
import com.example.demo.entity.Example.BanExample;
import com.example.demo.entity.BanKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BanMapper {
    int countByExample(BanExample example);

    int deleteByExample(BanExample example);

    int deleteByPrimaryKey(BanKey key);

    int insert(Ban record);

    int insertSelective(Ban record);

    List<Ban> selectByExample(BanExample example);

    Ban selectByPrimaryKey(BanKey key);

    int updateByExampleSelective(@Param("record") Ban record, @Param("example") BanExample example);

    int updateByExample(@Param("record") Ban record, @Param("example") BanExample example);

    int updateByPrimaryKeySelective(Ban record);

    int updateByPrimaryKey(Ban record);
}