package com.mobilegames.repository;

import java.util.List;

import com.mobilegames.model.Games;

public interface IGamesRepository {
	void addGames(Games games);
	void updateGames(int gameId, double price);
	void deleteGames(int gameId);
	
	List<Games> findall();
	List<Games> findByTitle(String name);
	List<Games> findByAgeGroup(int age);
	List<Games> findByType(String type);
	List<Games> findByPrice(double price);
	
	Games getById(int gameId);
	
}