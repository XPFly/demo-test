package com.example.mytest.provider;

import com.example.mytest.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/get")
    public void getUserByName() {
        userService.getUserByName("Tom");
    }

}
