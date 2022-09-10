package com.revature.models;

import java.util.Objects;

public class Monster {
	
	private int health;

	public Monster() {
		super();
	}

	public Monster(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public int hashCode() {
		return Objects.hash(health);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monster other = (Monster) obj;
		return health == other.health;
	}

	@Override
	public String toString() {
		return "Monster [health=" + health + "]";
	}

}
