package com.examplelearnspring.springdemo1.game;

import org.springframework.stereotype.Component;

@Component

public class SuperContraGame implements GamingConsole {
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
