package com.example.stade.web;

import com.example.stade.dtos.MatchCreateDTO;
import com.example.stade.dtos.MatchFootDTO;
import com.example.stade.service.MatchServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchRestController {
    private MatchServiceImpl matchService;
    @PostMapping("/matchs/")
    public MatchCreateDTO saveEntraineur(@RequestBody MatchCreateDTO request ) {
        // Récupérer  les donneer à partir de l'objet request
        return matchService.saveMatch(request);
    }
    @GetMapping("/matchs/")
    public List<MatchFootDTO> listJoueur(){
        return matchService.getAllMatch();
    }
    @GetMapping("/matchs/{id}")
    public MatchFootDTO getJoueur(@PathVariable(name = "id") Long matchId) {
        // Récupérer  les donneer à partir de l'objet request
        return matchService.getMatch(matchId);
    }
}
