package com.examplelearnspring.springdemo1.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println(" jump ");
	}
	@Override
	public void down() {
		System.out.println(" go in the hole ");
	}
	@Override
	public void right() {
		System.out.println(" go fast ");
	}
	@Override
	public void left() {
		System.out.println(" stop ");
	}

}
