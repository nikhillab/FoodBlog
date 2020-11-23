package com.foodzz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.foodzz.dao.UserDao;
import com.foodzz.form.UserForm;
import com.foodzz.service.ValidateUser;

@Controller
public class FormController {

	@Autowired
	private ValidateUser validate;

	@Autowired
	private UserDao userDao;

	@RequestMapping(value="/userForm",method = RequestMethod.GET)
	public String customerForm(@RequestParam(defaultValue = "Registration") String title, Model model) {
		model.addAttribute("userForm", new UserForm());
		model.addAttribute("title", title);
		return "RegistationForm";
	}

	@RequestMapping(value = "/validForm", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute UserForm userForm, BindingResult theBindingResult,
			@RequestParam(defaultValue = "Registration") String title, Model model) {

		if (theBindingResult.hasErrors()) {
			model.addAttribute("title", title);
			return "RegistationForm";

		}

		final String message = validate.validateNewUser(userForm);
		if (message.length() > 0)
			return "redirect:/userForm?message=" + message;
		
		userDao.saveUser(userForm);

		return "redirect:/login";
	}

	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login(@RequestParam(defaultValue = "Login") String title, Model model) {
		model.addAttribute("title", title);
		return "Login";
	}

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trimmerEditor);
	}
}
