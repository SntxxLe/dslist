package com.maripng.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maripng.dslist.dto.GameMinDTO;
import com.maripng.dslist.services.GameService;

//camada do controlador, porta da api do back
@RestController
@RequestMapping (value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping 
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}

}
