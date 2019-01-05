package com.example.demo.service.Impl;

import com.example.demo.dao.SongListMapper;
import com.example.demo.dao.SongMapper;
import com.example.demo.service.KeepService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@Service
public class KeepImpl implements KeepService {
    @Resource
    private SongMapper songMapper;
    @Resource
    private SongListMapper songListMapper;

    public String KeepSong(String songid,String songlistid){
        Map<String,Object> map = new HashMap<>();
        map.put("songlistid",songlistid);
        map.put("songid",songid);
        songListMapper.addSongToSongList(map);
        return (String)map.get("succ");
    }
    public String unKeepSongList(String songlistid,String userid){
        Map<String,Object> map = new HashMap<>();
        map.put("songlistid",songlistid);
        map.put("userid",userid);
        songListMapper.unKeepSongList(map);
        return (String)map.get("succ");
    }
    public String KeepSongList(String songlistid,String userid){
        Map<String,Object> map = new HashMap<>();
        map.put("songlistid",songlistid);
        map.put("userid",userid);
        songListMapper.keepSongList(map);
        return (String)map.get("succ");
    }
    public String unKeepSong(String songid,String songlistid){
        Map<String,Object> map = new HashMap<>();
        map.put("songlistid",songlistid);
        map.put("songid",songid);
        songListMapper.deleteSongFromSongList(map);
        return (String)map.get("succ");
    }
}
