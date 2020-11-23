package com.foodzz.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodzz.entity.UserDescription;
import com.foodzz.entity.UserRecipe;
import com.foodzz.entity.Users;
import com.foodzz.repositories.UserDescriptionRepo;
import com.foodzz.repositories.UserRecipeRepo;
import com.foodzz.repositories.UsersRepo;

@Service
public class UserService {

	@Autowired
	private UsersRepo usersRepo;
	@Autowired
	private UserDescriptionRepo descriptionRepo;
	@Autowired
	private UserRecipeRepo userRecipeRepo;

	public Optional<UserDescription> getUserDetails(final String username) {
		Optional<Users> user = usersRepo.findById(username);
		if (user.isPresent()) {
			UserDescription userDescription = descriptionRepo.findByUser(user.get());
			Optional<UserDescription> optional = Optional.ofNullable(userDescription);
			return optional;
		} else
			return Optional.ofNullable(null);
	}

	public Optional<UserRecipe> getUsersRecipe(final long userId) {
		Optional<UserRecipe> recipeList = userRecipeRepo.findById(userId);
		if (recipeList.isPresent()) {
			UserRecipe userRecipe = recipeList.get();
			Optional<UserRecipe> ofNullable = Optional.ofNullable(userRecipe);
			
			return ofNullable;
		}

		return Optional.ofNullable(null);

	}

}
