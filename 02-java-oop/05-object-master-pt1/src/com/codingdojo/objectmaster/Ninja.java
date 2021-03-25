package com.codingdojo.objectmaster;

public class Ninja extends Human{
	
	public Ninja() {
		setStealth(10);
	}
	
	public void steal(Human h) {
		h.health -= this.stealth;
		this.health += this.stealth;
		System.out.println("The ninja steals " + this.stealth + " health from the human");
		System.out.println("The ninja's health is now " + this.health);
		System.out.println("The humans's health is now " + h.health);
	}
	
	public void runAway() {
		this.health -= 10;
		System.out.println("The ninja retreats and loses 10 health. His health is now " + this.health);
		
	}
}
