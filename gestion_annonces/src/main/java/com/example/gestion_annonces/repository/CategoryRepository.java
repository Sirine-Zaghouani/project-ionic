package com.example.gestion_annonces.repository;

import com.example.gestion_annonces.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Tu peux ajouter des méthodes personnalisées si nécessaire
}