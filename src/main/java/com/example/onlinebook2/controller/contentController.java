package com.example.onlinebook2.controller;

import com.example.onlinebook2.entity.Content;
import com.example.onlinebook2.service.impl.ContentServiceImpl;
import com.example.onlinebook2.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class contentController {
    @Autowired
    private ContentServiceImpl csi;

    @PostMapping("/writecontent")
    public String writeContent(@RequestBody Map<String,String> params, HttpSession session){
        try{
            String text = params.get("content");
            String uid = (String) session.getAttribute("id");
            Date date = new Date();
            String cid = MD5Util.getMD5(text+date.toString());
            Content content = new Content(uid,cid,text,date);
            csi.insertContent(content);
            return "success";
        }
        catch (Exception e){
            return "false";
        }

    }
    @GetMapping("/getcontent")
    public List<Content> getContent(HttpSession session){
        String uid = (String) session.getAttribute("id");
        List<Content> list = csi.findAllContent(uid);
        return list;
    }

    @PostMapping("/updatecontent")
    public String updateContent(@RequestBody Map<String,String> params,HttpSession session){
        try {
            String text = params.get("content");
            String cid = params.get("cid");
            csi.updateContent(text,cid,(String) session.getAttribute("id"));
            return "success";
        }
        catch (Exception e){
            return "false";
        }

    }
}
