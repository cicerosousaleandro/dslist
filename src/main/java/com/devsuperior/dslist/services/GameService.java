package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositpries.GameRepository;

@Component
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	

	public List<Game> findAll(){

		List<Game> result = gameRepository.findAll();
		return result;
	}
}
