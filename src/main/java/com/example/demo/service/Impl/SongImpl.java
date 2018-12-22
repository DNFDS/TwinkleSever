package com.example.demo.service.Impl;

import com.example.demo.dao.AlbumMapper;
import com.example.demo.dao.BuyMapper;
import com.example.demo.dao.SongMapper;
import com.example.demo.dao.CommentsMapper;
import com.example.demo.entity.*;
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
    private SongMapper songMapper;
    @Resource
    private BuyMapper buyMapper;
    @Resource
    private CommentsMapper commentsMapper;

    @Override
    public ResultEntity getSingersInSong(String songid){
        Map<String,Object> map = new HashMap<>();
        map.put("songid",songid);
        songMapper.getSongSinger(map);
        ArrayList<Singer> singers = (ArrayList<Singer>)map.get("singers");
        if(singers == null)
            return new ResultEntity(false,"查询"+songid+"时出错",null);
        else
            return new ResultEntity(true,"",singers);
    }

    @Override
    public ResultEntity getBoughtSongByUserId(String userid){
        Map<String,Object> map = new HashMap<>();
        map.put("userid",userid);
        buyMapper.getBuyRecord(map);
        ArrayList<Song> songs = new ArrayList<>();
        ArrayList<Buy> buys = (ArrayList<Buy>)map.get("buyrecord");
        for(Buy buy:buys){
            map.put("songid",buy.getSongid());
            songMapper.getSongById(map);
            songs.add((Song) map.get("songs"));
        }
        return new ResultEntity(true,"",songs);
    }

    @Override
    public Song getSongById(String songid){
        Map<String,Object> map = new HashMap<>();
        map.put("songid",songid);
        songMapper.getSongById(map);
        Song song;
        ArrayList<Song> songs = (ArrayList<Song>)map.get("songs");
        if(songs.size() == 0){
            song = new Song();
            song.setSongid("null");
            song.setSongname("null");
        }
        else song = songs.get(0);
        return song;
    }

    @Override
    public ArrayList<comments> getCommentsInSong(String songid){
        Map<String,Object> map = new HashMap<>();
        map.put("songid",songid);
        commentsMapper.getComment(map);
        ArrayList<comments> comments = (ArrayList<comments>)map.get("comments");
        if(comments == null){
            comments = new ArrayList<>();
        }
        return comments;
    }
    @Override
    public boolean commentSong(String words,String songid,String userid){
        Map<String,Object> map = new HashMap<>();
        map.put("songid",songid);
        map.put("userid",userid);
        map.put("commenttext",words);
        commentsMapper.addComment(map);
        String result = (String)map.get("succ");
        if(result.equals("1"))
            return true;
        return false;
    }

}
