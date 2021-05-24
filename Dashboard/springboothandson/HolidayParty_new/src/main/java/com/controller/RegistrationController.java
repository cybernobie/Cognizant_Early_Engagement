package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.RegistrationBean;
import com.validate.CustomValidator;

@Controller
public class RegistrationController {
    @Autowired
    private	CustomValidator custValidator;

	@RequestMapping("/registerPage")
	public String registerPage(@ModelAttribute("register") RegistrationBean registrationBean, BindingResult result) {

		return "registrationpage";
	}

    @RequestMapping(value = "/register",method = RequestMethod.POST)
	public String performRegistration(@ModelAttribute("register")  RegistrationBean registrationBean,
			BindingResult result/*, ModelMap model*/) {
		custValidator.validate(registrationBean, result);
		if (result.hasErrors()) {
			return "registrationpage";
		}
		/*model.addAttribute("msg", "Thank you " + registrationBean.getUserName() + ".We shall mail the contents to "
				+ registrationBean.getEmailId());*/
	
		return "thankyou";

	}
}
