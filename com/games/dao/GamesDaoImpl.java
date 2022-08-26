package com.games.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.games.exceptions.GameNotFoundException;
import com.games.exceptions.IdNotFoundException;
import com.mobilegames.model.Games;
@Component
public class GamesDaoImpl implements IgamesDAO {

	public GamesDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Games> findall() throws GameNotFoundException {
		return displayAllGames();
	}

	public List<Games> findByTitle(String name) throws GameNotFoundException {
		return displayAllGames().stream().filter(title ->title.getTitle().equals(name)).collect(Collectors.toList());
	}

	public List<Games> findByAgeGroup(int age) throws GameNotFoundException {
		return displayAllGames().stream().filter(game ->game.getAgeGroup() == age).collect(Collectors.toList());
	}

	public List<Games> findByType(String type) throws GameNotFoundException {
		return displayAllGames().stream().filter(game ->game.getType().equals(type)).collect(Collectors.toList());
	}

	public List<Games> findByPrice(double price) throws GameNotFoundException {
		return displayAllGames().stream().filter(game ->game.getPrice() == price).collect(Collectors.toList());
	}
	

	public Games findById(int gameId) throws IdNotFoundException {
		Optional<Games> gamesId = displayAllGames().stream().filter(game -> game.getGameId() == gameId ).findFirst();
		if (gamesId.isPresent()) {
			return gamesId.get();
		}
		return null;
	}
	//(action,block,arcade)
	private List<Games> displayAllGames(){
		return Arrays.asList(new Games("pubg", 16, 101, "action", 100),
				new Games("patta", 24, 102, "arcade", 150),
				new Games("candy crush", 10, 103, "block", 300),
				new Games("snake", 10, 105, "block", 50),
				new Games("sudoku", 18, 104, "arcade", 250));
	}

}
