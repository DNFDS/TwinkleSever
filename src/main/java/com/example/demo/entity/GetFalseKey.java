package com.example.demo.entity;

import java.util.Date;

public class GetFalseKey {
    private String userid;

    private String songid;

    private Date getfalsetime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid == null ? null : songid.trim();
    }

    public Date getGetfalsetime() {
        return getfalsetime;
    }

    public void setGetfalsetime(Date getfalsetime) {
        this.getfalsetime = getfalsetime;
    }
}