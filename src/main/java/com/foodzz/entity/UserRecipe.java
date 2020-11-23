package com.foodzz.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserRecipe {

	@Id
	private Long userId;

	@OneToMany(mappedBy = "userRecipe",fetch = FetchType.EAGER)
	private List<Recipe> recipeList = new ArrayList<>();

	private UserRecipe() {
	}

	public UserRecipe(Long userId) {
		this.userId = userId;
	}

	public void addRecipe(Recipe recipe) {
		this.recipeList.add(recipe);

	}

	public void deleteRecipe(Long id) {
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<Recipe> getUserRecipe() {
		return recipeList;
	}

	public void setUserRecipe(List<Recipe> userRecipe) {
		this.recipeList = userRecipe;
	}

	@Override
	public String toString() {
		return String.format("UserRecipe [userId=%s, userRecipe=%s]", userId, recipeList.size());
	}

}
