package com.foodzz.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodzz.entity.Users;
import com.foodzz.form.UserForm;
import com.foodzz.repositories.UsersRepo;

@Service
public class ValidateUser {
	@Autowired
	private UsersRepo usersRepo;

	public String validateNewUser(final UserForm form) {
		StringBuffer message = new StringBuffer();
		Optional<Users> findById = usersRepo.findById(form.getEmail());
		if (findById.isPresent()) {
			message.append("User name already exist.");
		}
		boolean result = validatePassword(form);
		if (!result) {
			message.append(" Please enter password correctly.");
		}
		return message.toString();
	}

	private boolean validatePassword(final UserForm form) {
		return form.getPassword().equals(form.getConformPassword());
	}
}
