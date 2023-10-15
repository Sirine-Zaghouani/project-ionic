package com.example.gestion_annonces.controller;

import com.example.gestion_annonces.entity.User;
import com.example.gestion_annonces.service.AuthService;
import com.example.gestion_annonces.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:8100")
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private AuthService authService;
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        authService.register(user);
        return ResponseEntity.ok("Inscription réussie !");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        User user1 = userService.login(user.getEmail(), user.getPassword());

        if (user1 != null) {
            return ResponseEntity.ok("Connexion réussie !");
        } else {
            return ResponseEntity.status(401).body("Identifiants incorrects");
        }
    }
}
