package com.example.stade.service;

import com.example.stade.dtos.ArbitreDTO;
import com.example.stade.dtos.EntraineurDTO;

import java.util.List;

public interface EntraineurService {
    EntraineurDTO saveEntaineur(EntraineurDTO entraineurDTO);
    EntraineurDTO getArbitre(Long IdEntraineur);
    List<EntraineurDTO> getAllArbitres();
}
