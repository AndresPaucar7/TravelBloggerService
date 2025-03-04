package com.example.TravelBloggerServices.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendSignUpLink(String userEmail){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userEmail);
        message.setSubject("Sign Up Here");
        message.setText("Click here to sign up \n" +
                "https://travelblog7.netlify.app/register");

        mailSender.send(message);
    }
}
