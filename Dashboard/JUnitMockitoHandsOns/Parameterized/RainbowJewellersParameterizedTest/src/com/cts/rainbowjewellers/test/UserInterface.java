package com.cts.rainbowjewellers.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.cts.rainbowjewellers.test.RainbowJewellersParameterizedTest;
import com.cts.skeletonvalidator.SkeletonValidator;


public class UserInterface {

	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		SkeletonValidator validator = new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		Result result = JUnitCore.runClasses(RainbowJewellersParameterizedTest.class);
		
		if (result.getFailureCount() == 0) {
			System.out.println("There are No Failures...\n Test Passed...");
		} else {
			for (Failure failure : result.getFailures()) {
				System.out.println("The Test execution failed...\n" + failure.getMessage());
			}
		}
		System.out.println("Result " + result.wasSuccessful());
	}

}
