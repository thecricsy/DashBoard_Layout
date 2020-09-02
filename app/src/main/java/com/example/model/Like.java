package com.example.model;

public class Like {
    private int AccountId;
    private int PostId;

    public Like() {
    }

    public Like(int accountId, int postId) {
        AccountId = accountId;
        PostId = postId;
    }

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int accountId) {
        AccountId = accountId;
    }

    public int getPostId() {
        return PostId;
    }

    public void setPostId(int postId) {
        PostId = postId;
    }
}
