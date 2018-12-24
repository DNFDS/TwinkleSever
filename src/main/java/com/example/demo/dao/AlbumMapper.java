package com.example.demo.dao;

import java.util.Map;

public interface AlbumMapper {
    
    /**
     * @param Map
     * @IN :"albumname"
     * @OUT: "albums"> ArrayList<Album>
     */
    void getAlbumByNamePart(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"albumname"
     * @OUT: "albums"> ArrayList<Album>
     */
    void getAlbumByName(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"singerid"
     * @OUT: "albums"> ArrayList<Album>
     */
    void getAlbumBySingerId(Map<String,Object> Map);
    
    /**
     * @param Map
     * @IN :"albumid"
     * @OUT: "albums"> ArrayList<Album>
     */
    void getAlbumById(Map<String,Object> Map);
    
    /**
     * @param Map
     * @OUT: "albums"> ArrayList<Album>
     */
    void getAllAlbum(Map<String,Object> Map);
}