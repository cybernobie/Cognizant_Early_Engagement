package controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Customer;

@Controller
public class HomeController {
    
    @ModelAttribute("customer")
	public Customer customer()
	{
		return new Customer();
	}
	
	@RequestMapping(value = "/getdetails", method = RequestMethod.GET)
	public String home(@ModelAttribute("customer") Customer obj) {
	
		return "home";
	}
	

}
