package com.example.stade.service;

import com.example.stade.dtos.EquipeCompletDTO;
import com.example.stade.dtos.EquipeDTO;
import com.example.stade.entities.Entraineur;
import com.example.stade.entities.Equipe;
import com.example.stade.entities.Joueur;
import com.example.stade.mapper.EquipeMapper;
import com.example.stade.repository.EntraineurRepository;
import com.example.stade.repository.EquipeRepository;
import com.example.stade.repository.JoueurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EquipeServiceImpl implements EquipeService {
    private EquipeMapper equipeMapper;
    private EquipeRepository equipeRepository;
    private EntraineurRepository entraineurRepository;
    private JoueurRepository joueurRepository;
    @Override
    public EquipeDTO saveEquipe(EquipeDTO equipeDTO) {
        Equipe equipe=equipeMapper.fromEquipeDTO(equipeDTO);
        Equipe savedequipe=equipeRepository.save(equipe);
        return equipeMapper.fromEquipe(savedequipe);
    }

    @Override
    public EquipeCompletDTO getEquipe(Long equipdeID) {
        Equipe equipe=equipeRepository.findById(equipdeID).orElse(null);
        if(equipe==null){
            throw new RuntimeException();
        }
        List<Joueur> joueurList=joueurRepository.findAllByEquipe_Id(equipe.getId());
        Entraineur entraineur=entraineurRepository.findByEquipe_Id(equipe.getId());
        equipe.setJoueurList(joueurList);
        equipe.setEntraineur(entraineur);
        return equipeMapper.fromEquipeComplet(equipe);
    }

    @Override
    public List<EquipeCompletDTO> getEquipesList() {
        List<Equipe> equipeList = equipeRepository.findAll();
        return equipeList.stream()
                .map(equipe -> {
                    List<Joueur> joueurList = joueurRepository.findAllByEquipe_Id(equipe.getId());
                    Entraineur entraineur = entraineurRepository.findByEquipe_Id(equipe.getId());
                    equipe.setJoueurList(joueurList);
                    equipe.setEntraineur(entraineur);
                    return equipeMapper.fromEquipeComplet(equipe);
                })
                .collect(Collectors.toList());
    }

}
