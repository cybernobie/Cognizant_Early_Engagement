package com.cts.rainbowjewellers;

import java.util.Scanner;

import com.cts.rainbowjewellers.service.RainbowJewellersService;
import com.cts.skeletonvalidator.SkeletonValidator;


public class RainbowJewellers {

	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE
		SkeletonValidator validator = new SkeletonValidator();
		// CODE SKELETON - VALIDATION ENDS

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the gold in grams");
		double grams = Double.parseDouble(scanner.nextLine());
		
		RainbowJewellersService rainbowJewellersService = new RainbowJewellersService();
		
		double totalPriceOfGold = rainbowJewellersService.calculategoldprice(grams);
		
		System.out.println("Total Price of the Gold is: " + totalPriceOfGold);
	}

}
