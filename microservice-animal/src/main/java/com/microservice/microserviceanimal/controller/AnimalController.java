package com.microservice.microserviceanimal.controller;

import com.microservice.client.BookServiceProxy;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal-service")
public class AnimalController {

    //getting eureka server's intances information
    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    //Load balancer with ribbon
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private BookServiceProxy bookServiceProxy;

    @RequestMapping("/getInfo")
    public String getAnimalControllerInfo() {

       /* Application application = eurekaClient.getApplication("book-service");
        for (InstanceInfo instanceInfo : application.getInstances()) {
            System.out.println(instanceInfo.getHomePageUrl());
        }*/

        /*ServiceInstance serviceInstance = loadBalancerClient.choose("book-service");
        System.out.println(serviceInstance.getUri().toString());*/

        String bookServiceResp = bookServiceProxy.getBookControllerInfo();
        System.out.println("resp :" + bookServiceResp);
        return "Animal-Service handled request";
    }
}
