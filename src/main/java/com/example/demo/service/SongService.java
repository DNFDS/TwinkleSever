package com.example.demo.service;

import com.example.demo.entity.Song;
import com.example.demo.entity.result.ResultEntity;

public interface SongService {
    ResultEntity getSingersInSong(Song song);
}
