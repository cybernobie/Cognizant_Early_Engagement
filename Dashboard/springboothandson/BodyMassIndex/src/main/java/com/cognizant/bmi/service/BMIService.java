package com.cognizant.bmi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cognizant.bmi.bean.User;

@Service
public class BMIService {
	public static List<String> genderType = new ArrayList<String>();
	public static Map<Integer, User> userList = new HashMap<>();
	private static int userId = 1000;

	public BMIService() {
		genderType.add("Male");
		genderType.add("Female");
		genderType.add("Others");
	}

	public User addUserDetails(User user) {
		++userId;
		user.setUserId(userId);
		userList.put(userId, user);
		
		return user;
	}

	public double calculateBMI(User user) {
		return Math.ceil(user.getWeight() * 10000 / (user.getHeight() * user.getHeight()));
	}

	public String getBMIStatus(double bmi) {
		String message = "You are ";
		String status = "";
		
		if (bmi < 18.5) {
			status = "underweight";
		} else if (bmi >= 18.5 && bmi < 25) {
			status = "normal";
		} else if (bmi >= 25 && bmi <= 30) {
			status = "overweight";
		} else if (bmi > 30) {
			status = "obese";
		}
		
		return message + status;
	}
}
