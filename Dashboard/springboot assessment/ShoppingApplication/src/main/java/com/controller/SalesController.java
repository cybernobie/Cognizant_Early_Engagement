package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.SaleProduct;
import com.service.SalesService;


//use appropriate annotation to configure SalesController as Controller
@Controller
public class SalesController {
	
	// fill the code	
	@Autowired
	private SalesService salesService;

	//use appropriate annotation
	
	@RequestMapping(path="/", method = RequestMethod.GET)
	public String salesPage1() {
		return "saleProduct";
	}
	//invoke the service class - calculateDiscountedPrice method.	
	@RequestMapping(path="/saleProduct", method = RequestMethod.GET)
	public String salesPage(@ModelAttribute("saleProductObj") SaleProduct saleProduct) {
		return "saleProduct";
	}
	
	@RequestMapping(path = "/calculateDiscountedPrice",method = RequestMethod.POST)
	public String calculateDiscountedPrice(@Valid @ModelAttribute("saleProductObj") SaleProduct saleProductObj, BindingResult result,
			ModelMap model) {
		if(result.hasErrors()) {
			return "saleProduct";
		}
		double price=salesService.calculateDiscountedPrice(saleProductObj);
		model.addAttribute("price", price);
		model.addAttribute("type",saleProductObj.getProductType());
		model.addAttribute("discount", saleProductObj.getDiscountPercentage());
		model.addAttribute("actualprice",saleProductObj.getProductPrice());
		return "viewDiscountedPrice";
		// fill the code
		// TODO: 18-05-2021 there was a res variable available for both returns. Take care of that

	}
	@ModelAttribute("productList")
	public List<String> buildState(){
		List<String> list=new ArrayList<>();
		list.add("Furniture");
		list.add("Electronics");
		list.add("Fashion");
		list.add("General");
		return list;
	}
	
}
