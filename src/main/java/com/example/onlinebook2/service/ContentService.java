package com.example.onlinebook2.service;

import com.example.onlinebook2.entity.Content;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContentService {
    public void insertContent(Content content);
    public List<Content> findAllContent(String uid);
}
