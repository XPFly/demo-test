package com.example.mytest.service.impl;

import com.example.mytest.api.entity.User;
import com.example.mytest.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUserByName(String name) {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setName("Tom");
        user.setAge(18);
        userList.add(user);

        return userList;
    }
}
