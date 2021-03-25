package com.codingdojo.objectmaster;

public class InteractionTest {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Ninja n = new Ninja();
		Samurai s = new Samurai();
		Samurai sam = new Samurai();
		Human h = new Human();
		w.heal(h);
		w.fireball(h);
		n.steal(h);
		n.runAway();
		s.deathBlow(h);
		s.meditate();
		sam.howMany();
	}
}
