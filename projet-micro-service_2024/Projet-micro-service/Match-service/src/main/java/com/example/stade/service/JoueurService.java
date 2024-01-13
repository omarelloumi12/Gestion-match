package com.example.stade.service;

import com.example.stade.dtos.JoueurCreateDTO;
import com.example.stade.enums.JoueurRole;

import java.util.List;

public interface JoueurService {
    JoueurCreateDTO saveJoueur(JoueurCreateDTO joueurCreateDTO);
    JoueurCreateDTO getJoueur(Long joueurId);
    JoueurCreateDTO updateJoueur(Long IdJouer , int numero, String firstName, String lastName, String picture , JoueurRole joueurRole);
    void deleteJoueur(Long IdJoueur);
    List<JoueurCreateDTO> getJoueurList();
}
