package com.example.stade.service;

import com.example.stade.dtos.EquipeCompletDTO;
import com.example.stade.dtos.EquipeDTO;

import java.util.List;

public interface EquipeService {
    EquipeDTO saveEquipe(EquipeDTO equipeDTO);
    EquipeCompletDTO getEquipe(Long equipdeID);
    List<EquipeCompletDTO> getEquipesList();
}
