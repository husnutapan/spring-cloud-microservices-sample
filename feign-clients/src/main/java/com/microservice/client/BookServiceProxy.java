package com.microservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "book-service", url = "http://localhost:5010/book-service")
public interface BookServiceProxy {

    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    String getBookControllerInfo();
}
