package com.microdiscovery.course.catalog.core.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResponse<T> {

    public String error;
    public T result;
    public String message;

    public RestResponse(T result){
        this.result = result;
    }

    public RestResponse(String error, String msg){
        this.error = error;
        this.message = msg;
    }
    
}