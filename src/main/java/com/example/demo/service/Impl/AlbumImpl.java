package com.example.demo.service.Impl;

import com.example.demo.dao.AlbumMapper;
import com.example.demo.dao.SongMapper;
import com.example.demo.entity.Album;
import com.example.demo.entity.Song;
import com.example.demo.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class AlbumImpl implements AlbumService {
    @Resource
    private AlbumMapper albumMapper;
    @Resource
    private SongMapper songMapper;
    @Override
    public Album getAlbumByAlbumId(String albumid){
        Map<String,Object> map = new HashMap<>();
        map.put("albumid",albumid);
        albumMapper.getAlbumById(map);
        ArrayList<Album> albums = (ArrayList<Album>)map.get("albums");
        if(albums.size()==0){
            Album album = new Album();
            album.setAlbumname("null");
            album.setAlbumid("null");
            return album;
        }
        return albums.get(0);
    }
    @Override
    public ArrayList<Song> getSongsInAlbum(String albumid){
        Map<String,Object> map = new HashMap<>();
        map.put("albumid",albumid);
        songMapper.getSongByAlbumId(map);
        return (ArrayList<Song>)map.get("songs");
    }
}
