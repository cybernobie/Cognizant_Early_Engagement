package com.controller;

import com.model.*;
import com.validate.CustomValidator;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

	@Autowired
	private CustomValidator custValidator;

	@RequestMapping(value = "/registerPage", method = RequestMethod.GET)
	public String registerPage(@ModelAttribute("register") RegistrationBean registrationBean, BindingResult result) {

		return "registrationpage";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String performRegistration(@Valid @ModelAttribute("register") RegistrationBean registrationBean,
			BindingResult result) {

		// Calling the validate method of custValidator
		custValidator.validate(registrationBean, result);

		// Redirecting to the same page if invalid
		if (result.hasErrors()) {
			return "registrationpage";
		}

		return "thankyou";
	}
}
