package com.cruzcorp.springboot.api.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthyRestController {

    @GetMapping("/")
    public String healthy(){
        return "healthy";
    }
}
