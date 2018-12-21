package com.example.demo.service;

import com.example.demo.entity.Album;
import com.example.demo.entity.Singer;
import com.example.demo.entity.Song;

import java.util.ArrayList;

public interface SingerService {
    Singer getSingerById(String singerid);
    int getFansNum(String singerid);
    boolean followSinger(String userid,String singerid);
    boolean unfollowSinger(String userid,String singerid);
    ArrayList<Song> getSingerSong(String singerid);
    ArrayList<Album> getSingerAlbum(String singerid);

}
