package com.foodzz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodzz.dao.RecipeDao;
import com.foodzz.entity.Recipe;
import com.foodzz.form.RecipeForm;

@Service
public class DaoService {

	private RecipeForm recipeForm = null;
	private String recipePicName = null;
	private Long userId = null;

	@Autowired
	private RecipeDao recipeDao;

	public int saveRecipe() {
		int recipeId=0;
		if (!(this.recipeForm == null && this.recipePicName == null)) {
			  recipeId = recipeDao.saveRecipe(recipeForm, recipePicName,userId);
			 
		}
		return recipeId;
	}

	public void saveRecipeForm(final RecipeForm recipeForm, final long userId) {
		if (this.recipeForm == null) {
			this.recipeForm = recipeForm;
		}
		if (this.userId == null) {
			this.userId = new Long(userId);
		}
	}

	public void saveRecipePhotos(final String name) {
		if (this.recipePicName == null) {
			this.recipePicName = name;
		}
	}

}
