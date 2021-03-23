package com.codingdojo.zookeeper;

public class BatTest {
	public static void main(String[] args) {
		Bat b = new Bat();
		System.out.println(b.getEnergy());
		b.attackTown();
		b.attackTown();
		b.attackTown();
		b.eatHumans();
		b.eatHumans();
		b.fly();
		b.fly();
	}
}
