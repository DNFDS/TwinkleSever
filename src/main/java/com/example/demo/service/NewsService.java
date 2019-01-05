package com.example.demo.service;

import com.example.demo.entity.News;
import com.example.demo.entity.NewsComment;
import com.example.demo.entity.User;

import java.util.ArrayList;

public interface NewsService {
    ArrayList<News> getAllNews(String userid);
    boolean likeNews(String uid,String nid);
    boolean dislikeNews(String uid,String nid);
    boolean likeComment(String uid,String cid);
    boolean dislikeComment(String uid,String cid);
    boolean isUserLikeComment(String uid,String cid);
    boolean isUserLikeNews(String uid,String nid);
    String commentNews(String uid,String nid,String text);
    String answerComment(String uid,String cid,String text);
    ArrayList<User> getNewsLike(String nid);
    int getCommentLikeNum(String cid);
    ArrayList<User> getNewsForward(String nid);
    ArrayList<NewsComment> getNewsComment(String nid);
    String createNews(String uid,String type,String contentid,String text);
    boolean deleteNews(String nid);
    boolean deleteNewsComment(String cid);
    boolean forwardNews(String uid,String nid,String text);
}
