package com.revature.models;

import java.util.Objects;

public class Wizard extends Characters{

	private final String characterType = "Wizard";

	public Wizard() {
		super();
	}

	public String getCharacterType() {
		return characterType;
	}

	@Override
	public void setPhysicalAttack(int physicalAttack) {
		// TODO Auto-generated method stub
		super.setPhysicalAttack(physicalAttack);
	}

	@Override
	public void setAgilityAttack(int agilityAttack) {
		// TODO Auto-generated method stub
		super.setAgilityAttack(agilityAttack);
	}

	@Override
	public void setMagicAttack(int magicAttack) {
		// TODO Auto-generated method stub
		super.setMagicAttack(magicAttack);
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(health);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(characterType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wizard other = (Wizard) obj;
		return Objects.equals(characterType, other.characterType);
	}

	@Override
	public String toString() {
		return "Wizard [characterType=" + characterType + ", getPhysicalAttack()=" + getPhysicalAttack()
				+ ", getAgilityAttack()=" + getAgilityAttack() + ", getMagicAttack()=" + getMagicAttack()
				+ ", getHealth()=" + getHealth() + "]";
	}
	
	
	
}
