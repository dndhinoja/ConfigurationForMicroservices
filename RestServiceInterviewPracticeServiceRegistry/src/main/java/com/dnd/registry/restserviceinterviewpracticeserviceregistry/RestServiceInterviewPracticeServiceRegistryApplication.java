package com.dnd.registry.restserviceinterviewpracticeserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RestServiceInterviewPracticeServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServiceInterviewPracticeServiceRegistryApplication.class, args);
    }

}
