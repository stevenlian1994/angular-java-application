package com.example.demo.entitites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String email;
	private String username;
	
	public User() {
		this.email = "";
		this.username = "";	
	}
	public User(String email, String username) {
		this.email = email;
		this.username = username;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + username + ", email=" + email + '}';
    }
	
}
