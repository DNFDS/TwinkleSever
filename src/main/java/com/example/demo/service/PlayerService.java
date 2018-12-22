package com.example.demo.service;

import com.example.demo.entity.Song;

import java.util.ArrayList;
import java.util.Map;

public interface PlayerService
{
    Song getSongByID(Map<String, Object> Map);
    ArrayList<Integer> getListByAlbumID(Map<String, Object> Map);
    ArrayList<Integer> getListByListID(Map<String, Object> Map);
}
