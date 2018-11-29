package com.example.demo.entity;

public class comments extends commentsKey {
    private String commenttext;

    public String getCommenttext() {
        return commenttext;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext == null ? null : commenttext.trim();
    }
}