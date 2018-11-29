package com.example.demo.entity;

public class GetFalse extends GetFalseKey {
    private String falsetext;

    private String issolved;

    private String adminid;

    public String getFalsetext() {
        return falsetext;
    }

    public void setFalsetext(String falsetext) {
        this.falsetext = falsetext == null ? null : falsetext.trim();
    }

    public String getIssolved() {
        return issolved;
    }

    public void setIssolved(String issolved) {
        this.issolved = issolved == null ? null : issolved.trim();
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }
}