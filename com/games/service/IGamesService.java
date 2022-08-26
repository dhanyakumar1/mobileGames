package com.games.service;

import java.util.List;

import com.games.exceptions.GameNotFoundException;
import com.games.exceptions.IdNotFoundException;
import com.mobilegames.model.Games;

public interface IGamesService {
	
	void addGames(Games games);
	void updateGames(int gameId, double price);
	void deleteGames(int gameId);
	
	List<Games> getall() throws GameNotFoundException;
	List<Games> getByTitle(String name) throws GameNotFoundException;
	List<Games> getByAgeGroup(int age) throws GameNotFoundException;
	List<Games> getByType(String type) throws GameNotFoundException;
	List<Games> getByPrice(double price) throws GameNotFoundException;
	
	Games getById(int gameId) throws IdNotFoundException;
	
}
