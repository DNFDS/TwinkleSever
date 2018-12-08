package com.example.demo.dao;

import com.example.demo.entity.Album;
import com.example.demo.entity.Example.AlbumExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AlbumMapper {
    int countByExample(AlbumExample example);

    int deleteByExample(AlbumExample example);

    int deleteByPrimaryKey(String albumid);

    int insert(Album record);

    int insertSelective(Album record);

    List<Album> selectByExample(AlbumExample example);

    Album selectByPrimaryKey(String albumid);

    int updateByExampleSelective(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByExample(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKey(Album record);

    /**
     * @param Map
     * @IN :"albumname"
     * @OUT: "result"> ArrayList<Album>
     */
    void getAlbumByName_part(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"albumname"
     * @OUT: "result"> ArrayList<Album>
     */
    void getAlbumByName(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"SingerId"
     * @OUT: "result"> ArrayList<Album>
     */
    void getAlbumBySingerId(Map<String,Object> Map);
}