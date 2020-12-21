package com.human;

public class HumanTest {

	public static void main(String[] args) {
		Human Bordeu = new Human();
		Human Foley = new Human();
		Foley.attack(Bordeu);
		System.out.println(Bordeu.getHealth());

	}

}
