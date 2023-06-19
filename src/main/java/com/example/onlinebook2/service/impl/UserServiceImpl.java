package com.example.onlinebook2.service.impl;
import com.example.onlinebook2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.onlinebook2.entity.User;
import com.example.onlinebook2.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUid(String uid) {
        return userMapper.findUserByUid(uid);
    }
    @Override
    public User findUserByName(String username){return userMapper.findUserByName(username);}
    @Override
    public void registerUser(User user){userMapper.registerUser(user);}

}
