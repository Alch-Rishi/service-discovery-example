package com.microdiscovery.course.catalog.core.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
   
    @Id
    private String courseId;
    private String name;
    private Double domesticPrice;
    private Double internationalPrice;
    private String instituteName;
    private String country;
}