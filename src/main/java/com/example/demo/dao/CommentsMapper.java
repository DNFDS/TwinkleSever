package com.example.demo.dao;

import com.example.demo.entity.comments;
import com.example.demo.entity.Example.commentsExample;
import com.example.demo.entity.commentsKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CommentsMapper {
    int countByExample(commentsExample example);

    int deleteByExample(commentsExample example);

    int deleteByPrimaryKey(commentsKey key);

    int insert(comments record);

    int insertSelective(comments record);

    List<comments> selectByExample(commentsExample example);

    comments selectByPrimaryKey(commentsKey key);

    int updateByExampleSelective(@Param("record") comments record, @Param("example") commentsExample example);

    int updateByExample(@Param("record") comments record, @Param("example") commentsExample example);

    int updateByPrimaryKeySelective(comments record);

    int updateByPrimaryKey(comments record);

    /**
     * @param Map
     * @IN :"userid","songid","commenttext"
     * @OUT: "succ"> String
     */
    String addComment(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"songid"
     * @OUT: "comments"> ArrayList<comments>
     */
    void getComment(Map<String,Object>Map);

}