package com.cognizant.bakingo.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cognizant.bakingo.bean.Cake;

@Service
public class CakeService {
	public static Map<Integer, Cake> orderList = new HashMap<>();
	public static Map<String, Integer> flavorList = new LinkedHashMap<>();
	static int orderId = 1000;

	// Constructor to populate flavorList
	public CakeService() {
		flavorList.put("None($0)", 0);
		flavorList.put("Custard($5)", 5);
		flavorList.put("Raspberry($10)", 10);
		flavorList.put("Pineapple($5)", 5);
		flavorList.put("Cherry($6)", 6);
		flavorList.put("Apricot($8)", 8);
		flavorList.put("Buttercream($7)", 7);
		flavorList.put("Chocolate($10)", 8);
	}

	public Integer addOrder(Cake cake) {
		orderList.put(++orderId, cake);
		return orderId;
	}

}
