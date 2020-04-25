package com.pattern.client;

import com.pattern.behavior.WeaponBehavior;

public abstract class Character {

	private WeaponBehavior weaponBehavior;

	public abstract void fight();

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

	public WeaponBehavior getWeaponBehavior() {
		return weaponBehavior;
	}
}
