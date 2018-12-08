package com.example.demo.service;

import com.example.demo.entity.SongList;
import com.example.demo.entity.result.ResultEntity;
public interface SongService {
    ResultEntity getSongsInSongList(SongList list);
}
