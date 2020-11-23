package com.foodzz.form;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;
@Component
public class LoginUser {
	@NotNull
	private String name;
	@NotNull
	private String password;

	public LoginUser() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("LoginUser [name=%s, password=%s]", name, password);
	}

}
