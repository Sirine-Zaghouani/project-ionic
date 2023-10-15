package com.example.gestion_annonces.service;

import com.example.gestion_annonces.entity.User;

public interface AuthService {
    void register(User user);
    User login(String email, String password);

}