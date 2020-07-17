package com.microdiscovery.course.catalog.core.config;

import com.microdiscovery.course.catalog.core.model.Course;
import com.microdiscovery.course.catalog.core.repository.CourseRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CourseCatalogConfiguration {
    
    @Bean
    public CommandLineRunner courseCatalogInit(CourseRepository courseRepository) {
        return (args) -> {
            courseRepository.save(new Course("CS95", "Computer Science", 100.0, 150.0, "University A", "Australia"));
            courseRepository.save(new Course("MG01", "Management", 150.0, 250.0, "University B", "Australia"));
        };
    }

}