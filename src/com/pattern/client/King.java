package com.pattern.client;

import com.pattern.behavior.SwordBehavior;

public class King extends Character{
	public King() {
		this.setWeaponBehavior(new SwordBehavior());
	}

	@Override
	public void fight() {
		System.out.println("King Fighting!!!");
		this.getWeaponBehavior().useWeapon();
	}
}
