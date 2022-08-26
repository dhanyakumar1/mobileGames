package com.mobilegames.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import com.investmentapp.model.Investment;
import com.mobilegames.model.Games;

public class GamesMapper implements RowMapper {

	@Override
	public Games mapRow(ResultSet rs, int rowNum){
		
		Games games = new Games();
		games.setGameId(rs.getInt("game_id"));
		games.setAgeGroup(rs.getInt("age_group"));
		games.setPrice(rs.getDouble("price"));
		games.setType(rs.getString("type"));
		games.setTitle(rs.getString("title"));
		return games;
	}

}


