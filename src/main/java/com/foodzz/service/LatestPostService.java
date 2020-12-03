package com.foodzz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodzz.entity.Recipe;
import com.foodzz.repositories.RecipeRepo;

@Service
public class LatestPostService {

	@Autowired
	private RecipeRepo recipeRepo;

	public Optional<List<Recipe>> getLatestPost() {

		List<Recipe> allRecipe = recipeRepo.findAll();
		if (allRecipe.size() >= 6) {
			allRecipe = allRecipe.subList(0, 6);
			return Optional.of(allRecipe);
		} else {
			return Optional.empty();
		}

	}

}
