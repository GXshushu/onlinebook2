package com.example.onlinebook2.service.impl;

import com.example.onlinebook2.entity.Content;
import com.example.onlinebook2.mapper.ContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl {
    @Autowired
    private ContentMapper cm;
    public void insertContent(Content content){
        cm.insertContent(content);
    }
    public List<Content> findAllContent(String uid){
        return cm.findAllContent(uid);
    }
    public boolean updateContent(String text,String cid,String uid){
        Content content = cm.findOneContentByCid(cid);
        if (content.getUid().equals(uid)){ //权限校验
            cm.updateContent(text,cid);
            return true;
        }
        else {
            return false;
        }

    }
}
