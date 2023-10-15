package com.example.gestion_annonces.service;

import com.example.gestion_annonces.entity.Annonce;

import java.util.List;

public interface AnnonceService {
    List<Annonce> getAllAnnonces();
    Annonce getAnnonceById(Long id);
    Annonce createAnnonce(Annonce annonce);
    Annonce updateAnnonce(Long id, Annonce annonce);
    void deleteAnnonce(Long id);
}