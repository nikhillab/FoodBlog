package com.foodzz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.foodzz.entity.Recipe;
import com.foodzz.repositories.RecipeRepo;

@Controller

public class ShowRecipe {

	@Autowired
	private RecipeRepo recipeRepo;

	@RequestMapping(path = "/c/{recipeId}", method = RequestMethod.GET)
	public String home(@PathVariable int recipeId, Model model) {
		Optional<Recipe> recipeById = recipeRepo.findById(recipeId);
		if (recipeById.isPresent()) {
			Recipe recipe = recipeById.get();
			String[] pictures = recipe.getRecipePicture().split(",");
			model.addAttribute("title", recipe.getRecipeName());
			model.addAttribute("pictures", pictures);
			model.addAttribute("recipe", recipe);
		}

		return "ShowRecipe";
	}

}
