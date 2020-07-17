package com.microdiscovery.userinfo.core.service.impl;

import com.microdiscovery.userinfo.core.model.User;
import com.microdiscovery.userinfo.core.repository.UserRepository;
import com.microdiscovery.userinfo.core.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByEmail(String id){
        return userRepository.findById(id).orElse(null);
    }

    
    
}