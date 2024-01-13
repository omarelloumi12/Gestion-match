package com.example.stade.entities;

import com.example.stade.enums.JoueurRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
//@DiscriminatorValue("JOUEUR")
//@Builder
@Data
public class Joueur extends Personne{
    @Enumerated(EnumType.STRING)// pour qu'il ne soit pas enrigester sous forme 0 , 1 ,2
    private JoueurRole joueurRole;
    @ManyToOne
    private Equipe equipe;
    private int numero;
    private String etat;
}
