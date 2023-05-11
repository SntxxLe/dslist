package com.maripng.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maripng.dslist.entities.Game;

//camada de acesso a dados
public interface GameRepository extends JpaRepository <Game, Long> {
	
	

}
