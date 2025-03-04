package com.example.TravelBloggerServices.service;

import com.example.TravelBloggerServices.registration.RegistrationRequest;
import com.example.TravelBloggerServices.user.BlogUser;
import org.springframework.stereotype.Service;

//import com.example.TravelBloggerServices.registration.RegistrationRequest;
//import com.example.TravelBloggerServices.user.BlogUser;


@Service
public class RegistrationService {

    private final BlogUserService blogUserService;

    public RegistrationService(BlogUserService blogUserService){
        this.blogUserService = blogUserService;
    }

    public String register(RegistrationRequest request) {
        return blogUserService.signUpUser(
                new BlogUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword()
                )
        );
    }

}
