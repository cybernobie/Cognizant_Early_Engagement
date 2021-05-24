package com.cognizant.bmi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.bmi.bean.User;
import com.cognizant.bmi.service.BMIService;

@Controller
public class BMIController {
	@Autowired
	private BMIService bmiService;

	@RequestMapping(value = "/bmiForm", method = RequestMethod.GET)
	public String showBMIForm(@ModelAttribute("user") User user) {
		return "bmiCalculatorForm";
	}

	@RequestMapping(value = "/getBMI", method = RequestMethod.GET)
	public String getBMIStatus(@ModelAttribute("user") @Valid User user, BindingResult result, ModelMap map) {
		if (result.hasErrors()) {
			return "bmiCalculatorForm";
		}
		
		User user1 = bmiService.addUserDetails(user);
		double bmi = bmiService.calculateBMI(user1);
		String bmiStatus = bmiService.getBMIStatus(bmi);
		
		map.addAttribute("user", user1);
		map.addAttribute("bmi", bmi);
		map.addAttribute("bmiStatus", bmiStatus);
		
		return "bmiStatus";
	}

	@ModelAttribute("genderList")
	public List<String> populateGenderList() {
		return bmiService.genderType;
	}
}