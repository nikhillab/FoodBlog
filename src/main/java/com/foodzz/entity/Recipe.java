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
