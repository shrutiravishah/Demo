package com.examplelearnspring.springdemo1.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	@Autowired
	private GamingConsole game;
	/*Using Constructor
	  	public GameRunner(GamingConsole game) {
	  	System.out.println("Using Constructor!");
		this.game = game;
	}*/
	
	/*Using setters
	public void setGame(GamingConsole game) {
		System.out.println("Using Setter!");
		this.game = game;
	}*/
	//run game method
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}


	

}
