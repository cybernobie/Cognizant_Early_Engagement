package com.cognizant.bmi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cognizant.bmi.bean.User;

@Service
@Repository // This annotation is added as userList map acts as an 'in-memory' database
public class BMIService {

	public static List<String> genderType = new ArrayList<String>();
	public static Map<Integer, User> userList = new HashMap<>();
	private static int userId = 1000;

	// Constructor for populating genderType list
	public BMIService() {
		genderType.add("Male");
		genderType.add("Female");
		genderType.add("Others");
	}

	public User addUserDetails(User user) {
		user.setUserId(++userId); // Assigning the incremented userId to the user object
		userList.put(userId, user); // Adding the modified user object to userList
		return user; // Returning the modified user object
	}

	public double calculateBMI(User user) {

		int height = user.getHeight();
		double weight = user.getWeight();

		return Math.ceil((100 * 100 * weight) / (height * height));
	}

	public String getBMIStatus(double bmi) {

		if (bmi < 18.5)
			return "underweight";

		if (bmi < 25)
			return "normal";

		if (bmi <= 30)
			return "overweight";

		return "obese";
	}

}
