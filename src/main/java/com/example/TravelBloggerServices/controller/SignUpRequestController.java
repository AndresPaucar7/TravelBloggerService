package com.example.TravelBloggerServices.controller;
import com.example.TravelBloggerServices.registration.EmailRequest;
import com.example.TravelBloggerServices.service.EmailService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.TravelBloggerServices.registration.EmailRequest;
//import com.example.TravelBloggerServices.service.EmailService;

@RestController
@RequestMapping(path = "api/v1/requestsignup")
@CrossOrigin(origins = {"http://localhost:3000", "https://travelblog7.netlify.app"})
@AllArgsConstructor
public class SignUpRequestController   {

    private final EmailService emailService;

    @PostMapping
    public String requestSignUp(@RequestBody EmailRequest emailRequest) {
        emailService.sendSignUpLink(emailRequest.getEmail());
        return "Sign-up link sent to " + emailRequest.getEmail();
    }
}
