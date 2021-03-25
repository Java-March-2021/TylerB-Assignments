package com.codingdojo.objectmaster;

public class Samurai extends Human{
	private static int counter;
	
	public Samurai() {
		setHealth(200);
		counter++;
	}
	
	public void deathBlow(Human h) {
		h.health -= h.health;
		int half = this.health / 2;
		this.health -= half;
		System.out.println("The samurai delivers a death blow to the human. But the Samurai's health is now " + this.health);
	}
	
	public void meditate() {
		int heal = this.health / 2;
		this.health += heal;
		System.out.println("The samurai meditates and heals by " + heal + " for a total health of " + this.health);
	}
	
	public void howMany() {
		System.out.println(counter);
	}
}
