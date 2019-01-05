package com.example.demo.dao;

import com.example.demo.entity.NewsComment;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface NewsCommentMapper {
    
    /**
     * @param Map
     * @IN :"nid"
     * @OUT: "comments"> ArrayList<NewsComment>
     */
    void getAllComments(Map<String,Object>Map);
    
    /**
     * @param Map
     * @IN :"nid","text","commenterid"
     * @OUT:"id"
     */
    void commentNews(Map<String,Object>Map);
    
    /**
     * @param Map
     * @IN :"parentid","text","commenterid"
     * @OUT:"id"
     */
    void commentComment(Map<String,Object>Map);
    
    /**
     * @param Map
     * @IN :"cid","uid"
     */
    void likeComments(Map<String,Object>Map);
    
    /**
     * @param Map
     * @IN :"cid","uid"
     */
    void unlikeComments(Map<String,Object>Map);
    /**
     * @param Map
     * @IN :"cid"
     * @OUT:"cnt">int
     */
    void getCommentLikeCount(Map<String,Object>Map);
    /**
     * @param Map
     * @IN :"cid"
     */
    void deleteComment(Map<String,Object>Map);

    /**
     * @param Map
     * @IN :"cid","uid"
     * @OUT:"islike">String
     */
    void isUserLikeComments(Map<String,Object>Map);

}