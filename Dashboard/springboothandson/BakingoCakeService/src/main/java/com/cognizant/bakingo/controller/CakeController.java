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
	public String showCakeOrder(@ModelAttribute("cake") Cake cake) {
		return "placeOrder";
	}
	
	@RequestMapping(value = "/orderStatus", method = RequestMethod.POST) 
	public String getOrderStatus(@Valid @ModelAttribute("cake") Cake cake, BindingResult result, ModelMap map) {
		if (result.hasErrors()) {
			return "placeOrder";
		}
		
		int flavorRate = cakeService.flavorList.get(cake.getFlavor());
		int selectedCake = cake.getSelectedcake();
		int candlesPrice = cake.getIncludeCandles() == null ? 0 : cake.getIncludeCandles();
		int incriptionPrice = cake.getIncludeinscription() == null ? 0 : cake.getIncludeinscription();
		double price = selectedCake + flavorRate + candlesPrice + incriptionPrice;
		
		cake.setPrice(price);
		
		double indianPrice = price * 75.0;
		int orderId = cakeService.addOrder(cake);
		
		map.addAttribute("cake", cake);
		map.addAttribute("indianPrice", indianPrice);
		map.addAttribute("orderId", orderId);
		map.addAttribute("orderDate", new Date().toString());
		
		return orderId >= 100 ? "orderStatus" : "placeOrder";
	}
	
	@ModelAttribute("flavorList")
	public Set<String> populateFillingList() {
		return cakeService.flavorList.keySet();
	}
}
