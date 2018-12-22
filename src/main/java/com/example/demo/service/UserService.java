package com.example.demo.service;

import com.example.demo.entity.SongList;
import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;

public interface UserService {
    ResultEntity SignIn(User user);
    ResultEntity Register(User user);
    ResultEntity getFans(User user);
    ResultEntity followUser(String userid, String friendid);
    ResultEntity unFollowUser(String userid, String friendid);
    ResultEntity getFriends(User user);
    ResultEntity getFollowSingers(User user);
    ResultEntity getSongLists(User user);
    ResultEntity getFavoriteAlbum(User user);
    ResultEntity getUserById(String id);
    ResultEntity isFriendExist(String userid,String friendid);
    SongList getFavoritelist(String userid);
}
