package com.example.gestion_annonces.repository;


import com.example.gestion_annonces.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
