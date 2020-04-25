package com.pattern.behavior;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		useAxe();
	}

	private void useAxe() {
		System.out.println("Axe! Axe! Axe!");
	}
}
