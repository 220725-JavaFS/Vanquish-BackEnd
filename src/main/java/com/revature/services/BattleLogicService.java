package com.revature.services;

import com.revature.models.Paladin;
import com.revature.models.Wizard;

public class BattleLogicService {
	// TODO: Add BattleLogic
	// Run as Java Application on BattleLogic to test
	
	
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
	
	
	Double damage = 0.00;
	
	public int getRandomNumber() {
		int min = 1;
		int max = 20;
	    return (int) ((Math.random() * (max - min)) + min);
	}
	
	private Double doPhysDmg(Double weatherMod, Double physMod) {
		int roll = getRandomNumber();		
		Double rollMath;
		rollMath = Double.valueOf(roll);
		damage = (rollMath * weatherMod)*physMod;
		return damage;
	}
	
	private Double doMagicDmg(Double weatherMod, Double magicMod) {
		int roll = getRandomNumber();
		Double rollMath;
		rollMath = Double.valueOf(roll);
		damage = (rollMath * weatherMod)*magicMod;
		return damage;
	}
	private Double doMonsterDmg(Double weatherMod) {
		int roll = getRandomNumber();
		Double rollMath;
		rollMath = Double.valueOf(roll);
		damage = (rollMath * weatherMod);
		return damage;
	}
}
