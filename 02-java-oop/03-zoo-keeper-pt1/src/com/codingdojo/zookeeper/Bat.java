package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		setEnergy(300);
	}
	
	public int fly() {
		System.out.println("The bat takes off into the air...");
		int energy = getEnergy();
		setEnergy(energy - 50);
		System.out.println(getEnergy());
		return getEnergy();
	}
	
	public int eatHumans() {
		System.out.println("The giant bat eats some humans...");
		int energy = getEnergy();
		setEnergy(energy + 25);
		System.out.println(getEnergy());
		return getEnergy();
	}
	
	public int attackTown() {
		System.out.println("The bat attacks the town...");
		int energy = getEnergy();
		setEnergy(energy - 100);
		System.out.println(getEnergy());
		return getEnergy();
	}
	
}
