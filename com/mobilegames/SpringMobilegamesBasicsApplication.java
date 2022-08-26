package com.mobilegames;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.games.service.IGamesService;

@SpringBootApplication
public class SpringMobilegamesBasicsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringMobilegamesBasicsApplication.class, args);
	}
	
//			iInvestmentService.addInvestment(new Investment("Voya Mutual", 10, PlanType.mutual.type,
	//2000, Purpose.MARRIAGE.name(), Risk.HIGH.name(), Nominee.SON.name(), 10));
	
	@Autowired
	IGamesService gamesService;

	@Override
	public void run(String... args) throws Exception {
		gamesService.
	}
	
}
