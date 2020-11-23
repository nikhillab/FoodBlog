package com.foodzz.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class UserForm {

	@NotNull(message = "First Name is required")
	@Size(min = 1, message = "Minimum 1 character required.")
	private String firstName;

	@NotNull(message = "Last Name is required")
	@Size(min = 1, message = "Minimum 1 character required.")
	private String lastName;

	@NotNull(message = "Email is required")
	@Size(min = 6, message = "Enter a valid email address.")
	private String email;

	@NotNull(message = "Password is required")
	@Size(min = 6, max = 20, message = "Please enter at least 6 charcters.")
	private String password;

	@NotNull(message = "Password is required")
	@Size(min = 6, max = 20, message = "Please enter at least 6 charcters.")
	private String conformPassword;

	@NotNull
	@NotBlank
	private String gender;

	@NotNull
	@NotBlank
	private String continents;

	public UserForm() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConformPassword() {
		return conformPassword;
	}

	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
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

}
