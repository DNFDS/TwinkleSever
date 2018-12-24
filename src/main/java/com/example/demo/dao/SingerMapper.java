package com.example.demo.dao;

import java.util.Map;

public interface SingerMapper {

    /**
     * @param Map
     * @IN :"singerid"
     * @OUT: "singers"> Singer
     */
    void getSingerById(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"singername"
     * @OUT: "singers"> ArrayList<Singer>
     */
    void getSingerByName_part(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"singername"
     * @OUT: "singers"> ArrayList<Singer>
     */
    void getSingerByName(Map<String,Object> Map);

    /**
     * @param Map
     * @OUT: "singers"> ArrayList<Singer>
     */
    void getAllSinger(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"singerid"
     * @OUT: "fansnum"> int
     */
    void getSingerFansNum(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"userid","singerid"
     * @OUT: "succ"> 1:true 0:false
     */
    void likeSinger(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"userid","singerid"
     * @OUT: "succ"> 1:true 0:false
     */
    void unlikeSinger(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"userid","singerid"
     * @OUT: "islike"> String
     */
    void isUserLikeSinger(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "singers"> ArrayList<Singer>
     */
    void getSingerUserLike(Map<String,Object> Map);
}