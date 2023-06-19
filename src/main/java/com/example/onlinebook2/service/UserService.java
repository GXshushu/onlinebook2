package com.example.onlinebook2.service;
import com.example.onlinebook2.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User findUserByUid(String uid);
    public User findUserByName(String username);
    public void registerUser(User user);
}
