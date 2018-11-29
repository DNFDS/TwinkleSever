package com.example.demo.entity;

public class BuyRecord {
    private String SongID;
    private String BuyTime;
    public String getSongID() {
        return SongID;
    }
    public void setSongID(String songID) {
        SongID = songID;
    }
    public String getBuyTime() {
        return BuyTime;
    }
    public void setBuyTime(String buyTime) {
        BuyTime = buyTime;
    }
}
