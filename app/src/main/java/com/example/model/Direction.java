package com.example.model;

public class Direction {
    private int DirectionId;
    private String Content;
    private byte[] Picture;
    private int Number;

    private int PostId;

    public Direction(int directionId, String content, byte[] picture, int number, int postId) {
        DirectionId = directionId;
        Content = content;
        Picture = picture;
        Number = number;
        PostId = postId;
    }

    public Direction() {
    }

    public int getDirectionId() {
        return DirectionId;
    }

    public void setDirectionId(int directionId) {
        DirectionId = directionId;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public byte[] getPicture() {
        return Picture;
    }

    public void setPicture(byte[] picture) {
        Picture = picture;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public int getPostId() {
        return PostId;
    }

    public void setPostId(int postId) {
        PostId = postId;
    }
}
