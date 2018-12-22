package com.example.demo.service;

import com.example.demo.entity.Album;
import com.example.demo.entity.Singer;
import com.example.demo.entity.Song;

import java.util.ArrayList;

public interface SingerService {
    Singer getSingerById(String singerid);
    ArrayList<Singer> getSingerUserLike(String userid);
    int getFansNum(String singerid);
    boolean isUserLikeSinger(String singerid,String userid);
    boolean followSinger(String userid,String singerid);
    boolean unfollowSinger(String userid,String singerid);
    ArrayList<Song> getSingerSong(String singerid);
    ArrayList<Album> getSingerAlbum(String singerid);

}
