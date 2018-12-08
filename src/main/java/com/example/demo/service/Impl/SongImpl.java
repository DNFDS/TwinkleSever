package com.example.demo.service.Impl;

import com.example.demo.dao.SongListMapper;
import com.example.demo.entity.Song;
import com.example.demo.entity.SongList;
import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.SongService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class SongImpl implements SongService {
    @Resource
    private SongListMapper songListMapper;

    @Override
    public ResultEntity getSongsInSongList(SongList list){
        Map<String,Object> map = new HashMap<>();
        map.put("songlistid",list.getSonglistid());
        songListMapper.getSongsInSongList(map);
        ArrayList<Song> songs = (ArrayList<Song>)map.get("songs");
        return new ResultEntity(true,"",songs);
    }
}
