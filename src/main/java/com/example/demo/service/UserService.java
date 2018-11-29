package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;

public interface UserService {
    //User findUserById(String id);
    ResultEntity SignIn(User user);
    ResultEntity Register(User user);
}
