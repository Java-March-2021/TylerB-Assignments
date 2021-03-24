package com.codingdojo.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Human hOne = new Human();
		Human hTwo = new Human();
		int newHealth = hOne.attack(hTwo.getHealth());
		hTwo.setHealth(newHealth);
		System.out.println("Human 2 new health is " + newHealth);
	}
}
