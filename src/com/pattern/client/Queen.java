package com.pattern.client;

import com.pattern.behavior.BowAndArrowBehavior;

public class Queen extends Character {
	public Queen() {
		this.setWeaponBehavior(new BowAndArrowBehavior());
	}

	@Override
	public void fight() {
		System.out.println("Queen Fighting!!!");
		this.getWeaponBehavior().useWeapon();
	}
}
