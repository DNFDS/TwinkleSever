package com.example.demo.entity;

public class Admin {
    private String adminid;

    private String adminname;

    private String adminpassword;

    private String adminimage;

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    public String getAdminimage() {
        return adminimage;
    }

    public void setAdminimage(String adminimage) {
        this.adminimage = adminimage == null ? null : adminimage.trim();
    }
}