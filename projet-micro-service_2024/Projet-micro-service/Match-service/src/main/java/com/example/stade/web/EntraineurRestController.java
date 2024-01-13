package com.example.stade.web;

import com.example.stade.dtos.EntraineurDTO;
import com.example.stade.dtos.EquipeDTO;
import com.example.stade.service.EntraineurServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EntraineurRestController {
    private EntraineurServiceImpl entraineurService;
    @PostMapping("/entraineurs/")
    public EntraineurDTO saveEntraineur(@RequestBody EntraineurDTO request ) {
        // Récupérer  les donneer à partir de l'objet request
        return entraineurService.saveEntaineur(request);
    }
}
