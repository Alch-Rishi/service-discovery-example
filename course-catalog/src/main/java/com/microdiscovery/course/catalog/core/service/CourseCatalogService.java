package com.microdiscovery.course.catalog.core.service;

import com.microdiscovery.course.catalog.core.dto.response.CoursePriceDto;

import org.hibernate.ObjectNotFoundException;


public interface CourseCatalogService {
 
    public CoursePriceDto getCoursePriceById(String email, String id) throws ObjectNotFoundException;
}