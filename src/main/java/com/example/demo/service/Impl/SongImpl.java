package com.example.demo.service.Impl;

import com.example.demo.dao.SongMapper;
import com.example.demo.entity.Singer;
import com.example.demo.entity.Song;
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

    @Override
    public ResultEntity getSingersInSong(Song song){
        Map<String,Object> map = new HashMap<>();
        map.put("songid",song.getSongid());
        songMapper.getSongSinger(map);
        ArrayList<Singer> singers = (ArrayList<Singer>)map.get("singers");
        if(singers == null)
            return new ResultEntity(false,"查询"+song.getSongid()+"时出错",null);
        else
            return new ResultEntity(true,"",singers);
    }
}
