package com.pattern.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		useBowAndArrow();	
	}
	
	private void useBowAndArrow() {
		System.out.println("BowAndArrow! BowAndArrow! BowAndArrow!");
	}

}
