package com.games.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.games.dao.IgamesDAO;
import com.games.exceptions.GameNotFoundException;
import com.games.exceptions.IdNotFoundException;
import com.mobilegames.model.Games;
@Service
public class GamesServiceImpl implements IGamesService {
	@Autowired
	IgamesDAO gamesDAO;
	
	public List<Games> getall() {
		List<Games> games = gamesDAO.findall();
		
		return games;
	}

	public List<Games> getByTitle(String name) throws GameNotFoundException {
		List<Games> games = gamesDAO.findByTitle(name);
		if (games.isEmpty()) {
			throw new GameNotFoundException();
		}
		return games;
	}


	public List<Games> getByAgeGroup(int age) throws GameNotFoundException {
		List<Games> games = gamesDAO.findByAgeGroup(age);
		if (games.isEmpty()) {
			throw new GameNotFoundException();
		}
		return games;
	}
	public List<Games> getByType(String type) throws GameNotFoundException {
		List<Games> games = gamesDAO.findByType(type);
		if (games.isEmpty()) {
			throw new GameNotFoundException();
		}
		return games;
	}

	public List<Games> getByPrice(double price) throws GameNotFoundException {
		List<Games> games = gamesDAO.findByPrice(price);
		if (games.isEmpty()) {
			throw new GameNotFoundException();
		}
		return games;
	}

	public Games getById(int gameId) throws IdNotFoundException {
		Games games = gamesDAO.findById(gameId);
		if (games != null) {
			return games; 
		}
		throw new IdNotFoundException();
	}

	@Override
	public void addGames(Games games) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGames(int gameId, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGames(int gameId) {
		// TODO Auto-generated method stub
		
	}

}
