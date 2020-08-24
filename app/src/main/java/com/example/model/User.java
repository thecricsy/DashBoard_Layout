package com.example.model;

import java.util.Date;

public class User {
    String email;
    String password;
    String hoTen;
    String SDT;
    Date birth;

    public User() {
    }

    public User(String email, String password, String hoTen, String SDT, Date birth) {
        this.email = email;
        this.password = password;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
