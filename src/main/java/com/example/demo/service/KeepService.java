package com.example.demo.service;

public interface KeepService {
    String KeepSong(String songid,String songlistid);
    String KeepSongList(String songlistid,String userid);
    String unKeepSongList(String songlistid,String userid);
    String unKeepSong(String songid,String songlistid);
}
