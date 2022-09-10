package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "Playerprofile")
public class Playerprofile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int playerId;
	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	@JsonBackReference
	private Account account;
	@Column
	private String character;
	@ManyToOne
	@JoinColumn(name = "city", referencedColumnName = "city")
	@JsonBackReference
	private Weather weather;
	@Column
	private int silver;
	
	public Playerprofile() {
		super();
	}

	public Playerprofile(int playerId, Account account, String character, Weather weather, int silver) {
		super();
		this.playerId = playerId;
		this.account = account;
		this.character = character;
		this.weather = weather;
		this.silver = silver;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	public int getSilver() {
		return silver;
	}

	public void setSilver(int silver) {
		this.silver = silver;
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, character, playerId, silver, weather);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Playerprofile other = (Playerprofile) obj;
		return Objects.equals(account, other.account) && Objects.equals(character, other.character)
				&& playerId == other.playerId && silver == other.silver && Objects.equals(weather, other.weather);
	}

	@Override
	public String toString() {
		return "Playerprofile [playerId=" + playerId + ", account=" + account.getUsername() + ", character=" + character
				+ ", weatherCity=" + weather.getCity() + ", silver=" + silver + "]";
	}
	
	
	
	
}
