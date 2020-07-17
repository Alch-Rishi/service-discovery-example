package com.microdiscovery.course.catalog.core.service.impl;

import com.microdiscovery.course.catalog.core.fulfillment.UserInfoClient;
import com.microdiscovery.course.catalog.core.model.Course;
import com.microdiscovery.course.catalog.core.model.User;
import com.microdiscovery.course.catalog.core.repository.CourseRepository;
import com.microdiscovery.course.catalog.core.service.CourseCatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseCatalogServiceImpl implements CourseCatalogService{

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private UserInfoClient userInfoClient;

    @Override
    public String getCoursePriceById(String email, String id){
        User user = userInfoClient.getUserByEmail(email);
        if(user == null){
            return "User with email id " + email + " not found";
        }

        Course course = courseRepository.findById(id).orElse(null);
        if(course == null){
            return "Course with id " + id + " not found";
        }

        if(user.getCountry().equalsIgnoreCase(course.getCountry())){
            return "Price for the course is " + course.getDomesticPrice();
        }else {
            return "Price for the course is " +  course.getInternationalPrice();
        }

    }

    
    
}