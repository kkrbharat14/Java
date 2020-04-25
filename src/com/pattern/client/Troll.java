package com.pattern.client;

import com.pattern.behavior.KnifeBehavior;

public class Troll extends Character {
	
	public Troll() {
		this.setWeaponBehavior(new KnifeBehavior());
	}
	
	@Override
	public void fight() {
		System.out.println("Troll Fighting!!!");
		this.getWeaponBehavior().useWeapon();
	}

}
