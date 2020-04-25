package com.pattern.behavior;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		useKnife();
	}
	
	private void useKnife() {
		System.out.println("Knife! Knife! Knife!");
	}

}
