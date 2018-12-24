package com.example.demo.dao;

import java.util.Map;

public interface SongListMapper {
    
    /**
     * @param Map
     * @IN :"userid","songlistid"
     * @OUT: "succ"> 1:true 0:false
     */
    void keepSongList(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"songlistid","userid"
     * @OUT: "succ"> String
     */
    void unKeepSongList(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"userid","songlistid"
     * @OUT: "result"> 1:true 0:false
     */
    void deleteSongListKeeped(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"songlistid"
     * @OUT: "succ"> String
     */
    String deleteSongList(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"songid","songlistid"
     * @OUT: "succ"> 1:true 0:false
     */
    void deleteSongFromSongList(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"songlistid","songid"
     * @OUT: "succ"> 1:true 0:false
     */
    void addSongToSongList(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"songlistname","songlistimage","isprivate","userid"
     * @OUT: "songlistid"> String
     */
    void createSongList(Map<String, Object> Map);


    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "createdsonglist"> ArrayList<SongList>
     */
    void getSongListCreatedByUserId(Map<String, Object>Map);

    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "keepedsonglist"> ArrayList<SongList>
     */
    void getSongListKeepedByUserId(Map<String, Object>Map);

    /**
     * @param Map
     * @IN :"songlistid"
     * @OUT: "songs"> ArrayList<Song>
     */
    void getSongsInSongList(Map<String, Object>Map);

    /**
     * @param Map
     * @OUT: "songlists"> ArrayList<SongList>
     */
    void getAllSonglist(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"songlistid"
     * @OUT: "savednum"> int
     */
    void getSongListSavedNum(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"songlistname"
     * @OUT: "songlists"> ArrayList<SongList>
     */
    void getSongListByNamePart(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"songlistname"
     * @OUT: "songlists"> ArrayList<SongList>
     */
    void getSongListByName(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"songlistid"
     * @OUT: "songlist"> ArrayList<SongList>
     */
    void getSongListById(Map<String,Object>Map);


    /**
     * @param Map
     * @IN :"songlistid","songlistname"
     * @OUT: "succ"> String
     */
    void updateSongListName(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"songlistid","songlistimage"
     * @OUT: "succ"> String
     */
    void updateSongListImage(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"songlistid","isprivate"
     * @OUT: "succ"> String
     */
    void updateIsPrivate(Map<String,Object>Map);
}