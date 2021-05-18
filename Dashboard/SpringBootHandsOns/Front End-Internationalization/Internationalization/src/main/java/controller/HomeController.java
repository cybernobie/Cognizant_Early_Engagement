package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Customer;

@Controller
public class HomeController {

	@RequestMapping("/getdetails")
	public String home(@ModelAttribute("customer") Customer obj) {

		return "home";
	}

}
