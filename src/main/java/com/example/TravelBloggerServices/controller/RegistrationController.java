package com.example.TravelBloggerServices.controller;

import com.example.TravelBloggerServices.registration.RegistrationRequest;
import com.example.TravelBloggerServices.service.RegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.TravelBloggerServices.registration.RegistrationRequest;
//import com.example.TravelBloggerServices.service.RegistrationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request)
    {
        return registrationService.register(request);
    }
}
