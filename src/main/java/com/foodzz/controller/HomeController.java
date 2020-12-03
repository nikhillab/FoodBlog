package com.foodzz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.foodzz.entity.Recipe;
import com.foodzz.service.LatestPostService;
import com.foodzz.service.Offers;

@Controller
public class HomeController {
	@Autowired
	private LatestPostService latestPostService;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home(@RequestParam(defaultValue = "Home") String title, Model model) {
		List<Offers> offerList = Offers.getOfferList();
		model.addAttribute("offerList", offerList);
		model.addAttribute("title", title);
		Optional<List<Recipe>> latestPost = latestPostService.getLatestPost();
		if (latestPost.isPresent())
			model.addAttribute("latestPost", latestPost.get());

		return "Home";
	}

	@RequestMapping("/search")
	public String search(@RequestParam(defaultValue = "nothing") String item, Model model) {
		System.out.println(item);

		return "redirect:/";
	}

}
