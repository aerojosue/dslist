package com.aerojosue.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerojosue.dslist.dto.GameMinDTO;
import com.aerojosue.dslist.entities.Game;
import com.aerojosue.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		
		//stream permite utilizar sequencia de dados
		//map transforma objetos de uma clase para outra
		//toList para formar a lista
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
