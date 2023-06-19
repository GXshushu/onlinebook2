package com.example.onlinebook2.mapper;

import com.example.onlinebook2.entity.Content;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ContentMapper {
    public void insertContent(Content content);
    public List<Content> findAllContent(String uid);
    public void updateContent(String text,String cid);
    public Content findOneContentByCid(String cid);
}
