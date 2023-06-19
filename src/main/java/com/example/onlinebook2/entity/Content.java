package com.example.onlinebook2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@Data
public class Content {
    private String uid;
    private String cid;
    private String text;

    private Date createTime;
    public Content(String uid, String cid, String text, Date createTime) {
        this.uid = uid;
        this.cid = cid;
        this.text = text;
        this.createTime = createTime;
    }
}
