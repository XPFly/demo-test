package com.example.mytest.api;

import com.example.mytest.api.entity.User;

import java.util.List;

public interface UserApi {

    List<User> getUserByName(String name);
}
