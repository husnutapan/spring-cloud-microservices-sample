package com.microservice.microserviceanimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.microservice.client")
public class MicroserviceAnimalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAnimalApplication.class, args);
    }

}

