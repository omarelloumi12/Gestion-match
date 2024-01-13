package com.example.stade.service;

import com.example.stade.dtos.ArbitreDTO;
import com.example.stade.entities.Arbitre;
import com.example.stade.entities.Equipe;
import com.example.stade.entities.Joueur;
import com.example.stade.mapper.ArbitreMapper;
import com.example.stade.repository.ArbitreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ArbitreServiceImpl implements ArbitreService {
    private ArbitreRepository arbitreRepository;
    private ArbitreMapper arbitreMapper;
    @Override
    public ArbitreDTO saveArbitre(ArbitreDTO arbitreDTO) {
        Arbitre savedarbitre=arbitreRepository.save(arbitreMapper.fromArbitreDTO(arbitreDTO));
        return arbitreMapper.fromArbitre(savedarbitre);
    }

    @Override
    public ArbitreDTO getArbitre(Long IdArbitre) {
        return null;
    }

    @Override
    public List<ArbitreDTO> getAllArbitres() {
        return null;
    }
}
