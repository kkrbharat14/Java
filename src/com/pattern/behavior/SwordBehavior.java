package com.pattern.behavior;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		useSword();
	}
	
	private void useSword() {
		System.out.println("Sword! Sword! Sword!");
	}

}
