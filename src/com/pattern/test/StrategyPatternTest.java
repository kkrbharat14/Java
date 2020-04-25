package com.pattern.test;

import com.pattern.behavior.AxeBehavior;
import com.pattern.client.King;
import com.pattern.client.Knight;
import com.pattern.client.Queen;
import com.pattern.client.Troll;

public class StrategyPatternTest {
	public static void main(String[] args) {
		King king = new King();
		king.fight();
		Queen queen = new Queen();
		queen.fight();
		Knight knight = new Knight();
		knight.fight();
		Troll troll = new Troll();
		troll.fight();
	
		//Capability to change Weapon Behavior at Runtime
		king.setWeaponBehavior(new AxeBehavior());
		king.fight();
	}
}
