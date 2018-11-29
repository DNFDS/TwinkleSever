package com.example.demo.dao;

import com.example.demo.entity.Buy;
import com.example.demo.entity.Example.BuyExample;
import com.example.demo.entity.BuyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyMapper {
    int countByExample(BuyExample example);

    int deleteByExample(BuyExample example);

    int deleteByPrimaryKey(BuyKey key);

    int insert(Buy record);

    int insertSelective(Buy record);

    List<Buy> selectByExample(BuyExample example);

    Buy selectByPrimaryKey(BuyKey key);

    int updateByExampleSelective(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByExample(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByPrimaryKeySelective(Buy record);

    int updateByPrimaryKey(Buy record);
}