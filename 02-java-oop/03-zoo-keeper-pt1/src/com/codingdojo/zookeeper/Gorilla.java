package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public int throwSomething() {
		System.out.println("The gorilla throws something...");
		int energy = getEnergy();
		setEnergy(energy - 5);
		System.out.println(getEnergy());
		return getEnergy();
	}
	
	public int eatBananas() {
		System.out.println("The gorilla eats some bananas...");
		int energy = getEnergy();
		setEnergy(energy + 10);
		System.out.println(getEnergy());
		return getEnergy();
	}
	
	public int climb() {
		System.out.println("The gorilla climbs a tree...");
		int energy = getEnergy();
		setEnergy(energy - 10);
		System.out.println(getEnergy());
		return getEnergy();
	}
}
