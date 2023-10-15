package com.example.gestion_annonces.repository;

import com.example.gestion_annonces.entity.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceRepository extends JpaRepository<Annonce, Long> {
    // Tu peux ajouter des méthodes personnalisées si nécessaire
}
