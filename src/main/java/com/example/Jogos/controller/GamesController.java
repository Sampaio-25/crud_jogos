package com.example.Jogos.controller;

import com.example.Jogos.jogos.JogoRequestDTO;
import com.example.Jogos.jogos.Jogos;
import com.example.Jogos.jogos.JogosRepository;
import com.example.Jogos.jogos.JogosResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("game")
public class GamesController {

    @Autowired
    private JogosRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveGame(@RequestBody JogoRequestDTO data){

        Jogos jogoData = new Jogos(data);
    repository.save(jogoData);
    return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<JogosResponseDTO> getAll(){

        List<JogosResponseDTO> gameList = repository.findAll().stream().map(JogosResponseDTO::new).toList();
        return gameList;

    }

}
