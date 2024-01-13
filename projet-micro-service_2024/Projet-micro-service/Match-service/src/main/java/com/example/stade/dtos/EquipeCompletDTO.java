package com.example.stade.dtos;

import lombok.Data;

import java.util.List;


@Data
public class EquipeCompletDTO {
    private int id;
    private  String name;
    private List<JoueurCreateDTO> joueurListDTO;
    private EntraineurDTO entraineurDTO;
    private  int points;
    private  int victoire;
    private  int nul;
    private int defaite;
    private int buts;
    private  int butsContre;
    private  String picture;
}
