package com.example.onlinebook2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class User implements Serializable {
    private String uid;
    private Date regisTime;
    private String userName;
    private String passWord;

    public User(String uid, Date regisTime, String userName, String passWord) {
        this.uid = uid;
        this.regisTime = regisTime;
        this.userName = userName;
        this.passWord = passWord;
    }
}
