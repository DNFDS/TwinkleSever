package com.model;

public class User extends human{
    public User(){}
    private String pwd;
    private String pwd_old;
    private String UserSex;
    private boolean Sex;
    private char IsVIP;
    private double UserBalance;
    private char IsBanned;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd_old() {
        return pwd_old;
    }

    public void setPwd_old(String pwd_old) {
        this.pwd_old = pwd_old;
    }

    public String getUserSex() {
        return UserSex;
    }

    public void setUserSex(String userSex) {
        UserSex = userSex;
    }

    public boolean isSex() {
        return Sex;
    }

    public void setSex(boolean sex) {
        Sex = sex;
    }

    public char getIsVIP() {
        return IsVIP;
    }

    public void setIsVIP(char isVIP) {
        IsVIP = isVIP;
    }

    public double getUserBalance() {
        return UserBalance;
    }

    public void setUserBalance(double userBalance) {
        UserBalance = userBalance;
    }

    public char getIsBanned() {
        return IsBanned;
    }

    public void setIsBanned(char isBanned) {
        IsBanned = isBanned;
    }

}
