package com.example.demo.dao;

import com.example.demo.entity.News;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    
    /**
     * @param Map
     * @IN :"uid"
     * @OUT: "news"> ArrayList<News>
     */
    void getFriendsNews(Map<String,Object>Map);
    /**
     * @param Map
     * @IN :"uid"
     * @OUT: "news"> ArrayList<News>
     */
    void getNews(Map<String,Object>Map);
    /**
     * @param Map
     * @IN :"uid"
     * @OUT: "news"> ArrayList<News>
     */
    void getUserNews(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"nid"
     * @OUT: "likers"> ArrayList<User>
     */
    void getAllLiker(Map<String,Object>Map);
    
    /**
     * @param Map
     * @IN :"nid"
     * @OUT: "forwarders"> ArrayList<User>
     */
    void getAllForwarder(Map<String,Object>Map);
    
    
    /**
     * @param Map
     * @IN :"nid","uid"
     */
    void likeNews(Map<String,Object>Map);
    
    /**
     * @param Map
     * @IN :"nid","uid"
     */
    void unlikeNews(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"nid","uid"
     * @OUT:"islike">String
     */
    void isUserLikeNews(Map<String,Object>Map);
    
    /**
     * @param Map
     * @IN :"pid","uid","text"
     */
    void forwardNews(Map<String,Object>Map);
    
    /**
     * @param Map
     * @IN :"uid","type","contentid","text"
     * @OUT:"id"
     */
    void createNews(Map<String,Object>Map);
    
    /**
     * @param Map
     * @IN :"nid"
     */
    void deleteNews(Map<String,Object>Map);
    

}