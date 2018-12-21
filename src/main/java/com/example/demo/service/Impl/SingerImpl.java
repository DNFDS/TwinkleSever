package com.example.demo.service.Impl;

import com.example.demo.dao.AlbumMapper;
import com.example.demo.dao.SingerMapper;
import com.example.demo.dao.SongMapper;
import com.example.demo.entity.Album;
import com.example.demo.entity.Singer;
import com.example.demo.entity.Song;
import com.example.demo.service.SingerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
@Service
public class SingerImpl implements SingerService {
    @Resource
    private SingerMapper singerMapper;
    @Resource
    private SongMapper songMapper;
    @Resource
    AlbumMapper albumMapper;
    public Singer getSingerById(String singerid){
        Map<String,Object> map = new HashMap<>();
        map.put("singerid",singerid);
        singerMapper.getSingerById(map);
        ArrayList<Singer> singers = ( ArrayList<Singer>)map.get("singers");
        Singer singer;
        if(singers.size() == 0){
            singer = new Singer();
        }
        else {
            singer = singers.get(0);
        }
        return singer;
    }
    public ArrayList<Song> getSingerSong(String singerid){
        Map<String,Object> map = new HashMap<>();
        map.put("singerid",singerid);
        songMapper.getSongBySingerId(map);
        return (ArrayList<Song>)map.get("songs");

    }

    public ArrayList<Album> getSingerAlbum(String singerid){
        Map<String,Object> map = new HashMap<>();
        map.put("singerid",singerid);
        albumMapper.getAlbumBySingerId(map);
        return (ArrayList<Album>)map.get("albums");
    }

    public int getFansNum(String singerid){
        Map<String,Object> map = new HashMap<>();
        map.put("singerid",singerid);
        singerMapper.getSingerFansNum(map);
        return (int)map.get("fansnum");
    }

    public boolean followSinger(String userid,String singerid){
        Map<String,Object> map = new HashMap<>();
        map.put("singerid",singerid);
        map.put("userid",userid);
        singerMapper.likeSinger(map);
        return (boolean)map.get("succ");
    }
    public boolean unfollowSinger(String userid,String singerid){
        Map<String,Object> map = new HashMap<>();
        map.put("singerid",singerid);
        map.put("userid",userid);
        singerMapper.unlikeSinger(map);
        return (boolean)map.get("succ");
    }

}
