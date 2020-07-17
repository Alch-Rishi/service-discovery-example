package com.microdiscovery.course.catalog.core.controller;


import com.microdiscovery.course.catalog.core.service.CourseCatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CourseCatalogController{

    @Autowired
    private CourseCatalogService courseCatalogService;

    @GetMapping("/user/{email}/course/{id}")
    public String getCoursePrice(@PathVariable String email, @PathVariable String id){
        return courseCatalogService.getCoursePriceById(email, id);
    }

}