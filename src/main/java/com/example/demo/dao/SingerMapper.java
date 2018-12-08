package com.example.demo.dao;

import com.example.demo.entity.Singer;
import com.example.demo.entity.Example.SingerExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SingerMapper {
    int countByExample(SingerExample example);

    int deleteByExample(SingerExample example);

    int deleteByPrimaryKey(String singerid);

    int insert(Singer record);

    int insertSelective(Singer record);

    List<Singer> selectByExample(SingerExample example);

    Singer selectByPrimaryKey(String singerid);

    int updateByExampleSelective(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByExample(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);

    /**
     * @param Map
     * @IN :"songid"
     * @OUT: "result"> ArrayList<String>
     */
    void getSingerIdBySongId(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"songname"
     * @OUT: "result"> ArrayList<Song>
     */
    void getSingerByName_part(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"songname"
     * @OUT: "result"> ArrayList<Song>
     */
    void getSingerByName(Map<String,Object> Map);
}