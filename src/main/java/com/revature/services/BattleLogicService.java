package com.revature.services;

import com.revature.models.Paladin;
import com.revature.models.Wizard;

public class BattleLogicService {
	// TODO: Add BattleLogic
	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		Paladin p1 = new Paladin();

		System.out.println(w1.getCharacterType());
		System.out.println(w1.getMagicAttack());
		w1.setMagicAttack(200);
		System.out.println(w1.getMagicAttack());


		System.out.println(p1.getCharacterType());
		System.out.println(p1.getMagicAttack());
		p1.setMagicAttack(50);
		System.out.println(p1.getMagicAttack());

		
		
		
	}
}
