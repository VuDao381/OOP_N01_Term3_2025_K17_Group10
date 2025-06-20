package com.example.servingwebcontent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    private String username;
    private String useremail;
    private String userpassword;

    public User() {}

    public User(String name, String email, String password) {
        this.username = name;
        this.useremail = email;
        this.userpassword = password;
    }

    // Getter
    public String getName() {
        return username;
    }

    public int getUserid() {
        return userid;
    }

    public String getEmail() {
        return useremail;
    }

    public String getPassword() {
        return userpassword;
    }

    // Setter
    public void setName(String name) {
        this.username = name;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setEmail(String email) {
        this.useremail = email;
    }

    public void setPassword(String password) {
        this.userpassword = password;
    }

    public void setUser(String name, String email, String password) {
        this.username = name;
        this.useremail = email;
        this.userpassword = password;
    }
}
