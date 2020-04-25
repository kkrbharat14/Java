package com.pattern.client;

import com.pattern.behavior.AxeBehavior;

public class Knight extends Character {
	
	public Knight() {
		this.setWeaponBehavior(new AxeBehavior());
	}

	@Override
	public void fight() {
		System.out.println("Knight Fighting!!!");
		this.getWeaponBehavior().useWeapon();
	}

}
