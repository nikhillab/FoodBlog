package com.foodzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//@Autowired RecipeRepo rr;
	@Override
	public void run(String... args) throws Exception {
//			Optional<Recipe> findById = rr.findById(28);
//			if(findById.isPresent())
//				System.out.println(findById.get());
		 	
	}

}
