package com.microdiscovery.course.catalog.core.controller;


import com.microdiscovery.course.catalog.core.dto.RestResponse;
import com.microdiscovery.course.catalog.core.service.CourseCatalogService;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<RestResponse> getCoursePrice(@PathVariable String email, @PathVariable String id){
        try{
            return ResponseEntity.ok().body(new RestResponse<>(courseCatalogService.getCoursePriceById(email, id)));
        }
        catch(ObjectNotFoundException e){
            return ResponseEntity.ok().body(new RestResponse<>("Unable to fetch course", e.getMessage()));
        }
        
    }

}