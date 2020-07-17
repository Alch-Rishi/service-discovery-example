package com.microdiscovery.userinfo.core.repository;

import com.microdiscovery.userinfo.core.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,String>{
    
}