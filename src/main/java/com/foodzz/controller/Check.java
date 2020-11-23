package com.foodzz.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.foodzz.entity.Recipe;

@Controller
public class Check {

	@RequestMapping(path = "/c", method = RequestMethod.GET)
	public String home(Model model) {
		Recipe recipe = Recipe.getRecipe();
		System.out.println(recipe);
		System.out.println(recipe.getRecipeDescription());
		System.out.println(recipe.getRecipeTagsList());
		List<String> recipeInigredientsList = recipe.getRecipeInigredientsList();
		System.out.println(recipeInigredientsList);
		model.addAttribute("title", recipe.getRecipeName());
		model.addAttribute("recipe", recipe);
		return "ShowRecipe";
	}

	


}
