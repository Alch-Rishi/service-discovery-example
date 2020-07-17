package com.microdiscovery.course.catalog.core.dto.mapper;

import com.microdiscovery.course.catalog.core.dto.response.CoursePriceDto;
import com.microdiscovery.course.catalog.core.model.Course;

public class CourseMapper {

    public static CoursePriceDto toCoursePriceDto(Course course, double priceToShow){
        return new CoursePriceDto(course.getName(), priceToShow, course.getInstituteName(), course.getCountry());
    }
    
}