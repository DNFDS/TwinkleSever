package com.example.demo.dao;

import com.example.demo.entity.Song;
import com.example.demo.entity.Example.SongExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SongMapper {
    int countByExample(SongExample example);

    int deleteByExample(SongExample example);

    int deleteByPrimaryKey(String songid);

    int insert(Song record);

    int insertSelective(Song record);

    List<Song> selectByExample(SongExample example);

    Song selectByPrimaryKey(String songid);

    int updateByExampleSelective(@Param("record") Song record, @Param("example") SongExample example);

    int updateByExample(@Param("record") Song record, @Param("example") SongExample example);

    int updateByPrimaryKeySelective(Song record);

    int updateByPrimaryKey(Song record);

    /**
     * @param Map
     * @IN :"songname"
     * @OUT: "result"> ArrayList<Song>
     */
    void getSongByName_part(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"songname"
     * @OUT: "result"> ArrayList<Song>
     */
    void getSongByName(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"singerid"
     * @OUT: "result"> ArrayList<Song>
     */
    void getSongBySingerId(Map<String, Object> Map);
}