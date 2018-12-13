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
     * @IN :"songid"
     * @OUT: "songs"> Song
     */
    void getSongById(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"songname"
     * @OUT: "songs"> ArrayList<Song>
     */
    void getSongByNamePart(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"songname"
     * @OUT: "songs"> ArrayList<Song>
     */
    void getSongByName(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"singerid"
     * @OUT: "songs"> ArrayList<Song>
     */
    void getSongBySingerId(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"albumid"
     * @OUT: "songs"> ArrayList<Song>
     */
    void getSongByAlbumId(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"songid"
     * @OUT: "singers"> ArrayList<Singer>
     */
    void getSongSinger(Map<String, Object> Map);

    /**
     * @param Map
     * @OUT: "songs"> ArrayList<Song>
     */
    void getAllSongDesc(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"songid"
     * @OUT: "succ"> String
     */
    void songPlaytimesPlus(Map<String, Object> Map);
}