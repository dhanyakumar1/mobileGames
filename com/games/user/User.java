package com.games.user;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.games.exceptions.GameNotFoundException;
import com.games.exceptions.IdNotFoundException;
import com.games.service.GamesServiceImpl;
import com.games.service.IGamesService;

public class User {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.games");
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		IGamesService gamesService = context.getBean(GamesServiceImpl.class,"GamesServiceImpl");
		
		try {
			gamesService.getall().forEach(System.out::println);
			
			System.out.println();
			gamesService.getByTitle("snake").forEach(System.out::println);
			
			System.out.println();
			gamesService.getByType("action").forEach(System.out::println);
			
			System.out.println();
			gamesService.getByAgeGroup(16).forEach(System.out::println);
			
			System.out.println();
			gamesService.getByPrice(250).forEach(System.out::println);
			
			System.out.println();
			System.out.println(gamesService.getById(102));
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (GameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
