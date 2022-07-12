package com.examplelearnspring.springdemo1.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole {
	public void up() {
		System.out.println(" up ");
	}
	public void down() {
		System.out.println(" down ");
	}
	public void right() {
		System.out.println(" right ");
	}
	public void left() {
		System.out.println(" left ");
	}

}
