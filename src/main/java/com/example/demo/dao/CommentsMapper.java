package com.example.demo.dao;

import java.util.Map;

public interface CommentsMapper {

    /**
     * @param Map
     * @IN :"userid","songid","commenttext"
     * @OUT: "succ"> String
     */
    void addComment(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"songid"
     * @OUT: "comments"> ArrayList<comments>
     */
    void getComment(Map<String,Object>Map);

}