package com.example.demo.dao;

import com.example.demo.entity.Song;

import java.util.Map;

public interface SongMapper {
    
    /**
     * @param Map
     * @IN :"songid"
     * @OUT: "songs"> Song
     */
    Song getSongById(Map<String, Object> Map);

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