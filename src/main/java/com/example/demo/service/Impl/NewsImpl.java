package com.example.demo.service.Impl;

import com.example.demo.dao.NewsCommentMapper;
import com.example.demo.dao.NewsMapper;
import com.example.demo.entity.News;
import com.example.demo.entity.NewsComment;
import com.example.demo.entity.User;
import com.example.demo.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class NewsImpl implements NewsService {
    @Resource
    NewsMapper newsMapper;
    @Resource
    NewsCommentMapper newsCommentMapper;
    @Override
    public ArrayList<News> getAllNews(String userid){
        Map<String,Object>map = new HashMap<>();
        map.put("uid",userid);
        newsMapper.getNews(map);
        return (ArrayList<News>)map.get("news");
    }

    @Override
    public boolean likeNews(String uid,String nid){
        Map<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("nid",nid);
        newsMapper.likeNews(map);
        return true;
    }
    @Override
    public boolean dislikeNews(String uid,String nid){
        Map<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("nid",nid);
        newsMapper.unlikeNews(map);
        return true;
    }
    @Override
    public boolean isUserLikeNews(String uid,String nid){
        Map<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("nid",nid);
        newsMapper.isUserLikeNews(map);
        return map.get("islike").toString().equals("1");
    }
    @Override
    public String commentNews(String uid,String nid,String text){
        Map<String,Object> map = new HashMap<>();
        map.put("commenterid",uid);
        map.put("nid",nid);
        map.put("text",text);
        newsCommentMapper.commentNews(map);
        return map.get("id").toString();
    }

    public String answerComment(String uid,String cid,String text){
        Map<String,Object> map = new HashMap<>();
        map.put("commenterid",uid);
        map.put("parentid",cid);
        map.put("text",text);
        newsCommentMapper.commentComment(map);
        return map.get("id").toString();
    }

    public ArrayList<User> getNewsLike(String nid){
        Map<String,Object> map = new HashMap<>();
        map.put("nid",nid);
        newsMapper.getAllLiker(map);
        ArrayList<User>likers = (ArrayList<User>)map.get("likers");
        return likers;
    }

    public ArrayList<User> getNewsForward(String nid){
        Map<String,Object> map = new HashMap<>();
        map.put("nid",nid);
        newsMapper.getAllForwarder(map);
        ArrayList<User>likers = (ArrayList<User>)map.get("forwarders");
        return likers;
    }

    public ArrayList<NewsComment> getNewsComment(String nid){
        Map<String,Object> map = new HashMap<>();
        map.put("nid",nid);
        newsCommentMapper.getAllComments(map);
        ArrayList<NewsComment>comments = (ArrayList<NewsComment>)map.get("comments");
        return comments;
    }

    public String createNews(String uid,String type,String contentid,String text){
        Map<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("type",type);
        map.put("contentid",contentid);
        map.put("text",text);
        newsMapper.createNews(map);
        return map.get("id").toString();
    }

    public boolean deleteNews(String nid){
        Map<String,Object> map = new HashMap<>();
        map.put("nid",nid);
        newsMapper.deleteNews(map);
        return true;
    }

    public boolean deleteNewsComment(String cid){
        Map<String,Object> map = new HashMap<>();
        map.put("cid",cid);
        newsCommentMapper.deleteComment(map);
        return true;
    }

    public boolean forwardNews(String uid,String nid,String text){
        Map<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("pid",nid);
        map.put("text",text);
        newsMapper.forwardNews(map);
        return true;
    }

    public boolean likeComment(String uid,String cid){
        Map<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("cid",cid);
        newsCommentMapper.likeComments(map);
        return true;
    }
    public boolean dislikeComment(String uid,String cid){
        Map<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("cid",cid);
        newsCommentMapper.unlikeComments(map);
        return true;
    }
    public boolean  isUserLikeComment(String uid,String cid){
        Map<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("cid",cid);
        newsCommentMapper.isUserLikeComments(map);
        return map.get("islike").toString().equals("1");
    }
    public int getCommentLikeNum(String cid){
        Map<String,Object> map = new HashMap<>();
        map.put("cid",cid);
        newsCommentMapper.getCommentLikeCount(map);
        return (int)map.get("cnt");
    }
}
