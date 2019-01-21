package com.microservice.microservicebook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book-service")
public class BookController {

    @RequestMapping("/getInfo")
    public String getBookControllerInfo() {
        return "Book-Service handled request";
    }
}
