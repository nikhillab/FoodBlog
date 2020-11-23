package com.foodzz.dao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodzz.entity.Recipe;
import com.foodzz.entity.RecipeDescription;
import com.foodzz.entity.UserRecipe;
import com.foodzz.form.RecipeForm;
import com.foodzz.repositories.RecipeDescRepo;
import com.foodzz.repositories.RecipeRepo;
import com.foodzz.repositories.UserDescriptionRepo;
import com.foodzz.repositories.UserRecipeRepo;

@Component
public class RecipeDao {

	@Autowired private RecipeRepo recipeRepo;
	@Autowired private RecipeDescRepo descRepo;
	@Autowired private UserRecipeRepo  userRecipeRepo;
	private Recipe recipe = new Recipe();

	public Recipe saveRecipe(final RecipeForm recipeForm, final String photosName ,final Long userId) {

		this.recipe.setRecipeName(recipeForm.getTitle());

		this.recipe.setRecipeTagsList(Arrays.asList(recipeForm.getTags().split("#")));

		// saving recipe description
		final RecipeDescription saveRecipeDescription = saveRecipeDescription(
				new RecipeDescription(Integer.valueOf(recipeForm.getTime()), recipeForm.getProcess(),
						recipeForm.getSummary(), recipeForm.getServes()));

		this.recipe.setRecipeDescription(saveRecipeDescription);

		this.recipe.setRecipeInigredientsList(Arrays.asList(recipeForm.getIngredents().split(",")));

		this.recipe.setRecipeType(recipeForm.getType());

		this.recipe.setRecipePicture(photosName);

		// saving user.
		// set user id to recipe
		this.recipe.setUserRecipe(savedUserRecipe(userId));

		// saving recipe and getting it's id
		Recipe savedRecipe = recipeRepo.save(this.recipe);
		
		return savedRecipe;

	}

	private RecipeDescription saveRecipeDescription(final RecipeDescription recipeDescription) {

		// Start saving recipeDescription

		RecipeDescription savedDescp = descRepo.save(recipeDescription);

		// return description id
		return savedDescp;

	}

	private UserRecipe savedUserRecipe(final Long userId) {

		UserRecipe userRecipe = userRecipeRepo.save(new UserRecipe(userId));

		return userRecipe;

	}

}
