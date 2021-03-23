package com.codingdojo.zookeeper;

public class Mammal {
	private int energyLevel;
	
	public int getEnergy() {
		return energyLevel;
	}
	public void setEnergy(int energy) {
		this.energyLevel = energy;
	}
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int displayEnergy() {
		return this.energyLevel;
	}
}
