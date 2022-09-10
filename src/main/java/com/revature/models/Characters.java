package com.revature.models;

import java.util.Objects;

public class Characters {
	
	private int physicalAttack = 100;
	private int agilityAttack = 100;
	private int magicAttack = 100;
	private int health = 100;
	
	public Characters() {
		super();
	}

	public int getPhysicalAttack() {
		return physicalAttack;
	}

	public void setPhysicalAttack(int physicalAttack) {
		this.physicalAttack = physicalAttack;
	}

	public int getAgilityAttack() {
		return agilityAttack;
	}

	public void setAgilityAttack(int agilityAttack) {
		this.agilityAttack = agilityAttack;
	}

	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public int hashCode() {
		return Objects.hash(agilityAttack, health, magicAttack, physicalAttack);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Characters other = (Characters) obj;
		return agilityAttack == other.agilityAttack && health == other.health && magicAttack == other.magicAttack
				&& physicalAttack == other.physicalAttack;
	}

	@Override
	public String toString() {
		return "Characters [physicalAttack=" + physicalAttack + ", agilityAttack=" + agilityAttack + ", magicAttack="
				+ magicAttack + ", health=" + health + "]";
	}
	
	
}
