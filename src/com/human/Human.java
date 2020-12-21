package com.human;

public class Human {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	
	
	
	public void attack(Human target) {
		
		target.setHealth(health - this.strength);
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
}
