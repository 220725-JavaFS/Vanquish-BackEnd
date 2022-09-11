package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int userId;
	@Column(unique = true,nullable = false)
	private String username;
	@Column(nullable = false)
	private String userPwd;
	@Column
	private String city;
	@Column
	private String character;
	@Column
	private int silver;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int userId, String username, String userPwd, String city, String character, int silver) {
		this.userId = userId;
		this.username = username;
		this.userPwd = userPwd;
		this.city = city;
		this.character = character;
		this.silver = silver;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public int getSilver() {
		return silver;
	}
	public void setSilver(int silver) {
		this.silver = silver;
	}
	@Override
	public int hashCode() {
		return Objects.hash(character, city, silver, userId, userPwd, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(character, other.character) && Objects.equals(city, other.city) && silver == other.silver
				&& userId == other.userId && Objects.equals(userPwd, other.userPwd)
				&& Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "Account [userId=" + userId + ", username=" + username + ", userPwd=" + userPwd + ", city=" + city
				+ ", character=" + character + ", silver=" + silver + "]";
	}
	
	
}
