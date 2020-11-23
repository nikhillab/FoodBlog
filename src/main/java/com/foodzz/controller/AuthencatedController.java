package com.foodzz.controller;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.foodzz.dao.UserDao;
import com.foodzz.entity.UserDescription;
import com.foodzz.entity.UserRecipe;
import com.foodzz.form.RecipeForm;
import com.foodzz.service.DaoService;
import com.foodzz.service.UserService;

@Controller
@RequestMapping("/auth")
@SessionAttributes("userId")
public class AuthencatedController {

	private static String path = System.getProperty("user.dir") + "/uoloads";

	@Autowired
	private DaoService daoService;
	@Autowired
	private UserService userService;

	@RequestMapping("/upload")
	public String uploadRecipe(@RequestParam(defaultValue = "Upload") String title, Model model) {
		model.addAttribute("title", title);
		model.addAttribute("recipeForm", new RecipeForm());
		return "UploadRecipe";
	}

	@RequestMapping(path = "/uploadHandler", method = RequestMethod.POST)
	public String uploadRecipeHandler(@Valid @ModelAttribute RecipeForm recipeForm, BindingResult theBindingResult,
			Model model) {
		if (theBindingResult.hasErrors()) {
			return "redirect:/upload";

		}

		boolean containsAttribute = model.containsAttribute("userId");
		// System.out.println("Attribute is ->>>"+containsAttribute);
		if (containsAttribute) {
			long userId = (long) model.getAttribute("userId");
			// System.out.println(userId);
			daoService.saveRecipeForm(recipeForm, userId);
		}

		return "redirect:/auth/file";
	}

	@RequestMapping("/file")
	public String handleUpload(Model model) {
		return "FileUpload";
	}

	@RequestMapping("/fileupload")
	public String uploadFile(@RequestParam MultipartFile[] files, Model model) {

		StringBuffer photoNames = new StringBuffer();

		for (MultipartFile f : files) {

			System.out.println(f.getOriginalFilename());

			photoNames.append(f.getOriginalFilename() + ",");

			try {

				boolean createNewFile = new File(path + "/" + f.getOriginalFilename()).createNewFile();
				if (createNewFile)
					f.transferTo(new File(path + "/" + f.getOriginalFilename()));

			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
				return "redirect:/file";
			}
		}
		daoService.saveRecipePhotos(photoNames.toString());

		daoService.saveRecipe();

		return "redirect:/c";
	}

	@GetMapping("/user/{username}")
	public String user(@PathVariable String username, Model model) {
		
		Optional<UserDescription> userDetails = userService.getUserDetails(username);

		if (userDetails.isPresent()) {

			System.out.println(userDetails.get().getFirstName());
			model.addAttribute("userDetails", userDetails.get());
			model.addAttribute("userId", userDetails.get().getUserId());
			Optional<UserRecipe> usersRecipe = userService.getUsersRecipe(4l);
			if (usersRecipe.isPresent())
				model.addAttribute("usersRecipe", usersRecipe.get());

		} else
			return "redirect:/login";
		
		return "Userprofile";

	}

}
