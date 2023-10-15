package com.example.gestion_annonces.service;

import com.example.gestion_annonces.entity.User;
import com.example.gestion_annonces.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthService authService;

    public User login(String email, String password) {
        return authService.login(email, password);
    }

}
