package com.model;

public class Ban {
    private String UserID;
    private String AdminID;
    private String BanTime;
    private String BanReason;

    public String getUserID() {
        return UserID;
    }
    public void setUserID(String userID) {
        UserID = userID;
    }
    public String getAdminID() {
        return AdminID;
    }
    public void setAdminID(String adminID) {
        AdminID = adminID;
    }
    public String getBanTime() {
        return BanTime;
    }
    public void setBanTime(String banTime) {
        BanTime = banTime;
    }
    public String getBanReason() {
        return BanReason;
    }
    public void setBanReason(String banReason) {
        BanReason = banReason;
    }
}
