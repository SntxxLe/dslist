package com.maripng.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maripng.dslist.dto.GameMinDTO;
import com.maripng.dslist.entities.Game;
import com.maripng.dslist.repositories.GameRepository;


//camada de servico
@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
