package com.mobilegames.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mobilegames.model.Games;
@Repository
public class GamesRepositoryImpl implements IGamesRepository {
	private JdbcTemplate jdbcTemplate;

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

	@Override
	public List<Games> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Games> findByTitle(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Games> findByAgeGroup(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Games> findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Games> findByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Games getById(int gameId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
