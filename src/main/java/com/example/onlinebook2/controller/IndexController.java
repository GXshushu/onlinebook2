package com.example.onlinebook2.controller;

import com.example.onlinebook2.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.onlinebook2.entity.User;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class IndexController {
    @Autowired
    private UserServiceImpl usi;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String Login(@RequestBody Map<String, String> params, HttpSession session){
        String username = params.get("username");
        String password = params.get("password");
        User user = usi.findUserByName(username);
        if(user != null && password.equals(user.getPassWord())) {
            session.setAttribute("id",user.getUid());
        }
        else{
            return "false";
        }
        return "success";
    }

}
