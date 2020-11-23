package com.foodzz.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.foodzz.entity.UserDescription;
import com.foodzz.entity.Users;
import com.foodzz.form.UserForm;
import com.foodzz.repositories.UserDescriptionRepo;
import com.foodzz.repositories.UsersRepo;

@Component
public class UserDao {

	@Autowired
	private UsersRepo usersRepo;
	@Autowired
	private UserDescriptionRepo descriptionRepo;
	@Autowired
	private JdbcTemplate template;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public void saveUser(final UserForm userForm) {
		final Users saveUser = saveUser(userForm.getEmail(), passwordEncoder.encode(userForm.getPassword()));

		UserDescription userDescription = new UserDescription(userForm.getFirstName(), userForm.getLastName(),

				userForm.getGender(), userForm.getContinents());
		userDescription.setUser(saveUser);

		final UserDescription savedUser = descriptionRepo.save(userDescription);

		System.out.println(savedUser.getUserId() + "User is ->" + savedUser.getUser().getUsername());

	}
	private Users saveUser(final String username, final String password) {
		final Users user = new Users(username, password, 1);
		final Users savedUser = usersRepo.save(user);
		usersRepo.flush();
		template.execute("insert into authorities values('" + savedUser.getUsername() + "','ROLE_USER')");
		return savedUser;
	}


	public UserDao() {
	}

}
