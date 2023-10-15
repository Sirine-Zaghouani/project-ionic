package com.example.gestion_annonces.serviceImpl;

import com.example.gestion_annonces.entity.User;
import com.example.gestion_annonces.repository.UserRepository;
import com.example.gestion_annonces.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void register(User user) {
        // Ajouter la logique de validation et d'enregistrement de l'utilisateur
        userRepository.save(user);
    }


    @Override
    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            return null; // Identifiants incorrects
        }
    }
}
