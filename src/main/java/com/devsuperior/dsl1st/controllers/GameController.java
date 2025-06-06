package com.devsuperior.dsl1st.controllers;


import com.devsuperior.dsl1st.dto.GameMinDTO;
import com.devsuperior.dsl1st.entities.Game;
import com.devsuperior.dsl1st.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
         return result;
    }
}
