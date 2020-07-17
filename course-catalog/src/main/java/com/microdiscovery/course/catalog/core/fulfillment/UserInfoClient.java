package com.microdiscovery.course.catalog.core.fulfillment;

import com.microdiscovery.course.catalog.core.config.constant.FulfillmentConstants;
import com.microdiscovery.course.catalog.core.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserInfoClient {

    @Autowired
    private RestTemplate restTemplate;
    
    public User getUserByEmail(String emailId){
        return restTemplate.getForObject(FulfillmentConstants.PROTOCOL 
                                            + FulfillmentConstants.USER_INFO_APP_NAME 
                                            + FulfillmentConstants.GET_USER_BY_EMAIL_ENDPOINT
                                            + emailId, User.class);
            
    }
}