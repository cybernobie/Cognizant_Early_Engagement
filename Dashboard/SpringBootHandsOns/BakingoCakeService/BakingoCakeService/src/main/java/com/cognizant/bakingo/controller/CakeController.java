package com.cognizant.bakingo.controller;

import java.util.Date;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.bakingo.bean.Cake;
import com.cognizant.bakingo.service.CakeService;

@Controller
public class CakeController {

	@Autowired
	private CakeService cakeService;

	@RequestMapping(value = "/showCakeOrderForm", method = RequestMethod.GET)
	public String showCakeOrderForm(@ModelAttribute("cake") Cake cake) {

		return "placeOrder";
	}

	@RequestMapping(value = "/orderStatus", method = RequestMethod.POST)
	public String getOrderStatus(@Valid @ModelAttribute("cake") Cake cake, BindingResult result, ModelMap map) {

		// Redirecting to the same form page if invalid
		if (result.hasErrors())
			return "placeOrder";

		// Assigning the flavorRate value of the flavorList map to the cake object's
		// flavorRate value
		cake.setFlavorRate(CakeService.flavorList.get(cake.getFlavor()));

		if (cake.getIncludeCandles() == null)
			cake.setIncludeCandles(0); // To prevent NullPointerException

		if (cake.getIncludeinscription() == null)
			cake.setIncludeinscription(0); // To prevent NullPointerException

		// Calculating cake price
		double price = cake.getSelectedcake() + cake.getFlavorRate() + cake.getIncludeCandles()
				+ cake.getIncludeinscription();

		// Setting cake price value
		cake.setPrice(price);

		// Adding cake object to the orderList map and getting the orderId value
		int orderId = cakeService.addOrder(cake);

		// Adding all the above objects to the ModelMap to make them accessible in the
		// view
		map.addAttribute("cake", cake);
		map.addAttribute("indianPrice", cake.getPrice() * 75);
		map.addAttribute("orderId", orderId);
		map.addAttribute("orderDate", new Date().toString()); // Setting the orderDate object

		// Returning the appropriate view pages based on the given condition
		return orderId >= 1000 ? "orderStatus" : "placeOrder";
	}

	// @ModelAttribute at method level, to pass a model object to the views.
	// In this case, we're passing Set<String> object (populated flavorList set)
	// named "flavorList" to the 'select' tag's (flavor tag's) 'items' attribute
	@ModelAttribute("flavorList")
	public Set<String> populateFillingList() {
		return CakeService.flavorList.keySet();
	}

}
