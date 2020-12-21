package com.human;

public class Samurai extends Human{
	private static int counter;
	public Samurai() {
		super.health = 200;
		counter ++;
	}
	
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth(health / 2);
	}
	public void meditate() {
		int healing = this.health / 2;
		this.setHealth(health += healing);
	}
	public int howMany() {
		System.out.println("There are" + counter + "Samurai.");
		return counter;
	}
}
