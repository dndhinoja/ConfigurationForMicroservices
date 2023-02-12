package com.dnd.apigateway.intreviewpracticeapigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userservicefallback")
    public String userServiceFallBackMethod(){
            return "User Service is taking more than expected time"+"Please try again later";
    }

    @GetMapping("/blogservicefallback")
    public String blogServiceFallBackMethod(){
        return "Blog Service is taking more than expected time"+"Please try again later";
    }
}
