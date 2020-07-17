package com.microdiscovery.userinfo.core.config;

import com.microdiscovery.userinfo.core.model.User;
import com.microdiscovery.userinfo.core.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableEurekaClient
public class UserConfiguration {
    
    @Bean
    public CommandLineRunner userDbInit(UserRepository userRepository) {
        return (args) -> {
            userRepository.save(new User("rishi@abc.com", "Rishi", "India"));
            userRepository.save(new User("ado@abc.com", "Ado", "Australia"));
            System.out.println(userRepository.findAll());
        };
    }

}