package com.foodzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Cont {

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String home(@RequestParam(defaultValue = "Home") String title, Model model) {
		return "Home";
	}

}
