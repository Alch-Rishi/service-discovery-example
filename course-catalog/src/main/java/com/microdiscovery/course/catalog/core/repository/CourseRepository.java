package com.microdiscovery.course.catalog.core.repository;

import com.microdiscovery.course.catalog.core.model.Course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course,String>{
    
}