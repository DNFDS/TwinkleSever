package com.model;

public class GetFalse {
    private String UserID;
    private String SongID;
    private String GetFalseTime;
    private String FalseText;
    private char IsSolved;
    private String AdminID;

    public String getUserID() {
        return UserID;
    }
    public void setUserID(String userID) {
        UserID = userID;
    }
    public String getSongID() {
        return SongID;
    }
    public void setSongID(String songID) {
        SongID = songID;
    }
    public String getGetFalseTime() {
        return GetFalseTime;
    }
    public void setGetFalseTime(String getFalseTime) {
        GetFalseTime = getFalseTime;
    }
    public String getFalseText() {
        return FalseText;
    }
    public void setFalseText(String falseText) {
        FalseText = falseText;
    }
    public char getIsSolved() {
        return IsSolved;
    }
    public void setIsSolved(char isSolved) {
        IsSolved = isSolved;
    }
    public String getAdminID() {
        return AdminID;
    }
    public void setAdminID(String adminID) {
        AdminID = adminID;
    }
}
