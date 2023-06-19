package com.example.onlinebook2.mapper;
import com.example.onlinebook2.entity.User;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    public User findUserByUid(String uid);
    public void registerUser(User user);
    public User findUserByName(String username);
}
