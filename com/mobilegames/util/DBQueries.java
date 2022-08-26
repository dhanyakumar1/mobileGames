package com.mobilegames.util;

public class DBQueries {

	public static final String INSERTQUERY =
			"INSERT INTO GAMES(tital,age_group,type,price) values(?,?,?,?)";
	
	public static final String UPDATEQUERY =
			"UPDATE GAMES SET price=? WHERE game_id=?";
	
	public static final String DELETEQUERY = "DELETE FROM INVESTMENT WHERE game_id=?";
	
	 public static final String SELECTQUERY ="SELECT * FROM GAMES";
	 public static final String SELECTBYTITLE ="SELECT * FROM GAMES WHERE TITAL =?";
	 public static final String SELECTBYAGEGROUP ="SELECT * FROM GAMES WHERE AGEGROUP =?";
	 public static final String SELECTBYTYPE ="SELECT * FROM GAMES WHERE TYPE =?";
	 public static final String SELECTBYPRICE ="SELECT * FROM GAMES WHERE PRICE =?";
	 public static final String SELECTBYID = "SELECT * FROM GAMES WHERE GAMEID=?";
	
	
	
}



