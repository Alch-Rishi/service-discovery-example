package com.microdiscovery.course.catalog.core.service.impl;

import com.microdiscovery.course.catalog.core.dto.mapper.CourseMapper;
import com.microdiscovery.course.catalog.core.dto.response.CoursePriceDto;
import com.microdiscovery.course.catalog.core.fulfillment.UserInfoClient;
import com.microdiscovery.course.catalog.core.model.Course;
import com.microdiscovery.course.catalog.core.model.User;
import com.microdiscovery.course.catalog.core.repository.CourseRepository;
import com.microdiscovery.course.catalog.core.service.CourseCatalogService;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseCatalogServiceImpl implements CourseCatalogService{

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private UserInfoClient userInfoClient;

    @Override
    public CoursePriceDto getCoursePriceById(String email, String id) throws ObjectNotFoundException{
        User user = userInfoClient.getUserByEmail(email);
        if(user == null){
            throw new ObjectNotFoundException("User email id not found.", email);
        }

        Course course = courseRepository.findById(id).orElse(null);
        if(course == null){
            throw new ObjectNotFoundException("Course not found.", id);
        }

        return CourseMapper.toCoursePriceDto(course, user.getCountry().equalsIgnoreCase(course.getCountry()) ? 
                                                        course.getDomesticPrice() : course.getInternationalPrice());
 

    }

    
    
}