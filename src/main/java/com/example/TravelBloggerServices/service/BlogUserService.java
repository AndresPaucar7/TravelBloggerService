package com.example.TravelBloggerServices.service;

import com.example.TravelBloggerServices.repository.BlogUserRepo;
import com.example.TravelBloggerServices.user.BlogUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BlogUserService implements UserDetailsService{

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final BlogUserRepo blogUserRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException
    {
        return blogUserRepo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Email Not Found"));
    }

    public String signUpUser(BlogUser blogUser) {
        String encodedPassword = bCryptPasswordEncoder.encode(blogUser.getPassword());
        blogUser.setPassword(encodedPassword);
        blogUserRepo.save(blogUser);
        return "User registered successfully";
    }

}
