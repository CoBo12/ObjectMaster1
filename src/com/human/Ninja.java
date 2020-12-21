package com.human;

public class Ninja extends Human{
	public Ninja() {
		super.stealth = 10;
		
	}
	public void steal(Human target) {
		target.setHealth(health - this.stealth);
		this.setHealth(health + this.stealth);
	}
	
	public void runAway() {
		this.health -= 10;
	}
}
