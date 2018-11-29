package com.example.demo.dao;

import com.example.demo.entity.SongList;
import com.example.demo.entity.Example.SongListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongListMapper {
    int countByExample(SongListExample example);

    int deleteByExample(SongListExample example);

    int deleteByPrimaryKey(String songlistid);

    int insert(SongList record);

    int insertSelective(SongList record);

    List<SongList> selectByExample(SongListExample example);

    SongList selectByPrimaryKey(String songlistid);

    int updateByExampleSelective(@Param("record") SongList record, @Param("example") SongListExample example);

    int updateByExample(@Param("record") SongList record, @Param("example") SongListExample example);

    int updateByPrimaryKeySelective(SongList record);

    int updateByPrimaryKey(SongList record);
}