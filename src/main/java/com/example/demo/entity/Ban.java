package com.example.demo.entity;

import java.util.Date;

public class Ban extends BanKey {
    private Date bantime;

    private String banreason;

    public Date getBantime() {
        return bantime;
    }

    public void setBantime(Date bantime) {
        this.bantime = bantime;
    }

    public String getBanreason() {
        return banreason;
    }

    public void setBanreason(String banreason) {
        this.banreason = banreason == null ? null : banreason.trim();
    }
}