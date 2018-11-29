package com.example.demo.entity;

public class Song {
    private String songid;

    private String songpath;

    private String songname;

    private String writername;

    private String producername;

    private String songimage;

    private String length;

    private Integer playtimes;

    private String albumid;

    private String songschool;

    private String songage;

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid == null ? null : songid.trim();
    }

    public String getSongpath() {
        return songpath;
    }

    public void setSongpath(String songpath) {
        this.songpath = songpath == null ? null : songpath.trim();
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname == null ? null : songname.trim();
    }

    public String getWritername() {
        return writername;
    }

    public void setWritername(String writername) {
        this.writername = writername == null ? null : writername.trim();
    }

    public String getProducername() {
        return producername;
    }

    public void setProducername(String producername) {
        this.producername = producername == null ? null : producername.trim();
    }

    public String getSongimage() {
        return songimage;
    }

    public void setSongimage(String songimage) {
        this.songimage = songimage == null ? null : songimage.trim();
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length == null ? null : length.trim();
    }

    public Integer getPlaytimes() {
        return playtimes;
    }

    public void setPlaytimes(Integer playtimes) {
        this.playtimes = playtimes;
    }

    public String getAlbumid() {
        return albumid;
    }

    public void setAlbumid(String albumid) {
        this.albumid = albumid == null ? null : albumid.trim();
    }

    public String getSongschool() {
        return songschool;
    }

    public void setSongschool(String songschool) {
        this.songschool = songschool == null ? null : songschool.trim();
    }

    public String getSongage() {
        return songage;
    }

    public void setSongage(String songage) {
        this.songage = songage == null ? null : songage.trim();
    }
}