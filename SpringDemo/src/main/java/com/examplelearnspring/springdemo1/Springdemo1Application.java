package com.examplelearnspring.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.examplelearnspring.springdemo1.game.GameRunner;

@SpringBootApplication
public class Springdemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Springdemo1Application.class, args);
		//MarioGame, RunnerGame
		GameRunner runner = context.getBean(GameRunner.class);
		//MarioGame game = new MarioGame();
		//GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
