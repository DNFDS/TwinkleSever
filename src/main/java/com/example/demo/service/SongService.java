package com.example.demo.service;

import com.example.demo.entity.Album;
import com.example.demo.entity.Comment;
import com.example.demo.entity.Singer;
import com.example.demo.entity.Song;
import com.example.demo.entity.result.ResultEntity;

import java.util.ArrayList;

public interface SongService {
    ResultEntity getSingersInSong(String songid);
    ArrayList<Comment> getCommentsInSong(String songid);
    ResultEntity getBoughtSongByUserId(String userid);
    Song getSongById(String songid);
}
