package com.example.model;

public class Post {
    private int PostId;
    private String Header;
    public String Intro;
    private int Serving;
    private int PrepTime;
    private int CookTime;
    private byte[] Poster;

    private String TimeWriten;

    private int AccountId;

    public Post(int postId, String header, String intro, int serving, int prepTime, int cookTime, byte[] poster, String timeWriten, int accountId) {
        PostId = postId;
        Header = header;
        Intro = intro;
        Serving = serving;
        PrepTime = prepTime;
        CookTime = cookTime;
        Poster = poster;
        TimeWriten = timeWriten;
        AccountId = accountId;
    }

    public Post() {
    }

    public int getPostId() {
        return PostId;
    }

    public void setPostId(int postId) {
        PostId = postId;
    }

    public String getHeader() {
        return Header;
    }

    public void setHeader(String header) {
        Header = header;
    }

    public String getIntro() {
        return Intro;
    }

    public void setIntro(String intro) {
        Intro = intro;
    }

    public int getServing() {
        return Serving;
    }

    public void setServing(int serving) {
        Serving = serving;
    }

    public int getPrepTime() {
        return PrepTime;
    }

    public void setPrepTime(int prepTime) {
        PrepTime = prepTime;
    }

    public int getCookTime() {
        return CookTime;
    }

    public void setCookTime(int cookTime) {
        CookTime = cookTime;
    }

    public byte[] getPoster() {
        return Poster;
    }

    public void setPoster(byte[] poster) {
        Poster = poster;
    }

    public String getTimeWriten() {
        return TimeWriten;
    }

    public void setTimeWriten(String timeWriten) {
        TimeWriten = timeWriten;
    }

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int accountId) {
        AccountId = accountId;
    }
}
