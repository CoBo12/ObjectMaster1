package com.human;

public class Wizard extends Human {
	public Wizard() {
		super.health = 50;
		super.intelligence = 8;
	}
	
	public void heal(Human target) {
		target.setHealth(health + this.intelligence); 
	}
	
	public void fireball(Human target) {
		int damage = this.intelligence * 3;
		target.setHealth(health - damage);
	}
}
