package com.foodzz.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recipeId;
	private String recipeName;
	private String recipePicture;
	private String recipeType;
	@OneToOne
	private RecipeDescription recipeDescription;
	@ElementCollection
	private List<String> recipeInigredientsList = new ArrayList<>();
	@ElementCollection
	private List<String> recipeTagsList = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "users_id", nullable = false)
	private UserRecipe userRecipe;

	public Recipe() {
	}

	public Recipe(int recipeId, String recipeName, String recipePicture, String recipeType,
			RecipeDescription recipeDescription) {
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.recipePicture = recipePicture;
		this.recipeType = recipeType;
		this.recipeDescription = recipeDescription;
	}

	public void addTag(String tag) {
		this.recipeTagsList.add(tag);
	}

	public void addInigredient(String inigredient) {
		this.recipeInigredientsList.add(inigredient);
	}

	public static Recipe getRecipe() {
		Recipe recipe = new Recipe();
		recipe.setRecipeDescription(RecipeDescription.recipeDescription());
		recipe.setRecipeInigredientsList(Arrays.asList("  2 tablespoons paprika  ",
				"2 tablespoons freshly ground black pepper  ", "2 teaspoons garlic powder  ",
				"2 teaspoons dried oregano  ", "1/2 teaspoon cayenne pepper  ", "1 cup buttermilk  ", "1 large egg  ",
				"Kosher salt  ",
				"One whole chicken, about 4 pounds, cut into 10 pieces or 3 1/2 pounds bone-in, skin-on breasts, legs, drumsticks, and/or wings  ",
				"1 1⁄2 cups all-purpose flour  ", "1⁄2 cup cornstarch  ", "1 teaspoon baking powder  ",
				"4 cups vegetable shortening or peanut oil "));
		recipe.setRecipeName("The Food Lab's Southern Fried Chicken Recipe");
		recipe.setRecipePicture("2.jpg");
		recipe.setRecipeTagsList(Arrays.asList("#CoolChiken", "#Chiken"));
		recipe.setRecipeType("chicken fryer");

		return recipe;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipePicture() {
		return recipePicture;
	}

	public void setRecipePicture(String recipePicture) {
		this.recipePicture = recipePicture;
	}

	public String getRecipeType() {
		return recipeType;
	}

	public void setRecipeType(String recipeType) {
		this.recipeType = recipeType;
	}

	public List<String> getRecipeInigredientsList() {
		return recipeInigredientsList;
	}

	public void setRecipeInigredientsList(List<String> recipeInigredientsList) {
		this.recipeInigredientsList = recipeInigredientsList;
	}

	public RecipeDescription getRecipeDescription() {
		return recipeDescription;
	}

	public void setRecipeDescription(RecipeDescription recipeDescription) {
		this.recipeDescription = recipeDescription;
	}

	public List<String> getRecipeTagsList() {
		return recipeTagsList;
	}

	public void setRecipeTagsList(List<String> recipeTagsList) {
		this.recipeTagsList = recipeTagsList;
	}
	
	

	public UserRecipe getUserRecipe() {
		return userRecipe;
	}

	public void setUserRecipe(UserRecipe userRecipe) {
		this.userRecipe = userRecipe;
	}

	@Override
	public String toString() {
		return String.format("Recipe [recipeId=%s, recipeName=%s, recipePicture=%s, recipeType=%s]", recipeId,
				recipeName, recipePicture, recipeType);
	}

}
