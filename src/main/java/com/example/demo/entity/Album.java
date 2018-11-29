package com.example.demo.entity;

public class Album {
    private String albumid;

    private String albumname;

    private String singerid;

    private String albumimage;

    private String albumage;

    private String adminid;

    public String getAlbumid() {
        return albumid;
    }

    public void setAlbumid(String albumid) {
        this.albumid = albumid == null ? null : albumid.trim();
    }

    public String getAlbumname() {
        return albumname;
    }

    public void setAlbumname(String albumname) {
        this.albumname = albumname == null ? null : albumname.trim();
    }

    public String getSingerid() {
        return singerid;
    }

    public void setSingerid(String singerid) {
        this.singerid = singerid == null ? null : singerid.trim();
    }

    public String getAlbumimage() {
        return albumimage;
    }

    public void setAlbumimage(String albumimage) {
        this.albumimage = albumimage == null ? null : albumimage.trim();
    }

    public String getAlbumage() {
        return albumage;
    }

    public void setAlbumage(String albumage) {
        this.albumage = albumage == null ? null : albumage.trim();
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }
}