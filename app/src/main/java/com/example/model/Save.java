package com.example.model;

public class Save {
    private String PrivateNote;
    private int AccountId;
    private int PostId;

    public Save() {
    }

    public Save(String privateNote, int accountId, int postId) {
        PrivateNote = privateNote;
        AccountId = accountId;
        PostId = postId;
    }

    public String getPrivateNote() {
        return PrivateNote;
    }

    public void setPrivateNote(String privateNote) {
        PrivateNote = privateNote;
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
