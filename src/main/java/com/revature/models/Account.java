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
	}
	public Account(int userId, String username, String userPwd) {
		this.userId = userId;
		this.username = username;
		this.userPwd = userPwd;
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
	@Override
	public int hashCode() {
		return Objects.hash(userId, userPwd, username);
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
		return userId == other.userId && Objects.equals(userPwd, other.userPwd)
				&& Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "Account [userId=" + userId + ", username=" + username + ", userPwd=" + userPwd + "]";
	}
	
	
}
