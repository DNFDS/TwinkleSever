package com.example.demo.entity;

import java.util.Date;

public class Buy extends BuyKey {
    private Date buytime;

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }
}