# Service Discovery Example

## DISCRIPTION
This application is build upon microservices architecture.
The microservices internally communicates via service discovery.

## BUILD
```
    mvn clean install
```

## RUN
```
    java -jar discovery-server/target/discovery-server-0.0.1-SNAPSHOT.jar 
    java -jar user-info/target/user-info-0.0.1-SNAPSHOT.jar 
    java -jar course-info/target/course-info-0.0.1-SNAPSHOT.jar 
```

Note:- Run the above jar files in a separate context (shell) for each service

## TEST

"For checking users"
```
    curl http://localhost:8082/api/v1/user/rishi@abc.com
    curl http://localhost:8082/api/v1/user/ado@abc.com
```


"User from different country as course"
```    
curl http://localhost:8082/api/v1/user/rishi@abc.com/course/CS95
```

"User from same country as course"
```
curl http://localhost:8082/api/v1/user/ado@abc.com/course/CS95
```

## NOTE
1) For getting course price another microservice can be made for abstraction. 
    This can help keeping the business layer(For eg. calculating the price based on some condition) separate from dao layer(course-category).
2) Exceptions can be implemented separately.
3) Data insertion can be moved to data.sql file.
4) User is fetched from its email only, so its assumed to be unique and belongs to the particular user only
5) The whole Course details are sent now instead of price only for more options on frontend
