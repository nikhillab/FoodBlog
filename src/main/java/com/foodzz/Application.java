package com.foodzz;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.foodzz.entity.Recipe;
import com.foodzz.service.PostService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	PostService lat;

	@Override
	public void run(String... args) throws Exception {
		Optional<List<Recipe>> latestPost = lat.getLatestPost();
		if(latestPost.isPresent())
			System.out.println(latestPost.get().get(1).getUserRecipe());
		else
			System.out.println("no->>>>>>>>>>>>>>>>>");
	}

	
}
