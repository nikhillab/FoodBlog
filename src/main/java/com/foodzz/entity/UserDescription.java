package com.foodzz.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserDescription {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long userId;
	private String firstName;
	private String lastName;
	private String gender;
	private String continents;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Users user;

	private  UserDescription() {
	}
	
	

	public UserDescription(String firstName, String lastName, String gender, String continents) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.continents = continents;
	}



	public Long getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContinents() {
		return continents;
	}

	public void setContinents(String continents) {
		this.continents = continents;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	
}
