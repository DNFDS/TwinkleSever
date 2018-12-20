package com.example.demo.service.Impl;

import com.example.demo.dao.AlbumMapper;
import com.example.demo.dao.SongListMapper;
import com.example.demo.dao.SongMapper;
import com.example.demo.entity.Album;
import com.example.demo.entity.Singer;
import com.example.demo.entity.Song;
import com.example.demo.entity.SongList;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.SongListService;
import com.example.demo.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class SongListImpl implements SongListService {
    @Resource
    private SongListMapper songListMapper;
    @Resource
    private SongMapper songMapper;
    @Resource
    private AlbumMapper albumMapper;

    @Override
    public ResultEntity getSongsInSongList(SongList list){
        Map<String,Object> map = new HashMap<>();
        map.put("songlistid",list.getSonglistid());
        songListMapper.getSongsInSongList(map);
        ArrayList<Song> songs = (ArrayList<Song>)map.get("songs");
        return new ResultEntity(true,"",songs);
    }

    @Override
    public ResultEntity getSingerInSongList(ArrayList<Song> songs){
        ArrayList<ArrayList<Singer>> singers = new ArrayList<>();
        for(Song song :songs){
            Map<String,Object> map = new HashMap<>();
            map.put("songid",song.getSongid());
            songMapper.getSongSinger(map);
            ArrayList<Singer> singer = (ArrayList<Singer>)map.get("singers");
            singers.add(singer);
        }
        return new ResultEntity(true,"",singers);
    }

    @Override
    public ResultEntity getAlbumsInSongList(ArrayList<Song> songs){
        ArrayList<Album>albums = new ArrayList<>();
        for(Song song:songs){
            Album album;
            Map<String,Object> map = new HashMap<>();
            map.put("albumid",song.getAlbumid());
            albumMapper.getAlbumById(map);
            ArrayList<Album> i = (ArrayList<Album>)map.get("albums");
            if(i.size() == 0){//如果当前歌曲没有专辑的话，就给他一个空专辑替位
                album = new Album();
                album.setAlbumid("null");
                album.setAlbumname("无");
            }
            else{
                album = i.get(0);
            }
            albums.add(album);
        }
        return new ResultEntity(true,"",albums);
    }

    @Override
    public ResultEntity getSongListSavedNum(SongList list){
        Map<String,Object> map = new HashMap<>();
        map.put("songlistid",list.getSonglistid());
        songListMapper.getSongListSavedNum(map);
        int num = (int)map.get("savednum");
        return new ResultEntity(true,"",num);
    }

}
