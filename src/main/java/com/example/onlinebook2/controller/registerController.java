package com.example.onlinebook2.controller;

import com.example.onlinebook2.entity.User;
import com.example.onlinebook2.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class registerController {
    @Autowired
    private UserServiceImpl usi;
    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> params, HttpSession session){
        String uid = UUID.randomUUID().toString().replace("-", "");
        String username = params.get("username");
        String password = params.get("password");
        Date date = new Date();
        User user = new User(uid,date,username,password);
        if(usi.findUserByName(username) == null) {
            usi.registerUser(user);
            return "success";
        }
        else{
            return "false";
        }

    }
}
