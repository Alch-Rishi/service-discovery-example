package com.microdiscovery.course.catalog.core.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   
    private String email;
    private String name;
    private String country;
}