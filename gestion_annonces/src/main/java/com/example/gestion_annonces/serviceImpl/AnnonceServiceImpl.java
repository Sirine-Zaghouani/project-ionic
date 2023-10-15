package com.example.gestion_annonces.serviceImpl;

import com.example.gestion_annonces.entity.Annonce;
import com.example.gestion_annonces.repository.AnnonceRepository;
import com.example.gestion_annonces.service.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnonceServiceImpl implements AnnonceService {

    @Autowired
    private AnnonceRepository annonceRepository;

    @Override
    public List<Annonce> getAllAnnonces() {
        return annonceRepository.findAll();
    }

    @Override
    public Annonce getAnnonceById(Long id) {
        return annonceRepository.findById(id).orElse(null);
    }

    @Override
    public Annonce createAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }

    @Override
    public Annonce updateAnnonce(Long id, Annonce annonce) {
        Optional<Annonce> existingAnnonceOptional = annonceRepository.findById(id);
        if (existingAnnonceOptional.isPresent()) {
            Annonce existingAnnonce = existingAnnonceOptional.get();
            // Met à jour les propriétés de l'annonce
            existingAnnonce.setTitle(annonce.getTitle());
            existingAnnonce.setDescription(annonce.getDescription());
            existingAnnonce.setPrice(annonce.getPrice());
            existingAnnonce.setCategory(annonce.getCategory());
            existingAnnonce.setLocation(annonce.getLocation());
            existingAnnonce.setImage(annonce.getImage());
            existingAnnonce.setUser(annonce.getUser());

            return annonceRepository.save(existingAnnonce);
        }
        return null; // Gère le cas où l'annonce n'est pas trouvée
    }

    @Override
    public void deleteAnnonce(Long id) {
        annonceRepository.deleteById(id);
    }
}