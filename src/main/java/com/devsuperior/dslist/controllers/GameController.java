package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entites.Game;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDTO> listAll(){
        return service.findAll();
    }


}