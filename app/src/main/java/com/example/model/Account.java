package com.example.model;

public class Account {
    private int AccountId;

    private String Email;
    private String Name;
    private String DOB;
    private String Password;
    private int Gender;
    private byte[] Avatar;
    public Account(int accountId, String email, String name, String DOB, String password, int gender, byte[] avatar) {
        AccountId = accountId;
        Email = email;
        Name = name;
        this.DOB = DOB;
        Password = password;
        Gender = gender;
        Avatar = avatar;
    }

    public Account() {
    }

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int accountId) {
        AccountId = accountId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        Gender = gender;
    }

    public byte[] getAvatar() {
        return Avatar;
    }

    public void setAvatar(byte[] avatar) {
        Avatar = avatar;
    }
}
