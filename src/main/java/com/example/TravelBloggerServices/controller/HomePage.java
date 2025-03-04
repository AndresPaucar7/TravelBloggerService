package com.example.TravelBloggerServices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
    @GetMapping("/api/v1/homepage")
    public String home()
    {
        return "Public Page";
    }

    @GetMapping("LoggedIn")
    public String loggedIn()
    {
        return "Logged in Home Page";
    }
}
