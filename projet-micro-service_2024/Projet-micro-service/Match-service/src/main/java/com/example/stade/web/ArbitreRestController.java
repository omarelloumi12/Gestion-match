package com.example.stade.web;

import com.example.stade.dtos.ArbitreDTO;
import com.example.stade.dtos.EntraineurDTO;
import com.example.stade.service.ArbitreServiceImpl;
import com.example.stade.service.EntraineurServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ArbitreRestController {
    private ArbitreServiceImpl arbitreService;
    @PostMapping("/arbitres/")
    public ArbitreDTO saveEntraineur(@RequestBody ArbitreDTO request ) {
        // Récupérer  les donneer à partir de l'objet request
        return arbitreService.saveArbitre(request);
    }
}
