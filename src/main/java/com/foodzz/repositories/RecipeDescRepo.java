package com.foodzz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodzz.entity.RecipeDescription;
@Repository
public interface RecipeDescRepo extends JpaRepository<RecipeDescription, Long> {

}
