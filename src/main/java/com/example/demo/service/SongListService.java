package com.example.demo.service;

import com.example.demo.entity.Song;
import com.example.demo.entity.SongList;
import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;

import javax.sql.rowset.spi.SyncResolver;
import java.util.ArrayList;

public interface SongListService {
    ArrayList<SongList> getCommandSongList(String userid);
    SongList getSongListById(String songlistid);
    String createNewSongList(String name, String image, String isprivate,String userid);
    String deleteSongList(String songlistid);
    boolean deleteSongInList(String songid,String songlistid);
    String changeSongListName(String name,String songlistid);
    ArrayList<SongList> getSongListByNamePart(String name);
    ResultEntity getSongsInSongList(SongList list);
    ResultEntity getSongListSavedNum(SongList list);
    ResultEntity getSingerInSongList(ArrayList<Song> songs);
    ResultEntity getAlbumsInSongList(ArrayList<Song> songs);
}
