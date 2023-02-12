package com.dnd.apigateway.intreviewpracticeapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class IntreviewPracticeApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntreviewPracticeApiGatewayApplication.class, args);
    }

}
