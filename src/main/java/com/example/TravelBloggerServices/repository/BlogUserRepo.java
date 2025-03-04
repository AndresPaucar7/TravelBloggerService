package com.example.TravelBloggerServices.repository;

import java.util.Optional;

import com.example.TravelBloggerServices.user.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import com.example.TravelBloggerServices.user.BlogUser;

@Repository
@Transactional(readOnly = true)
public interface BlogUserRepo extends JpaRepository<BlogUser, Long> {
    Optional<BlogUser> findByEmail(String email);
}
