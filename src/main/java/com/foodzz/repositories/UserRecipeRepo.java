package com.foodzz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodzz.entity.UserRecipe;

@Repository
public interface UserRecipeRepo extends JpaRepository<UserRecipe, Long> {

}
