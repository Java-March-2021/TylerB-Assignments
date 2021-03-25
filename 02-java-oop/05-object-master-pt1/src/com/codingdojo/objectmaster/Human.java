package com.codingdojo.objectmaster;

public class Human {
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	
	Human(){
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int str) {
		this.strength = str;
	}
	
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stl) {
		this.stealth = stl;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intel) {
		this.intelligence = intel;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int attack(int otherHealth) {
		System.out.println("Human 1 attacks another human");
		int strength = getStrength();
		int newHealth = otherHealth - strength;
		System.out.println("Human 1 reduces Human 2's health by " + strength);
		return newHealth;
	}
}
