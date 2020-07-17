package com.microdiscovery.course.catalog.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CoursePriceDto {

    private String courseName;
    private double price;
    private String instituteName;
    private String country;
    
}