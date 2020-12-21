package com.human;

public class HumanTest {

	public static void main(String[] args) {
		Human Bordeu = new Human();
		Human Foley = new Human();
		Foley.attack(Bordeu);
		System.out.println(Bordeu.getHealth());
		Wizard Gandalf = new Wizard();
		Ninja KeanuReeves = new Ninja();
		Samurai JohnWick = new Samurai();
		Gandalf.heal(Gandalf);
		System.out.println("Gandalf has"+ Gandalf.getHealth() + "Health");
		Gandalf.fireball(JohnWick);
		System.out.println(JohnWick.getHealth());
		KeanuReeves.steal(JohnWick);
		System.out.println(KeanuReeves.getHealth());
		KeanuReeves.runAway();
		System.out.println(KeanuReeves.getHealth());
		JohnWick.deathBlow(Gandalf);
		JohnWick.meditate();
		JohnWick.howMany();
		System.out.println(KeanuReeves.getHealth());
		System.out.println(JohnWick.getHealth());
		System.out.println(Gandalf.getHealth());
	}

}
