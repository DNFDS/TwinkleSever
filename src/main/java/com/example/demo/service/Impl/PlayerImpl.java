package com.example.demo.service.Impl;

import com.example.demo.dao.SongListMapper;
import com.example.demo.dao.SongMapper;
import com.example.demo.entity.Song;
import com.example.demo.entity.SongList;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class PlayerImpl implements PlayerService
{
    @Resource
    private SongMapper songMapper;
    @Resource
    private SongListMapper songListMapper;

    @Override
    public Song getSongByID(Map<String, Object> Map)
    {
        songMapper.getSongById(Map);
        ArrayList<Song> temp=(ArrayList<Song>) Map.get("songs");
        return temp.get(0);
    }

    @Override
    public ArrayList<Integer> getListByAlbumID(Map<String, Object> Map)
    {
        songMapper.getSongByAlbumId(Map);
        ArrayList<Song> arrayList=(ArrayList<Song>)Map.get("songs");
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        for(Song i:arrayList)
        {
            integerArrayList.add(Integer.parseInt(i.getSongid()));
        }
        return integerArrayList;
    }

    @Override
    public ArrayList<Integer> getListByListID(Map<String, Object> Map)
    {
        songListMapper.getSongListById(Map);
        ArrayList<SongList> arrayList=(ArrayList<SongList>)Map.get("songlist");
        HashMap hashMap=new HashMap();
        hashMap.put("songlistid",arrayList.get(0).getSonglistid());
        songListMapper.getSongsInSongList(hashMap);
        ArrayList<Song>songList=(ArrayList<Song>)hashMap.get("songs");

        ArrayList<Integer> integerArrayList=new ArrayList<>();
        for(Song i:songList)
        {
            integerArrayList.add(Integer.parseInt(i.getSongid()));
        }
        return integerArrayList;
    }
}
