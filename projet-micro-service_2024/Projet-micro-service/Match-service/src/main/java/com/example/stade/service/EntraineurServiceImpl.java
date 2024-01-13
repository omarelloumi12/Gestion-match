package com.example.stade.service;

import com.example.stade.dtos.EntraineurDTO;
import com.example.stade.entities.Entraineur;
import com.example.stade.entities.Equipe;
import com.example.stade.mapper.EntraineurMapper;
import com.example.stade.repository.EntraineurRepository;
import com.example.stade.repository.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EntraineurServiceImpl implements EntraineurService {
    private EntraineurRepository entraineurRepository;
    private EntraineurMapper entraineurMapper;
    private EquipeRepository equipeRepository;
    @Override
    public EntraineurDTO saveEntaineur(EntraineurDTO entraineurDTO) {
        Entraineur entraineur=entraineurMapper.fromEntraineurDTO(entraineurDTO);
        Entraineur savedEntraineur=entraineurRepository.save(entraineur);
        Equipe equipe=equipeRepository.findById(entraineurDTO.getEquipe_id()).orElse(null);
        if(equipe==null){
            throw new RuntimeException();
        }
        equipe.setEntraineur(entraineur);
        Equipe modifiedEquipe=equipeRepository.save(equipe);
        return entraineurMapper.fromEntraineur(savedEntraineur);
    }

    @Override
    public EntraineurDTO getArbitre(Long IdEntraineur) {
        return null;
    }

    @Override
    public List<EntraineurDTO> getAllArbitres() {
        return null;
    }
}
