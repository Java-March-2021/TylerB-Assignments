package com.codingdojo.objectmaster;

public class Wizard extends Human{
	
	public Wizard() {
		setHealth(50);
		setIntelligence(8);
	}
	
	public void heal(Human h) {
		h.health += this.intelligence;
		System.out.println("The wizard heals the human by " + this.intelligence);
		System.out.println("The human's health is now " + h.health);
	}
	
	public void fireball(Human h) {
		int damage = this.intelligence * 3;
		h.health -= damage;
		System.out.println("The wizard casts fireball. The human's health is now " + h.health);
	}
	
	
}
