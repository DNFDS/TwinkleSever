package com.model;

public class Singer extends human {
    public Singer(){}

    private String SingerSex;
    private String Region;
    private String Introduction;
    public String getSingerSex() {
        return SingerSex;
    }
    public void setSingerSex(String singerSex) {
        SingerSex = singerSex;
    }
    public String getRegion() {
        return Region;
    }
    public void setRegion(String region) {
        Region = region;
    }
    public String getIntroduction() {
        return Introduction;
    }
    public void setIntroduction(String introduction) {
        Introduction = introduction;
    }

}
