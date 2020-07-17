package com.microdiscovery.userinfo.core.controller;


import com.microdiscovery.userinfo.core.model.User;
import com.microdiscovery.userinfo.core.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserInfoController{

    @Autowired
    private UserService userService;

    @GetMapping("/user/email/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUserByEmail(id);
    }

}