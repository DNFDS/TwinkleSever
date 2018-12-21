package com.example.demo.service;

import java.util.ArrayList;
import java.util.Map;

public interface PlayerService
{
    Integer getSongByID(Map<String, Object> Map);
    ArrayList<Integer> getListByAlbumID(Map<String, Object> Map);
    ArrayList<Integer> getListByListID(Map<String, Object> Map);
}
