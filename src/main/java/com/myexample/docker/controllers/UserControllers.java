package com.myexample.docker.controllers;

import com.myexample.docker.models.User;
import com.myexample.docker.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllers {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getUser() {
        return userService.getUsers();
    }

}
