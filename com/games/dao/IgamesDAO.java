package com.games.dao;

import java.util.List;

import com.games.exceptions.GameNotFoundException;
import com.games.exceptions.IdNotFoundException;
import com.mobilegames.model.Games;


public interface IgamesDAO {

	List<Games> findall() throws GameNotFoundException;
	List<Games> findByTitle(String name) throws GameNotFoundException;
	List<Games> findByAgeGroup(int age) throws GameNotFoundException;
	List<Games> findByType(String type) throws GameNotFoundException;
	List<Games> findByPrice(double price) throws GameNotFoundException;
	
	Games findById(int gameId) throws IdNotFoundException;
}
