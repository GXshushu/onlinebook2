package com.example.onlinebook2.util;


import org.springframework.util.DigestUtils;

public class MD5Util {
    public static String getMD5(String raw){
        return DigestUtils.md5DigestAsHex(raw.getBytes());
    }
}
